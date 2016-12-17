package com.qiu.demo;

public class TestMyClass {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("张三", "男", 80, 67, 88);
		Student s2 = new Student("张飞", "男", 59, 48, 65);
		Student s3 = new Student("李四", "男", 92, 72, 79);
		Student s4 = new Student("小红", "女", 65, 89, 94);
		Student s5 = new Student("小丹", "女", 87, 92, 96);
		
		Student[] students = {s1,s2,s3,s4,s5};
		
		MyClass myClass = new MyClass("1班", "王老师", students);
		
		myClass.intro();
		System.out.println("total:"+myClass.total());
		myClass.avg();
		myClass.max();
		myClass.min();
		myClass.sort();
	}

}
