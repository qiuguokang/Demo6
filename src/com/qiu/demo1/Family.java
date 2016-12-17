package com.qiu.demo1;

/**
 * ��ͥ��
 * 
 * ���ԣ���Ա��
 * 
 * ������һ�쿪ʼ��һ�������
 *
 */
public class Family {
	
	//����
	private Baby baby = null;
	private Father father = null;
	private Mother mother = null;
	private GrandPa grandpa = null;
	private GrandMa grandma = null;
	
	//���췽��
	
	public Family(GrandPa grandpa,GrandMa grandma,
			Father father,Mother mother,Baby baby){
		
		this.grandpa = grandpa;
		this.grandma = grandma;
		this.father = father;
		this.mother = mother;
		this.baby = baby;
		
	}
	
	//����
	
	public void intro(){
		
		grandpa.intro();
		grandma.intro();
		father.intro();
		mother.intro();
		baby.intro();
	}
	
	private void dayStart(){
		//һ��Ŀ�ʼ
		grandpa.getUp();
		grandma.getUp();
		father.getUp();
		mother.getUp();
		baby.getUp();
	}
	
	private void work(){
		//����
	    grandpa.work();
	    grandma.work();
	    father.work();
	    mother.work();
	    baby.work();
	}
	
	private void play(){
		//����
		grandpa.play();
		grandma.play();
		father.play();
		mother.play();
		baby.play();
	}
	
	private void dayEnd(){
		//һ��Ľ���
		grandpa.sleep();
		grandma.sleep();
		father.sleep();
		mother.sleep();
		baby.sleep();
	}
	/**
	 * һ��Ķ�̬
	 */
	public void day(){
		dayStart();
		work();
		play();
		dayEnd();
	}

}
