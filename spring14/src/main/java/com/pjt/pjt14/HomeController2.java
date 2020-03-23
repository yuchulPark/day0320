package com.pjt.pjt14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController2 {
	@RequestMapping("/")
	public String home2(Model model) {
		System.out.println(" --- home2() method ---");
		model.addAttribute("key","home2 value");
		return "home2";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		System.out.println(" --- login() method ---");
		model.addAttribute("key","login value");
		return "login";
	}
}
