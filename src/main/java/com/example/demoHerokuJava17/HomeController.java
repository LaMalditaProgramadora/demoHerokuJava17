package com.example.demoHerokuJava17;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goCustomers(Model model) {
		return "home";
	}

}