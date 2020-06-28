package com.njb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public Map<String, String> testMethod() {
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("Hello", "World");
		return obj;
	}
}
