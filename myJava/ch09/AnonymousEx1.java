package ch09;

// 익명 클래스는 추상 클래스와 인터페이스를 사용하기 위한 목적으로 제공

abstract class MyAbst1{
	abstract void prn1();
}

interface MyInter1{
	void prn2();
	
}

class A extends MyAbst1{
	void prn1() {
		System.out.println("1 호출");
	}
}

class B implements MyInter1{

	@Override
	public void prn2() {
		System.out.println("2 호출");
	}
	
}

public class AnonymousEx1 {

	public static void main(String[] args) {
		A a = new A();
		a.prn1();
		B b = new B();
		b.prn2();
		
		new MyAbst1() { // 타입 선언
			
			@Override
			void prn1() {
				System.out.println("익명1");
			}
		}.prn1();
		
		new MyInter1() {
			
			@Override
			public void prn2() {
				System.out.println("익명2");
			}
		}.prn2();
		
	}

}
