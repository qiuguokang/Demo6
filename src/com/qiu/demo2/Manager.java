package com.qiu.demo2;

public class Manager {
	
	//����
	private String name ="";
	public Leader leader = null;
	
	
	//���췽��
	
	public Manager(String name,Leader leader){
		this.name = name;
		this.leader = leader;
	}
	
	//����
	
	public void work(){
		
		System.out.println("����˵��"+"���壬������½�����û�����");
	}
}
