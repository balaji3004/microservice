package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class webController {

	@RequestMapping("/hi")
	public @ResponseBody String hiThere()
	{
		return "hello world";
	}
}
