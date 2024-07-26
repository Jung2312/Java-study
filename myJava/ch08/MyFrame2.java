package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends MFrame{
	
	Button btn;
	
	public MyFrame2() {
		btn = new Button("btn2");
		setBackground(MColor.rColor());
		add(btn, BorderLayout.SOUTH);
		setVisible(true);
		
		// 익명 클래스
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(MColor.rColor());
			}
		});
	}

	public static void main(String[] args) {
		new MyFrame2();
	}
}
