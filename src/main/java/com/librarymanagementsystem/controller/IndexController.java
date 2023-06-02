package com.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

	@GetMapping("/login")
	public String login(HttpServletResponse res) {
		System.out.println("asdsa");

		res.setHeader("cookieasdsad", "adsasdsadasd");
		return "login";
	}

}
