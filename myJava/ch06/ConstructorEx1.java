package ch06;

class Consturctor1{
	private int a;
	
	// 생성자 : 클래스명과 동일한 이름으로 선언된 메소드
	public Consturctor1() {
		a = 1;
		System.out.println("디폴트 생성자 생성되었습니다.");
	}
	public Consturctor1(int a) {
		this.a = a;
		System.out.println(this.a);
	}
	public Consturctor1(String str) {
		System.out.println(str);
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		Consturctor1 c1 = new Consturctor1();
		Consturctor1 c2 = new Consturctor1(2);
		String str = new String(); // 15개의 생성자
	}

}
