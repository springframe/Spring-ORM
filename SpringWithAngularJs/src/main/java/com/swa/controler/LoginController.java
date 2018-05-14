package com.swa.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.swa.command.StudentCommand;

@Controller
@EnableWebMvc
@RequestMapping(value="home.htm")
public class LoginController {
	@GetMapping
	public String showHome(Model model)
	{
		model.addAttribute("forms",new StudentCommand());
		return "LoginForm";
		
	}

}
