package ch00;

// 객체, 클래스
// 속성(변수)
// 기능(메소드)

// 클래스 : 객체를 만드는 툴
// 객체의 속성과 메소드가 포함되어있음
class Car1 {
	
	// 변수(필드) : 객체의 속성
	String carName;
	int velocity;
	String carColor;
	
	public Car1() {
		
	}
	
	void speedUp() {velocity++;}
	void speeddown() {velocity--; if(velocity < 0) {velocity = 0;}}
	void speedStop() {velocity = 0;}
}

public class CarEx1 {
	
	private String c;
	
	public CarEx1() {
		
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	public String getC() {
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =  new String("sdasfsdf");
		//System.out.println(s.length());
		
		CarEx1 carEx = new CarEx1();
		Car1 car1 = new Car1();
		carEx.setC("밥먹고싶다");
		//System.out.println(carEx.getC());
		
		prl("ㅎㅇ");
		
		Math.abs(-10);
		//System.out.println(Math.abs(-10));
		
		car1.velocity = 20;
		car1.speeddown();
		System.out.println(car1.velocity);
		car1.speedUp();
		System.out.println(car1.velocity);
		car1.speedStop();
		System.out.println(car1.velocity);
		
		Car1 c2 = new Car1();
		c2.carColor = "흰색";
		c2.carName = "소나타";
		car1.speedUp();
		System.out.println(c2.carColor+c2.carName+car1.velocity);
		System.out.println(car1);
		System.out.println(c2);
	
	}
	
	public static void prl(String s) {
		System.out.println(s);
	}

}
