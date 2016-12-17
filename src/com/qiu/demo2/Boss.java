package com.qiu.demo2;

public class Boss {
	
	//属性
	private String name ="";
	public Manager manager = null;
	
	
	//构造方法
	
	public Boss(String name,Manager manager){
		this.name = name;
		this.manager = manager;
	}
	
	//方法
	
	public void work(){
		
		System.out.println("张三说："+"李四，这件事情你给下面说一下办了");
		
	}

}
