package ch11;

class Point3{
	
}

public class StringEx2 {

	public static void main(String[] args) {
		Point3 p1 = new Point3(); 
		Point3 p2 = new Point3(); 
		System.out.println(p1==p2);
		p1 = p2;
		System.out.println(p1==p2);
		
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		// String : 클래스 중 유일하게 new 없이 객체 생성 가능
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s5 = "AP";
		String s6 = "ap";
		
		System.out.println(s5.equalsIgnoreCase(s6));
	}

}
