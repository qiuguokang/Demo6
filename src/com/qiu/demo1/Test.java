package com.qiu.demo1;

public class Test {
	
	public static void main(String[] args) {
		//��������������
		GrandPa pa = new GrandPa("үү", 58);
		GrandMa ma = new GrandMa("����", 56);
		Father fa = new Father("�ְ�", 32);
		Mother mo = new Mother("����", 28);
		Baby ba = new Baby("����", 4);
		
		Family f = new Family(pa, ma, fa, mo, ba);
		
		f.intro();
		f.day();
	}

}
