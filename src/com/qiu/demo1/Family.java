package com.qiu.demo1;

/**
 * 家庭类
 * 
 * 属性：成员；
 * 
 * 方法：一天开始，一天结束；
 *
 */
public class Family {
	
	//属性
	private Baby baby = null;
	private Father father = null;
	private Mother mother = null;
	private GrandPa grandpa = null;
	private GrandMa grandma = null;
	
	//构造方法
	
	public Family(GrandPa grandpa,GrandMa grandma,
			Father father,Mother mother,Baby baby){
		
		this.grandpa = grandpa;
		this.grandma = grandma;
		this.father = father;
		this.mother = mother;
		this.baby = baby;
		
	}
	
	//方法
	
	public void intro(){
		
		grandpa.intro();
		grandma.intro();
		father.intro();
		mother.intro();
		baby.intro();
	}
	
	private void dayStart(){
		//一天的开始
		grandpa.getUp();
		grandma.getUp();
		father.getUp();
		mother.getUp();
		baby.getUp();
	}
	
	private void work(){
		//工作
	    grandpa.work();
	    grandma.work();
	    father.work();
	    mother.work();
	    baby.work();
	}
	
	private void play(){
		//娱乐
		grandpa.play();
		grandma.play();
		father.play();
		mother.play();
		baby.play();
	}
	
	private void dayEnd(){
		//一天的结束
		grandpa.sleep();
		grandma.sleep();
		father.sleep();
		mother.sleep();
		baby.sleep();
	}
	/**
	 * 一天的动态
	 */
	public void day(){
		dayStart();
		work();
		play();
		dayEnd();
	}

}
