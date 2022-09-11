package com.rightInvesting.ip;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String getIpHome(){
		
		System.out.println("coming to first controller home");
		return "IpHome" ;
	}

	@RequestMapping("/Aboutus")
	public String getAboutUs() {
		return "AboutUs";
	}
	
	@RequestMapping("/Service")
	public String getService() {
		return "Service";
	}
	
	@RequestMapping("/Blogs")
	public String getBlogs() {
		return "Blogs";
	}
	
	
	@RequestMapping("/ContactUs")
	public String getContactUs() {
		return "ContactUs";
	}
	
	
	@RequestMapping("/Form")
	public String getCustomerForm(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);
		//System.out.println(user);
		return "GetCustomerForm";
	}
	
	@PostMapping("/formInput")
	public String AddUserDetails(@ModelAttribute User user, BindingResult String  ) throws Exception {
		
		System.out.println("User input is valid");
		
		Date date = userService.dateStamp();
		LocalTime localTime = userService.timeStamp();
		
		
		//user.setUserCreationDate(date);		//Setting up the date in the user object
		//user.setUserCreationTime(localTime);//Setting up the time in the user object
		
		user.setUserCreationDate(date);
		user.setUserCreationTime(localTime);
		
		
		userService.doSaveUser(user);
		
		
		return "SuccessfullInput";
	}
	
}
