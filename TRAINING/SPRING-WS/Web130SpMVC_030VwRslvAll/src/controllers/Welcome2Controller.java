package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*
 * http://localhost:8081/Web130SpMVC_030VwRslvAll/app/welcome2
 * Using ResourceBundleViewResolver
 */
public class Welcome2Controller extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("WelcomePage2");
		
		return model;
	}

	
}