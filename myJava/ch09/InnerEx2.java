package ch09;

class Outer2 {
	int a = 22; // 외부 클래스 필드

	void prn1() {
		System.out.println(a);
		//prn2(); // 내부 클래스 메소드 및 필드 직접 호출 불가능
		
		// 내부 클래스는 외부 클래스와 밀접한 관계로 만들어졌기 때문에 사용 가능
		Inner2 in = new Inner2();
		
	}

	// 메소드는 없는 클래스의 많은 기능이 있음(상속, 독립적인 객체)
	class Inner2 {
		int b = 23;

		void prn2() {
			prn1(); // 외부 클래스 메소드 및 필드 직접 호출 가능
			System.out.println(b + a);
		}
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		// 제3의 클래스에서 내부 클래스 사용하는 방법 -> 거의 사용 안함
		Outer2 out = new Outer2();
		Outer2.Inner2 in = out.new Inner2();
		in.b = 45;
		in.prn2();
	}

}
