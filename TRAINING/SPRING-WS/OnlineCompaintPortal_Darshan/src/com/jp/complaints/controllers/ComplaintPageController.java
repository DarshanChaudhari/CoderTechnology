package com.jp.complaints.controllers;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.complaints.entities.Complaint;

import com.jp.complaints.exceptions.ComplaintRequestException;
import com.jp.complaints.services.ServiceComplaintRequest;


@Controller
public class ComplaintPageController {
	
	@Autowired
	@Qualifier("complaintService")
	private ServiceComplaintRequest compService;
	
	@Autowired
	private Validator validator;
	
	@InitBinder
	private void validatorBinder() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();      
        System.out.println("Validator is set."+validator.hashCode());
	}
	
	
	@RequestMapping("homePage.cr")
	public String getRegistrationForm(Model model) {	
	Complaint compt = new Complaint();
	model.addAttribute("command",compt);
	return "HomePage";		
	
	}
	
	@RequestMapping("showStatus.cr")
	public String checkStatus() {	
	return "CheckStatus";		
	
	}

	
	
	@RequestMapping("compDetails.cr") // This is the jsp name mentioned as a link name in emplist.jsp
	public ModelAndView getcompDetails(@RequestParam("complaintId") int complaintId) {
	
		ModelAndView mAndV = new ModelAndView();
		try {
			if (complaintId > 0) {
				
			Complaint compt = compService.getComplaintDetails(complaintId);
			mAndV.addObject("compDetails",compt);
			//Set the View name for JSP
		}
			mAndV.setViewName("CheckStatus"); // This is jsp name, now in this case EmpDetails.jsp
			
		} catch (ComplaintRequestException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	
	@RequestMapping("submitComplaintForm.cr")
	public String submitComplaintForm(@ModelAttribute("command") Complaint complaint,  BindingResult result, Model model) {
		System.out.println(complaint);		
		// We have apply Validation here		
		Set<ConstraintViolation<Complaint>> violations = validator.validate(complaint);
		
		for (ConstraintViolation<Complaint> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }		
		
    	if (result.hasErrors()) {
    		model.addAttribute("msg", "Error in raising a Complaint.");    		
            return "HomePage";
        } else {
        	try {
        		complaint.setStatus("Open");
        		complaint.setPriority("High");        		
        		compService.raiseNewComplaint(complaint);
    			return "SaveSuccess";
    		} catch (ComplaintRequestException e) {
    			model.addAttribute("msg", "Error in raising a Complaint." + e.getMessage());
    			return "HomePage";
    		}
        }
		
	}
	
}