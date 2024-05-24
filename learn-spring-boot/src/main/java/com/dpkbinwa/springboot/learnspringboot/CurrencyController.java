package com.dpkbinwa.springboot.learnspringboot;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses
////coures:id,name, author
//[
// {
//	 "id":1,
//	 "name":"learn aws",
//	 "author":"dpk"
// }
//]

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return configuration;
	}
}
