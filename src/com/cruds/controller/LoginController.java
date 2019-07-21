package com.cruds.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String goToLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateLogin(@RequestParam("userName") String uname, @RequestParam("password")String pwd, HttpSession session, RedirectAttributes redirectAttributes)
	{
		if(uname.equals("admin") && pwd.equals("admin"))
		{
			session.setAttribute("USER_NAME", uname);
			return "admin";
		}
		else if(uname.equals("stud") && pwd.equals("stud"))
		{
			session.setAttribute("USER_NAME", uname);
			return "stud";
		}
		else
		{
			redirectAttributes.addAttribute("ERROR","Invalid Credentials");
			return "redirect:login.html";
	
		}
	}
}
