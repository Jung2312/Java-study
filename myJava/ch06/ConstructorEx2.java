package ch06;

import java.awt.Dialog;
import java.awt.Frame;

class Consturctor2{
	// 생성자가 선언되지 않은 경우, 가상 머신이 스스로 디폴트 생성자 제공
	// 매개 변수 있는 생성자가 있는 경우 디폴트 생성자 제공 안함
	public Consturctor2(int a) {
		// TODO Auto-generated constructor stub
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		Consturctor2 c1 = new Consturctor2(2);
		
		Dialog dialog = new Dialog(new Frame());
	}

}
