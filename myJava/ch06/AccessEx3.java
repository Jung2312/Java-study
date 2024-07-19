package ch06;

import java.awt.Frame;

/*
1. private (0.1%) -> Math
2. protected (0.01%)
3. public (99.9%)
*/


class MyFrame extends Frame{
	public MyFrame() {
		setSize(200,200);
		setLocation(100,200);
		setVisible(true);
	}
	
	public void prn() {
		System.out.println(paramString());
	}
}

public class AccessEx3 {

	public static void main(String[] args) {
		MyFrame frn =  new MyFrame();
		frn.prn();
	}

}
