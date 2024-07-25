package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends MFrame implements ActionListener{
	
	Button btn;
	
	public MyFrame() {
		btn = new Button("btn");
		setBackground(MColor.rColor());
		add(btn, BorderLayout.SOUTH);
		setVisible(true);
		
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}

}
