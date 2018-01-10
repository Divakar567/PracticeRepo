package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.HystrixService;

@SpringBootApplication
@RestController
@EnableCircuitBreaker
public class SpringHystrixDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixDemoApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	HystrixService hystrixService;
	
	@RequestMapping(value="/check",method=RequestMethod.GET)
	public String checkCircuit() {
		return hystrixService.circuitStatus();
	}
}
