package com.klinnovations.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsgController {

	
	@GetMapping("/greet")
	public String  getGreetMsg() {

		return "Good Evening";
	}

}
