package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

	public DataController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method=RequestMethod.GET,value="/springapp")
	public String data(){
		return "home2";
	}
	@RequestMapping(method=RequestMethod.POST,value="/addition")
	@ResponseBody
	public int getData(@RequestParam int firstNumber, @RequestParam int secondNumber){
		return firstNumber+secondNumber;
	}

}
