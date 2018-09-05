package com.capstone.Week6Capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {

	@Autowired 
	UserRepository userRepo;
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		
		return new ModelAndView("welcome");
	}
}
