package com.szk.aop.Iproxy;

public class AddProxy implements IAddNum {

	private RealAddClass RealAddClass;
	
	public AddProxy(RealAddClass realAddClass) {
		this.RealAddClass = realAddClass;
	}
	
	@Override
	public void add(){
		System.out.println("Before");
		try {
			RealAddClass.add();
		}catch(Exception e) {
			System.out.println("exception:"+e.getMessage());
			throw e;           //	因为代理对象不会改变正真的对象，所以还是要把异常抛出
		}finally {
			System.out.println("After");
		}
	}

}
