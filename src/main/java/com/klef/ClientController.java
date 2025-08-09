package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/")
	public String home() {
		return "CI/Cd and Cloud DevOps";
	}
	@GetMapping("/demo")
	public String demo() {
		return "Jenkins Demo";
	}
	@GetMapping("/tes")
	public String test() {
		return "Deploy Spring Boot Using Jenkins";
	}

}
