package ch07;

class Animal {
	void move() {
		
	};
}

class Bird extends Animal{
	String name = "새";
	
	@Override
	void move() {
		System.out.println("날아라");
	}
}

class Fish extends Animal{
	String name = "물고기";
	
	@Override
	void move() {
		System.out.println("헤엄쳐라");
	}
}

class Cheetah extends Animal{
	String name = "치타";
	
	@Override
	void move() {
		System.out.println("달려라");
	}
}

public class CastingEx2 {

	public static void main(String[] args) {
		Animal ani[] = new Animal[3];
		ani[0] = new Bird();
		ani[1] = new Fish();
		ani[2] = new Cheetah();
		
		for (int i = 0; i < ani.length; i++) {
			// 정적 바인딩 : 컴파일 시점에 결정. static
			ani[i].move(); // 동적 바인딩(Override) : 하위 클래스의 메소드가 호출. 실행 시점에 결정
		}
		
		Fish f = new Fish();
		Object obj = f; // 참조 가능
		
		Animal ani2 = new Animal();
		// 강제 casting하는 경우 컴파일 시점에 에러
		// Bird d = (Bird)ani2; 참조 불가능
	}
	
	
}
