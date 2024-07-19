package ch06;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JFrame;

class This5{
	int a;
	String str;
	
	public This5() {
		
	}
	public This5(int a) {
		this.a = a;
	}
	public This5(String str) {
		this.str = str;
	}
	public This5(int a, String str) {
		this.str = str;
		this.a = a;
	}
}

class This6{
	int a;
	String str;
	
	public This6() {
		// this() 생성자 호출 시 super() 없음 -> 동일한 Object 클래스가 생성되기 때문
		this(10,"익명"); // 생성자의 첫번째 라인에 선언되어야 함
	}
	
	public This6(String str) {
		// this() 생성자 호출 시 super() 없음 -> 동일한 Object 클래스가 생성되기 때문
		this(10,str); // 생성자의 첫번째 라인에 선언되어야 함
	}
	
	This6(int a){
		// this() 생성자 호출 시 super() 없음 -> 동일한 Object 클래스가 생성되기 때문
		this(a,"익명"); // 생성자의 첫번째 라인에 선언되어야 함
	}
	
	public This6(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}
	
}


public class ConstructorEx5{

	public static void main(String[] args) {
		
	}

}
