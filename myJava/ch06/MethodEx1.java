package ch06;

class Method1{
	
	int abs(int num) {
		
		if(num < 0) {
			num = -num;
		}
		return num;
	}
	
	void prn(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
}

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m1 = new Method1();
		
		System.out.println(m1.abs(3));
		m1.prn(4, 5);
	}

}
