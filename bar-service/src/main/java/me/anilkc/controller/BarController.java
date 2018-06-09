package me.anilkc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.anilkc.FooService;

@RestController
public class BarController {

	@Autowired
	FooService fooService;

	@GetMapping("bar")
	public Map<String, String> bar() {
		Map<String, String> json = new HashMap<>();
		json.put("message", "Bar Controller returns " + fooService.fooServe());
		return json;
	}
}
