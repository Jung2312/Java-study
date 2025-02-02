package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MFrame2 extends Frame{
	
	public MFrame2() {
		setSize(300,300);
		setBackground(Color.blue);
		setVisible(true);
		setResizable(false);
		
		// 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		validate();
		
	}
	
	public MFrame2(int w, int h, Color c, boolean resize) {
		setSize(w,h);
		setBackground(c);
		setVisible(true);
		setResizable(resize);
		
		// 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		validate();
	}

	public static void main(String[] args) {

	}

}
