package ch06;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JFrame;

class Super3 extends Object {
	int a;

	public Super3() {
		super();     /*
					 * super() : 생략되어있음, 반드시 생성자 첫번째 라인에 위치 -> 내 객체가 생성되기 전에 Object 객체부터 생성되어야 함,
					 * Object(슈퍼클래스) <-> Super3(서비클래스)
					 */
		
		System.out.println("Super3 생성자");
	}
}

class Sub3 extends Super3{
	public Sub3() {
		super(); // -> Super3 
		System.out.println("Sub3 생성자");
	}
}

public class ConstructorEx3 extends Super3 {

	public static void main(String[] args) {
		/*
		 * Super3 c1 = new Super3(); ConstructorEx3 c2 = new ConstructorEx3(); c2.a =
		 * 10; System.out.println(c1.a); System.out.println(c2.a);
		 */
		Sub3 s3 = new Sub3();
		Frame f = new Frame();
	}

}
