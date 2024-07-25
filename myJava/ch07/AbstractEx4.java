package ch07;

//추상 클래스 : 도형
abstract class Shape{
	int x,y;
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	abstract void draw();
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("삼각형");
	}
	
}

class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("사각형");
	}
	
}

class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("원형");
	}
	
}

// 다형성 : 오버라이딩, 오버로딩
public class AbstractEx4 {

	public static void main(String[] args) {
		Shape s = new Triangle();
		s.draw(); // 동적 바인딩 : 자바의 특징 중 다형성에 해당
		
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
	}

}
