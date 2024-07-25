package ch07;

import java.io.IOException;

class Super2 {
	void prn1() {

	}

	protected void prn2() {

	}
	void prn3() throws IOException{
		
	}
}

class Sub2 extends Super2 {
	/* @Override */
	void prn1(int a) {
	}

	@Override // Super 클래스의 메소드 보다 더 넓은 전급 지정자
	public void prn2() {

	}
	
	@Override // Super 클래스의 메소드 보다 더 넓은 전급 지정자
	public void prn3() throws IOException{
		
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {

	}

}
