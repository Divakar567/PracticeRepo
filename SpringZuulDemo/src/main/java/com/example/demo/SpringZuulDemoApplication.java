package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.filter.SimpleFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulDemoApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
