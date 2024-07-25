package ch07;

// 추상 클래스 간 상속 가능 -> 추상메소드는 구현하지 않아도 됨
abstract class Abstract2 {
	abstract void prn1(int a);
}

abstract class Abstract2_1 extends Abstract2 {
	abstract void prn2(int a);
}

class Normal2 extends Abstract2_1 {

	@Override
	void prn2(int a) {
	}

	@Override
	void prn1(int a) {
	}

}



public class AbstractEx2 {

	public static void main(String[] args) {
		
	}

}
