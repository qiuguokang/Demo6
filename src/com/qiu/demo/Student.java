package com.qiu.demo;

/**
 * ��һ��student��
 * ���ԣ�name,gender,math,english,chinese;
 * ����:intro,total,avg;
 *
 */
public class Student {
	
	//����
	private String name;
	private String gender;
	private double Math;
	private double English;
	private double Chinese;
	
	//���췽��
	
	public Student(){
		
	}
	
	public Student(String name,String gender,double Math,double English,
			double Chinese){
		this.name = name;
		this.gender = gender;
		this.Math = Math;
		this.English = English;
		this.Chinese = Chinese;
		
	}
	
	//����
	
	public String intro(){
		String info = "name:"+name+"\n"
				       +"gender:"+gender+"\n"
				       +"Math:"+Math+"\n"
				       +"English:"+English+"\n"
				       +"Chinese:"+Chinese+"\n";
		System.out.print(info);
		
		return info;
		
	}
	
	public double total(){
		
		double x = Math + English + Chinese;
		
	//	System.out.println(x);
		
		return x ;
				
	}
	
	public double avg(){
		
		double avg = total()/3;
		
	//	System.out.println(avg);
		
		return avg;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public String getGender(){
		
		return gender;
	}
	
	public void setGender(String gender){
		
		this.gender = gender;
	}
	
	public double getMath(){
		
		return Math;
	}
	
	public void setMath(double Math){
		
		this.Math = Math;
	}
	
	public double getEnglish(){
		
		return English;
	}
	
	public void setEnglish(double English){
		
		this.English = English;
	}

	public double getChinese() {
		return Chinese;
	}

	public void setChinese(double chinese) {
		Chinese = chinese;
	}
	
	
	

	

}
