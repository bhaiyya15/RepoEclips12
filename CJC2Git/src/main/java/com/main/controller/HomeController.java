package com.main.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	
	@Autowired
	RestTemplate rt;
	
	
	@RequestMapping("/getcon")
	public List getdata()
	{
		
		
		List rr = rt.getForObject("http://localhost:9091/getData1", List.class);
		List rr1 = rt.getForObject("http://localhost:9092/getData", List.class);
		
		List al=new ArrayList<>();
		al.add(rr);
		al.add(rr1);
		
		
		
		return al;
		
	}

}
