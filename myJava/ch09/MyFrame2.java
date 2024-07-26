package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends MFrame {
	
	Button btn1, btn2;
	
	public MyFrame2() {
		Panel p = new Panel();
		p.add(btn1 = new Button("Btn1"));
		p.add(btn2 = new Button("Btn2"));

		
		add(p, BorderLayout.SOUTH);
		
		btn1.addActionListener(new MyAction2());
		btn2.addActionListener(new MyAction2());
	}
	
	// 내부 클래스 구현
	class MyAction2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obg = e.getSource();
			
			if(obg == btn1) {
				setBackground(MColor.rColor());
			}else if(obg == btn2) {
				System.exit(0);
			}
		}
		
	}

	
	public static void main(String[] args) {
		new MyFrame2();
	}
}




