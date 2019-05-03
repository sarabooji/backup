package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping(method=RequestMethod.GET,value="/")
	public String homepage() {
		return "home";
	}

	@RequestMapping(method=RequestMethod.POST, value="/add")
	@ResponseBody
	public int performAddition(@RequestParam int firstNumber, @RequestParam int secondNumber) {
		return firstNumber+secondNumber;
	}

}
