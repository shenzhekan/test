package com.szk.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szk.aop.pojo.Product;
import com.szk.aop.service.Service;

public class Test {
	
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	
	@org.junit.Test
	public void test() {
		
		
		
		Product product = (Product) context.getBean("product");
		
		System.out.println(product.getName()+":"+product.getCategory().getName());
		
		Service service = (Service) context.getBean("service");
		service.doSomeService();
	}
	
	@org.junit.Test
	public void test1() {
		Service service = (Service)context.getBean("service");
		service.doServiceDemo1(new Long(123));
		service.doServiceDemo2(new Long(123), "doservicedemo");
		service.Demo1(new Long(123));
		service.Demo2(new Long(123), "demo");
	}
}
