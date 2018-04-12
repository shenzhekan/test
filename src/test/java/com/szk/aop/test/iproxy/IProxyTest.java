package com.szk.aop.test.iproxy;


import org.junit.Test;

import com.szk.aop.Iproxy.AddProxy;
import com.szk.aop.Iproxy.IAddNum;
import com.szk.aop.Iproxy.RealAddClass;


public class IProxyTest {
	
	/**
	 * 基于接口的代理实现
	 * 1.定义一个接口
	 * 2.目标对象实现接口
	 * 3.代理对象实现接口，并在构造函数中传入目标对象
	 * 4.在测试时：接口引用获得实例化代理对象（传入目标对象）
	 */
	@Test
	public void testIProxy() {
		IAddNum addNum = new AddProxy(new RealAddClass());
		addNum.add();
	}
	

}
