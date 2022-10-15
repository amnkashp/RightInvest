package com.rightInvesting.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/signin")
	public String loginpage() {
		
		return "signin";
	}
    /*
   @RequestMapping(value="/admin", method = RequestMethod.GET)
   public ModelAndView visitAdmin() {
       ModelAndView model = new ModelAndView("admin");
       model.addObject("title", "Admministrator Control Panel");
       model.addObject("message", "This page demonstrates how to use Spring security.");
        
       return model;
   }
	*/
}
