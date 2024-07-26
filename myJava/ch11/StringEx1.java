package ch11;

import java.util.Iterator;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "Java Programming";
		str += "!!";
		System.out.println(str);
		System.out.println(str.length());
		int len = str.length();
		char c1 = str.charAt(2);
		System.out.println(c1);
		
		for (int i = 0; i < len ; i++) {
			if(i%2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		int idx1 = str.indexOf('a');
		System.out.println(idx1);
		int idx2 = str.lastIndexOf('a');
		System.out.println(idx2);
		int idx3 = str.indexOf('z');
		System.out.println(idx3);
		
		// a를 q로 변환
		for (int i = 0; i < len; i++) {
			if(str.charAt(i) == 'a') {
				System.out.print('q');
			}else {
				System.out.print(str.charAt(i));
			}
		}
		
		System.out.println();
		
		String str4 = str.replace('a', 'q');
		
		StringBuffer sb = new StringBuffer(str);
		// 반대로 문자열 출력
		System.out.println(sb.reverse());
		
		String str5 =  "Java&JSP&Flutter&Iot&Spring";
		String str6[] = str.split("");
		
		String str7 = " JSP-STUDY ";
		System.out.println("^&^&"+str7.trim()+"#$#");
		int idx4 = 35;
		
		String str8 = String.valueOf(idx4);
		String stt9 = idx4 + "";
	}

}
