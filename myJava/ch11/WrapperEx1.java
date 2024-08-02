package ch11;

import java.util.Vector;

public class WrapperEx1 {

	public static void main(String[] args) {
		char c1 = 'J';
		if(Character.isLetter(c1)) {
			System.out.println("문자입니다.");
		}
		
		char c2 = 'a';
		if (Character.isLowerCase(c2)) {
			System.out.println("소문자입니다.");
		}
		
		char c3 = '2';
		if (Character.isDigit(c3)) {
			System.out.println("숫자입니다.");
		}
		
		char c4 = ' ';
		if (Character.isSpaceChar(c4)) {
			System.out.println("공백입니다.");
		}
		
		Byte bt;
		Short s;
		Integer i;
		Long l;
		
		Float f;
		Double d;
		
		Character c;
		Boolean b;
		
	}

}
