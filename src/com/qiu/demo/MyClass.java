package com.qiu.demo;

/**
 * 写一个班级类；
 * 属性:name, boss,student[];
 * 方法:介绍：intro(),最大值：max(),最小值：min(),
 *    总分：total(),平均分：avg(), 排序sort(),
 */

public class MyClass {
	
	//属性
	private String name;
	private String Boss;
	private Student[] students;
	
	//构造方法
	
	public MyClass(){
		
	}
	
	public MyClass(String name,String Boss,Student[] students){
		
		this.name = name;
		this.Boss = Boss;
		this.students = students;
	}
	
	//方法
	
	public void intro(){
		//结果
		String info = "";
		
		//处理
		info = "name:"+name+"\n"
				+"Boss"+Boss+"\n";
		//输出
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
