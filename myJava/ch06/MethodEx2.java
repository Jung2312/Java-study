package ch06;

class Method2{
	
	Method2() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 메소드 오버 로딩 : 동일 클래스 내에 동일한 메소드 명으로 매개 변수 개수와 타입을 달리 하는 것 void prn(int a) {
	 * System.out.println(a); } void prn(int a, int b) { System.out.println(a); }
	 */
	
	//가변 인수
	void prnf(int...arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	/*
	 * void prn(T a) { System.out.println(a); }
	 * 
	 * void prn(T a, T b) { System.out.println(a +" " + b); }
	 */
}

public class MethodEx2 {

	public static void main(String[] args) {
		Method2 m1 = new Method2();
		m1.prnf(1,2,3,4);
		m1.prnf(1,2,3,4);
		
		// 모든 자바 기본형 타입을 Wrapper 클래스 타입으로 자동 변환
		System.out.printf("%s %d %f", "문자", 22, 2.2);
	}

}
