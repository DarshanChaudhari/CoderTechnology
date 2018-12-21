package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*
 * http://localhost:8081/Web130SpMVC_030VwRslvAll/app/welcome1
 * Using XMLViewResolver
 */
public class Welcome1Controller extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("WelcomePage1");
		
		return model;
	}
}