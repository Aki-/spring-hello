package com.deltabee.hellospring.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deltabee.hellospring.models.HelloMessage;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method= RequestMethod.GET)
	@ResponseBody
	public String hello(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		
		if((name == null)||(name == ""))
		{
			name = "World";
		}
		
		
		return "<H1>"+HelloMessage.getMessage(name)+"</H1>";
	}

}
