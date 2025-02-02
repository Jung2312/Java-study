package ch06;

class Car2{
	
	// new 연선자로 객체를 만들면 필드가 먼저 생성되므로 메소드가 위에 있어도 오류 없음
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
	
	String carName;
	int velocity;
	String carColor;
}

public class CarEx2 {

	public static void main(String[] args) {
		int a = 10;
		int b = a; 
		a = 20;
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		
		c1 =  c2;
		
		System.out.println(c1);
		System.out.println(c2);
		
		for (int i = 0; i < 10; i++) {
			Car2 c3 = new Car2();
			System.out.println(c3);
		}
		
		// 객체를 생성하는 이유 : 필드와 메소드 사용
		String str = new String("sadsda");
		System.out.println(str.toUpperCase());
		
		// 객체 생성없이 클래스명으로 메소드 및 필드
		// 32를 2진수로 출력하라
		System.out.println(Integer.toBinaryString(32));
		
		
	}

}
