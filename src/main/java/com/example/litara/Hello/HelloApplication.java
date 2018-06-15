package com.example.litara.Hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloApplication {

	@RequestMapping("/")
	String home(){
		return "Hello My First SpringBoot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
