package com.example.demo.controllers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    
    @RequestMapping("hello")
	public String hello(Model model) {
        model.addAttribute("msg", "Hello world!");
		return "hello";
	}

}