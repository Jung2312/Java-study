package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼을 킆릭하면 종료되는 기능을 내부 클래스와 익명 클래스를 이용하지 않는 방법

class MyAction implements ActionListener{

	Frame f;
	public MyAction(Frame f) {
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		f.setBackground(MColor.rColor());
	}
	
}

public class MyFrame1 extends MFrame {
	
	Button btn;
	
	
	public MyFrame1() {
		btn = new Button("btn");
		add(btn, BorderLayout.NORTH);
		
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
	}
	

	public static void main(String[] args) {
		new MyFrame1();
	}

}
