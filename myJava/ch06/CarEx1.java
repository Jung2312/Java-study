// 도메인 뒤로 선언 : naver.com -> package com.naver.String

package ch06;

// ch06.Car1
// 클래스 : 객체를 만드는 틀
class Car1{
	String carName;
	int velocity;
	String carColor;
	
	void speedUP() {
		velocity++;
	}
	
	void speedDown() {
		velocity--;
		if(velocity < 0) {
			velocity = 0;
		}
	}
	
	void stop() {
		velocity = 0;
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		
		c1.velocity = 20;
		c1.carName = "소나타";
		c1.carColor = "은색";
		
		System.out.println(c1.carColor);
		System.out.println(c1.carName);
		System.out.println(c1.velocity);
	}

}
