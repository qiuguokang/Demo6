package com.qiu.demo2;

public class Leader {
	
	//����
	private String name = "";
	public Worker worker = null;
	
	//���췽��
	
	public Leader(String name,Worker nember){
		
		this.name = name;
		this.worker = nember;	
	}
	
	//����
	
	public void work(){
		System.out.println("����˵��"+"�ŷɣ��Ͻ��ɻ�ȥ");
	}
}
