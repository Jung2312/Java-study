package ch01;

public class Ex3 {
	public static void main(String[] args) {
		// 기본형 8개 + 참조형 무한대(ex. String)
		
		// 정수형 4
		byte b = 10;
		short s = 10;
		int i = 20;
		long l = 10;
		
		// 실수형 2
		float f = 3.14f; // 리터럴 값에 반드시 뒤에 f / F 표기
		double d = 3.14; // 기본
		
		// 문자형 1
		char c1 = 'A';
		char c2 = '지';
		String str = "자바"; // 참조형
		
		// 불린형 1
		boolean b1 = true;
		
		// short != Short
		System.out.println(Short.MAX_VALUE);
		short s1 = (short)32768;
		
		// 크기의 변화에 대해서 명시적, 묵시적 형 변환
		int i2 = 200;
		long l2 = i2; // 묵시적 형 변환
		
		long l3 = 300;
		int i3 = (int)l3; // 명시적 형 변환
	}
}
