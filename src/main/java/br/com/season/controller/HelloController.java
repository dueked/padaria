package br.com.season.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	@RequestMapping("/GIT")
	public String hello2(){
		return "git2";
	}
}
