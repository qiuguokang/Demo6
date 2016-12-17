package com.qiu.demo2;

public class Test {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker("张飞");
		
		Leader leader = new Leader("王五", worker);
		
		Manager manager = new Manager("李四", leader);
		
		Boss boss = new Boss("张三", manager);
		
		boss.work();
		boss.manager.work();
		boss.manager.leader.work();
		boss.manager.leader.worker.work();
	}
	
	

}
