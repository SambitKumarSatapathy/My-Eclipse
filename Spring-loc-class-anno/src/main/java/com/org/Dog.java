package com.org;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	static {
		System.out.println("Class Loading");
	}
	{
		System.out.println("Object Created");
	}

	@PostConstruct
	public void init() {
		System.out.println("Init Method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy Method");
	}
}
