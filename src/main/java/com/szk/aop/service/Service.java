package com.szk.aop.service;

import org.springframework.stereotype.Component;

@Component("service")
public class Service {
	
	public void doSomeService() {
		System.out.println("service");
	}
	
	public void doServiceDemo1(Long num) {
		System.out.println("doServiceDemo1:"+num);
	}
	
	public Long doServiceDemo2(Long num,String name) {
		System.out.println("doServiceDemo2:"+num+" , "+name);
		return num;
	}
	
	public void Demo1(Long num) {
		System.out.println("Demo1:"+num);
	}
	
	public void Demo2(Long num, String name) {
		System.out.println("Demo2:"+num+" , "+name);
	}

}
