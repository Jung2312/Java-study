package ch09;

/*중첩 클래스
1. 클래스 안에 선언(100%)
2. 클래스 안에 선언이지만 static(1%)
3. 메소드 안에 클래스 선언(10%)
4. 메소드 안에 선언을 하고 동시에 익명 클래스(100%)
ps. 메소드 안에 메소드 선언은 불가 < jsp
*/
interface MyInter{
	void prn();
}

class Outer1{
	class Inner1{}
	static class Inner2{}
	void method() {
		class Inner3{}
		new MyInter() {
			
			@Override
			public void prn() {
			}
		};
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		
	}

}
