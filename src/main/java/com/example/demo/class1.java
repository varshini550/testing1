package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class class1 {
	@GetMapping("/home")
	public String disk() {
		return "welcome to cse";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "welcome to cse";
	}

}
