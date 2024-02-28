package com.test.call.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import formdata.entity.FormData;
@CrossOrigin("*")
@RestController
public class DemoController {
@GetMapping("/testGet")
public String testcall() {
	System.out.println("call received by spring boot ");
	return "call recieved";
}
@PostMapping("/testPost")
public String testPost(@RequestBody String data) {
	System.out.println("Post request received : "+data);
	return "Post request received : "+data;
}
@PostMapping("/testForm")
	public String testForm(@RequestBody String formData) {
		System.out.println("Form data received : "+formData);
		return "Post request received :"+formData;
	}
@PostMapping("/formData")
public String FormData(@RequestBody FormData data) {
	System.out.println("Data:"+data);
	return "received";
}

}

