package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MyFrame2 extends Frame{
	
	public static void main(String[] args) {
		MFrame2 m = new MFrame2();
		Button btn = new Button("클릭");
		m.add(btn, "South");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setBackground(randomColor());
			}
		});
		
		MFrame2 m2 = new MFrame2(400,400,Color.CYAN, true);
	}
	
	
	public static Color randomColor(){
		Random rd = new Random();  
		int r = rd.nextInt(256);//0~255 랜덤정수
		int g = rd.nextInt(256);//0~255 랜덤정수
		int b = rd.nextInt(256);//0~255 랜덤정수
		return new Color(r,g,b);
	}

}
