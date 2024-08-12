package hn.com.jf.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
	
	@GetMapping("/app/foo")
	public Map<String, Object> foo() {
		Map<String, Object> json = new HashMap<>();
		json.put("message", "Hola mundo con Spring Boot API REST");
		json.put("date", new Date());
		
		return json;
	}
	

}
