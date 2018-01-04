package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@Value("${author-name}")
	String author;
	
	@Value("${descritpion}")
	String desc;
	
	@RequestMapping(value="/author", method=RequestMethod.GET)
	public String giveAuthor() {
		return "Auther Name: "+author+"\nDescription: "+desc;
	}
}
