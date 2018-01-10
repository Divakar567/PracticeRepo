package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient("ribbon-client")
public interface FeignClientDemo {
	@RequestMapping(value="/word",method=RequestMethod.GET)
	String word();
}
