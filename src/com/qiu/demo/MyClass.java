package com.qiu.demo;

/**
 * дһ���༶�ࣻ
 * ����:name, boss,student[];
 * ����:���ܣ�intro(),���ֵ��max(),��Сֵ��min(),
 *    �ܷ֣�total(),ƽ���֣�avg(), ����sort(),
 */

public class MyClass {
	
	//����
	private String name;
	private String Boss;
	private Student[] students;
	
	//���췽��
	
	public MyClass(){
		
	}
	
	public MyClass(String name,String Boss,Student[] students){
		
		this.name = name;
		this.Boss = Boss;
		this.students = students;
	}
	
	//����
	
	public void intro(){
		//���
		String info = "";
		
		//����
		info = "name:"+name+"\n"
				+"Boss"+Boss+"\n";
		//���
		System.out.println(info);
		
		for (Student s:students) {
			s.intro();
		}
	}
	
	public void max(){
		
		double max = 0;
		
		for(Student s : students){
			if( max < s.total()){
				max = s.total();
			}	
		}
	}
	
	public void min(){
		
		double min = 300;
		
		for(Student s : students){
			if( min > s.total()){
				min = s.total();
			}
			
		}
	}
	
	public double total(){
		
		double total = 0;
		for(Student s : students){
			
			total += s.total();
		}
		
	//	System.out.println("total:"+total);
		
		return total;
	}
	
	public void avg(){
		
		double avg = 0;
		
		avg = total()/students.length;
		
		System.out.println("avg:"+avg);
		
	}
	
	public void sort(){
		
//		for(Student s : students){
//			System.out.println("name:"+s.getName()+"total:"+s.total());
//		}

		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-i-1; j++) {
				if(students[j].total() < students[j+1].total()){
					Student temp;
					temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
			}
			
		}
		for (Student s : students){
			
			System.out.println("name:"+s.getName()+"total:"+s.total());
			
		}
		
	}

}
