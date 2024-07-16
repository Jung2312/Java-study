package ch01;

public class Ex5 {

	public static void main(String[] args) {
		// 데이터 타입 : 기본형 8개 + 참조형 : SUN + 외부Lib + 현재 선언한 클래스 타입
		
		int a = 10;
		
		// 클래스 : 객체를 만드는 틀 -> 필드(개체 속성) 및 메소드(객체 기능)
		// String class : 문자열을 객체화 시킨 클래스 ex. lenght()
		// Math class : 수식을 객체화 ex. PI(원주율 필드), 올림, 내림, 반올림, 절대값
		String str = "rtertef";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		
		// 반지름이 5인 원의 넓이를 구해라
		System.out.println(Math.PI * 5 * 5);
	}

}
