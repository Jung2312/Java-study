package ch00;

import java.awt.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MyFrame extends Frame{
	
	public MyFrame() {
		setSize(300,300);
		setBackground(randomColor());
		setVisible(true);
		Button btn = new Button("색상변경");
		add(btn, "South");
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(randomColor());
			}
		});
	}
	
	public Color randomColor(){
		Random rd = new Random();  
		int r = rd.nextInt(256);//0~255 랜덤정수
		int g = rd.nextInt(256);//0~255 랜덤정수
		int b = rd.nextInt(256);//0~255 랜덤정수
		return new Color(r,g,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame(); 
	}

}
