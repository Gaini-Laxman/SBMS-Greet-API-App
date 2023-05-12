package com.klinnovations.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsgController {

	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String port = env.getProperty("server.port");

		return "Good Evening(" + port + ")";
	}

	//-Dserver.port=8081
	
}
