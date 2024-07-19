package ch06;

import common.util.StringUtil;

class Static2{
	static int a; // 상수 X, 초기화 필요 X
	// static final int a; -> 상수 O, 초기화 필요 O
	int b;
}

public class StaticEx2 {
	public static void main(String[] args) {
		 Static2 st1 = new Static2();
		 Static2 st2 = new Static2();
		 
		 // static 변수는 모든 객체의 공통적으로 사용하기 위해 하나만 만들어짐(값이 공유됨)
		 st1.a = 10;
		 st1.b = 10;
		 st2.a = 20;
		 st2.b = 20;
		 
		 System.out.println(st1.a + st1.b);
		 System.out.println(st2.a + st2.b);
		 System.out.println(Static2.a + st1.b);
		 System.out.println(Static2.a + st2.b);
		 
		 String str = "100000000000";
		 System.out.println(StringUtil.addComma(str));
	}

}
