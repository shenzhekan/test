package com.szk.aop.Iproxy;

public class RealAddClass implements IAddNum {

	@Override
	public void add() {
		System.out.println("RealAddClass实现add方法");
	}

}
