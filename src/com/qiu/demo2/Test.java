package com.qiu.demo2;

public class Test {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker("�ŷ�");
		
		Leader leader = new Leader("����", worker);
		
		Manager manager = new Manager("����", leader);
		
		Boss boss = new Boss("����", manager);
		
		boss.work();
		boss.manager.work();
		boss.manager.leader.work();
		boss.manager.leader.worker.work();
	}
	
	

}
