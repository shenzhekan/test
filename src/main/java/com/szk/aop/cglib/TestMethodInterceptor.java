package com.szk.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用Cglib代理方式来实现拦截
 * @author admin
 *
 */
public class TestMethodInterceptor implements net.sf.cglib.proxy.MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("before in cglib");
		Object result = null;
		try {
			//	使用反射机制来获取方法
			result = proxy.invokeSuper(obj,args);
		}catch(Exception e) {
			System.out.println("get ex:"+e.getMessage());
			throw e;
		}finally {
			System.out.println("after in cglib");
		}
		return result;
	}

}
