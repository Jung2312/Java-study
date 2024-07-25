package ch07;

import java.awt.Component;

// 추상클래스 : 추상적으로 존재하는 클래스이고 타입으로만 사용 가능
abstract class Abstract1{
	// 추상 메소드 : 일반적으로 추상 클래스는 추상 메소드를 가짐, 반드시 선언할 필요는 없음
	abstract void prn();
	
	
}

class Normal1 extends Abstract1{
	@Override
	void prn() {
		// 무조건(강제적) 오버라이딩 해야함
	}
}

// 추상 클래스는 반드시 추상 메소드를 가질 필요는 없다
class MComponent extends Component{ // Component = 추상클래스
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		Abstract1 at;// new Abstract1(); 오류남, 참조형 타입으로만 존재
		at = new Normal1();
		
	}

}
