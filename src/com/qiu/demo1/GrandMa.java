package com.qiu.demo1;

/**
 * Father��
 * 
 * ���ԣ� ���������䣻
 * 
 * ���� ���𴲣����������֣�˯����
 *
 */
public class GrandMa {
	
	//����
	
	private String name = "";
	private int age = 0 ;
	
	//���췽��
	
	public GrandMa(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public void getUp(){
		
		System.out.println(getName()+"����");
	}
		
	public void work(){
		
		System.out.println(getName()+"����");
		
	}
	
	public void play(){
		
		System.out.println(getName()+"���㳡��");
		
	}
	
	public void sleep(){
		
		System.out.println(getName()+"˯����");
	
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
