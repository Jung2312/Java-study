package ch08;

interface Interface2{
	int a = 10; // 인터페이스는 일반 필드 선언 불가, 자동으로 static final, 값 설정 필수
	void prn(); // 구현부 소유 불가
}

// 인터페이스 끼리 상속 가능, 다중 상속 가능
interface Interface2_1 extends Interface2{
	void prn2();
}

class MyClass2 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn2() {
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
	}
}
