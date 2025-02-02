package ch06;

/*
static : 필드, 메소드, 클래스(조건이 맞으면) 
필드 및 메소드 : 객체 생성 없이 클래스 명으로 JVM이 메모리에 로딩하여 사용 가능한 문법

*/

class Static1{
	
	static class Inner{} // 내부 클래스는 static 가능, 거의 사용 안함
	
	static int a = 0;
	int b = 0; // non-static
	
	static void prn1() {
		// static 메소드에는 non-static 필드는 사용 불가
		// non-static 필드는 반드시 객체를 생성해야지 사용 가능
		// System.out.println(a+b);
	}
	
	void prn2() {
		System.out.println(a+b);
	}
	
}

public class StaticEx1 {

	public static void main(String[] args) {
		Static1 st1 = new Static1();
		st1.a = 10;
		st1.b = 20;
		Static1.prn1();
		//st1.prn1();
		st1.prn2();
		// static 필드 및 메소드 객체 생성없이 사용하라는 기능
		// 결국 static 필드 및 메소드는 객체 생성없이 특정한 필드 및 메소드만 독립적으로 사용할 목적
		double d = 3.12345678;
		long a = Math.round(d);
		System.out.println(a);
		System.out.println(Math.PI);
		String str1 = "10";
		String str2 = "20";

		System.out.println(str1+str2);
		
		//String Integer = new String(); 클래스명은 예약어가 아니므로 변수로 사용해도 딤
		System.out.println(Integer.parseInt(str2)+Integer.parseInt(str1));
	}

}
