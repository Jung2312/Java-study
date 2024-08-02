package ch11;

import java.util.Vector;

public class WrapperEx2 {

	public static void main(String[] args) {
		// byte, short, int(integer), long
		// float, double
		// char, boolean
		int a = 10;
		
		// Auto boxing
		Integer i = a;
		
		// Auto unboxing
		int b = i;
		
		Vector v = new Vector();
		v.add(new String("aaa"));
		v.add(new Object());
		v.add(a); // Auto boxing : a가 Integer로 저장되었으므로 가져올때는 Integer 타입으로 리턴받아야함
		
		int c = (Integer)v.get(2); // Auto unboxing
		
		Integer i1 = new Integer(a);
		Integer i2 = new Integer("22");
		Integer i3 = Integer.valueOf(a);
		Integer i4 = Integer.valueOf("22");
		
		int d = i4.intValue(); // Auto Boxing 사용하지 않고 값을 가져옴
		int e = Integer.parseInt("23"); // 숫자 형태의 문자열을 int로 변환
		
		System.out.println(Integer.MAX_VALUE);
		
		String s1="3.14";
		double d1 = Double.parseDouble(s1);
		System.out.println(d1*d1*Math.PI);
	}

}
