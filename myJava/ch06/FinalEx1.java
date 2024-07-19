package ch06;

import java.awt.Label;

// 클래스 : ex. Math, System, String
// 변수 : 상수 선언
// 메소드 : 오버라이딩 불가 메소드


class Final1{
	
}

class Final2 extends Final1{
	
}

class Final3{
	// 상수 : 한 번 정해진 값은 변경이 불가능함, 초기화 무조건 필요, 변수명 자체가 의미를 가짐
	static final int KIA = 1; // 대부분 대문자로 표기
	//ex. Math.PI, Color.red
	
	Label label1 = new Label("하하", 1);
	Label label2 = new Label("하하", Label.CENTER);
	
	void prn(final int b /* 매개변수상수 */) {
		// b = 10;(오류 : 매개변수로 받은 값을 계속 사용해야 함, 변경 불가) 
		
		// 지역 변수는 반드시 초기화가 필요하고 선언되어있지 앟으면 사용하는 시점에 컴파일 오류
		int c = 0;
		System.out.println(c);
		final int d = 10;
		
	}
	
}

class Final4{
	void prn1(){
		
	}
	final void prn2(){
		
	}
}

class Final5 extends Final4{
	void prn1(){
		
	}
	/*
	 * void prn2(){ // final은 메소드 오버라이딩 불가능 }
	 */
}

public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
