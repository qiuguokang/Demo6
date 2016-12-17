package com.qiu.demo2;

public class Leader {
	
	//属性
	private String name = "";
	public Worker worker = null;
	
	//构造方法
	
	public Leader(String name,Worker nember){
		
		this.name = name;
		this.worker = nember;	
	}
	
	//方法
	
	public void work(){
		System.out.println("王五说："+"张飞，赶紧干活去");
	}
}
