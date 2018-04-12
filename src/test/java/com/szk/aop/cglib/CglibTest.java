package com.szk.aop.cglib;

import java.lang.reflect.Method;

import org.junit.Test;

import com.szk.aop.Iproxy.IAddNum;
import com.szk.aop.Iproxy.RealAddClass;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib代理方式来拦截
 * @author admin
 *
 */
public class CglibTest {

	@Test
	public void test() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealAddClass.class);   //实际业务对象
		enhancer.setCallback(new TestMethodInterceptor());   // 要
		IAddNum addNum = (IAddNum)enhancer.create();
		addNum.add();
	}
}
