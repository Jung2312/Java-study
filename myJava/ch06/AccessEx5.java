package ch06;

import java.awt.Frame;

import ch06_1.AccessEx4;


public class AccessEx5 extends AccessEx4{

	public static void main(String[] args) {
		AccessEx4 ac = new AccessEx4();
		//ac.b = 10; protected : 다른 패키지의 경우 접근 불가 
		ac.c = 20;
	}

}
