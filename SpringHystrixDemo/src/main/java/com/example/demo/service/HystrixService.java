package com.example.demo.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixService {
	
	@Autowired
	RestTemplate restTemplate=new RestTemplate();
	
	@HystrixCommand(fallbackMethod= "serverStatus")
	public String circuitStatus() {
		URI uri=URI.create("http://localhost:8020/");
		String name=restTemplate.getForObject(uri, String.class);
		return name+"'s Status: Success";
	}
	
	public String serverStatus() {
		return "Sorry! Server is Down";
	}
}
