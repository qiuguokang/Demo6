package com.qiu.demo1;

/**
 * Father类
 * 
 * 属性： 姓名，年龄；
 * 
 * 方法 ：起床，工作，娱乐，睡觉；
 *
 */
public class GrandPa {
	
	//属性
	
	private String name = "";
	private int age = 0 ;
	
	//构造方法
	
	public GrandPa(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public void getUp(){
		
		System.out.println(getName()+"起床了");
	}
		
	public void work(){
		
		System.out.println(getName()+"送孩子去幼儿园");
		
	}
	
	public void play(){
		
		System.out.println(getName()+"打麻将");
		
	}
	
	public void sleep(){
		
		System.out.println(getName()+"睡觉了");
	
	}
	
	public void intro(){
		
		System.out.println("name:"+getName()
				           +",age:"+getAge());
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

