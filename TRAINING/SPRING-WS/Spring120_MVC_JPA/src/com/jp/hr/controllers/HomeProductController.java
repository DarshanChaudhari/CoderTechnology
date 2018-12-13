package com.jp.hr.controllers;

import java.util.ArrayList;
import java.util.List;
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

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceProduct;

// http://localhost:8080/Spring110_MVCBasics/homePage.do
// We have to use Annotation as a controller


/*
 * @Controller : A kind of @Component to declare a SpringMVC controllers.
 * @RequestMapping : To Map a controlling method to the URL.
 * @RequestParam : To take single QueryString or FormData field value.
 * 
 * Multi-Action Controllers methods over here are called as Multi-Action Controller 
 */
@Controller
public class HomeProductController {
	
	@Autowired
	@Qualifier("productService")
	private ServiceProduct prodService;
	
	@Autowired
	private Validator validator;
		
	
	@InitBinder
	private void validatorBinder() {
		// This is Java Service Request JSR 303 validator
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();      
        System.out.println("Validator is set."+validator.hashCode());
	}
	
	@RequestMapping("homePage.fin")  // This is the url(command)  for getHomePage method 
	public String getHomePage() {
		System.out.println("In getHomePage()");		
		return "HomePage";
		
	}
	@RequestMapping("prodList.fin") // This is the jsp name mentioned as a link name in homePage.jsp
	public ModelAndView getprodList() {
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Product> prodList = prodService.getProdList();
			mAndV.addObject("prodList",prodList);			
			mAndV.setViewName("ProdList");
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	
	@RequestMapping("prodDetails.fin") // This is the jsp name mentioned as a link name in emplist.jsp
	public ModelAndView getprodDetails(@RequestParam("id") int prodId) {
		System.out.println(prodId);
	ModelAndView mAndV = new ModelAndView();
		try {
			Product prod = prodService.getProdDetails(prodId);
			System.out.println(prod);
			mAndV.addObject("prodDetails",prod);
			//Set the View name for JSP
			mAndV.setViewName("ProductDetails"); // This is jsp name, now in this case EmpDetails.jsp
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	
	@RequestMapping("productForm.fin")
	public String getRegistrationForm(Model model) {
			// Define Commond Object
		Product prod = new Product();
		model.addAttribute("command",prod);
		return "EntryProduct";		
	}
	
	@RequestMapping("submitProductData.fin") // This is the jsp name mentioned as a link name in emplist.jsp
	public String submitRegistrationData(@ModelAttribute("command") Product prod,  BindingResult result, Model model) {
		System.out.println(prod);		
		// We have apply Validation here		
		Set<ConstraintViolation<Product>> violations = validator.validate(prod);
		
		for (ConstraintViolation<Product> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }		
		
    	if (result.hasErrors()) {
    		model.addAttribute("msg", "Error in entry.");    		
            return "EntryProduct";
        } else {
        	try {
        		prodService.insertNewRecord(prod);
    			return "SaveSuccess";
    		} catch (HrException e) {
    			model.addAttribute("msg", "Insert failed." + e.getMessage());
    			return "EntryProduct";
    		}
        }
		
	}
}
