package com.sopra.swag.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResources {
	@GetMapping
	public String hello() {
		return "hello";
	}
	@PostMapping
	public String helloPost(@RequestBody final String hello) {
		return "hello";
	}
	@PutMapping
	public String helloPut(@RequestBody final String hello) {
		return "hello";
	}
	

}
