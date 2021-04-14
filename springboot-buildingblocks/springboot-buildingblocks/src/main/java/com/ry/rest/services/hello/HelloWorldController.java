package com.ry.rest.services.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("getUserDetails")
	public UserDetails getUserDetails(){
		UserDetails ob = new UserDetails("fst", "lst", "pune");
		return ob;
	}
}
