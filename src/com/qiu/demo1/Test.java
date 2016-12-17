package com.qiu.demo1;

public class Test {
	
	public static void main(String[] args) {
		//单层类与类的组合
		GrandPa pa = new GrandPa("爷爷", 58);
		GrandMa ma = new GrandMa("奶奶", 56);
		Father fa = new Father("爸爸", 32);
		Mother mo = new Mother("妈妈", 28);
		Baby ba = new Baby("宝宝", 4);
		
		Family f = new Family(pa, ma, fa, mo, ba);
		
		f.intro();
		f.day();
	}

}
