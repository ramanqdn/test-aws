package com.boot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(value = "message", method = RequestMethod.GET)
	String getMessage () {
		return "Hellow from AWS";
	}
}
