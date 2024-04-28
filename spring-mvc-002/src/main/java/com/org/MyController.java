package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("msg")
	@ResponseBody
	public String getMsg() {
		return "print.jsp";
		//return"<html><body><h1>HIIIII</h1></body></html>";
	}
	@RequestMapping("msg")
	public String printMsg() {
		return"print.jsp";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String addNumber(@RequestParam double n1,@RequestParam double n2) {
		return "<html><body><h1>SUM IS :"+(n1+n2)+"</h1></body></html>";
	}
}
