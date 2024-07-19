package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame3 extends MFrame3 {
	
	public MyFrame3() {
		super(Color.orange);
		Button btn = new Button();
		add(btn,"South");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(randomColor());
			}
		});
	}

	public static void main(String[] args) {
		new MyFrame3();
	}
	
	public static Color randomColor(){
		Random rd = new Random();  
		int r = rd.nextInt(256);//0~255 랜덤정수
		int g = rd.nextInt(256);//0~255 랜덤정수
		int b = rd.nextInt(256);//0~255 랜덤정수
		return new Color(r,g,b);
	}

}
