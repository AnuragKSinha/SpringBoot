package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.service.HelloWorldService;

@Controller
public class GreetingController {
	private HelloWorldService helloworldservice;
	@Autowired
	public void setHelloWorldService(HelloWorldService helloworldservice){
		this.helloworldservice=helloworldservice;
	}
	public String sayHello(){
		String greeting=helloworldservice.getGreeting();
		System.out.println(greeting);
		return greeting;
	}

}
