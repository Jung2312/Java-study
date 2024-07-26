package ch11;

class Point1{
	
}

public class ObjectEx1 {

	public static void main(String[] args) {
		Point1 p = new Point1();
		Point1 p1 = new Point1();
		System.out.println(p.getClass());
		
		// hashcode : 객체를 구분하는 정수 값
		System.out.println(p.hashCode());
		
		System.out.println(p==p1);
		System.out.println(p.equals(p1));

		String s = new String("하하");
	}
}
