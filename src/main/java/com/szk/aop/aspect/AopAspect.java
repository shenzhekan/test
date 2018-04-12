package com.szk.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAspect {

	/*@Around(value="execution(* com.szk.aop.service.Service.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("start log:"+joinPoint.getSignature().getName());
		Object object =  joinPoint.proceed();
		System.out.println("end log:"+joinPoint.getSignature().getName());
		return object;
	}*/
	
	@Pointcut("this(com.szk.aop.service.Service)")
	public void serviceDemo() {}
	
	/*@Before("serviceDemo()")
	public void beforeDemo() {
		System.out.println("before");
	}*/
	
	//	匹配了service包下的Service类中方法名包含“Service”的方法，并且第一个参数是Long类型的方法,返回值为任意类型
	@Pointcut("execution(* com.szk.aop.service.Service.*Service*(Long,*))")
	public void executionDemo() {}
	
	@Before("executionDemo()")
	public void beforeExecDemo() {
		System.out.println("before,get args:");
	}
	
}
