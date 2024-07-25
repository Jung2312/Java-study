package ch07;

public class CastingEx1 {

	public static void main(String[] args) {
		int a = 1234567;
		long l = a;
		System.out.println(a+" " +l);
		// short s = a; 크기가 맞지않음
		short s = (short)a;
		System.out.println(s);
	}

}
