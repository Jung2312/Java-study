package ch06;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Super{
	String name;
	void prn() {
		System.out.println(name);
	}
}

public class ThisEx3 extends Super{
	int name;
	@Override
	void prn() {
		System.out.println(super.name); // 은닉 변수
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Super sub = new Super();
		sub.prn();
		
		// 문제 해당 위치에서 sub 클래스의 this, super라는 키워드가 사용 가능한가? 불가능
	}

}
