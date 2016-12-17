package com.qiu.demo2;

public class Manager {
	
	//属性
	private String name ="";
	public Leader leader = null;
	
	
	//构造方法
	
	public Manager(String name,Leader leader){
		this.name = name;
		this.leader = leader;
	}
	
	//方法
	
	public void work(){
		
		System.out.println("李四说："+"王五，把这个事交给你没问题吧");
	}
}
