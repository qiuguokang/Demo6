package com.qiu.demo2;

public class Boss {
	
	//����
	private String name ="";
	public Manager manager = null;
	
	
	//���췽��
	
	public Boss(String name,Manager manager){
		this.name = name;
		this.manager = manager;
	}
	
	//����
	
	public void work(){
		
		System.out.println("����˵��"+"���ģ���������������˵һ�°���");
		
	}

}
