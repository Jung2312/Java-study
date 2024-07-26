package ch10;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
