package ch01;

// 자바의 인코딩은 utf-8
public class Ex4 {

	public static void main(String[] args) {
		출력("잠와");
		
		char a1 = 'A';
		char a2 = 65;
		char a3 = '\u0041';
		System.out.println(a1+a2+a3);
		
		char b1 ='가';
		char b2 =44032;
		char b3 ='\uac00';
		System.out.println(b1+b2+b3);
	}

	public static void 출력(String 문자) {
		System.out.println(문자);
	}
}
