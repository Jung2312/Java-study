package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class DesignEx1 extends MFrame2 {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250, 150);
		setTitle("디자인 예제1");
		setLayout(new BorderLayout());
		
		Panel p = new Panel();
		Panel p1 = new Panel();
		label = new Label("과일 중에 선택", label.CENTER);
		MColor c = new MColor();
		label.setBackground(c.rColor());
		
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("사과", cbg, false);
		cb2 = new Checkbox("딸기", cbg, true);
		cb3 = new Checkbox("앵두", cbg, false);
		
		btn1 = new Button("Start");
		btn2 = new Button("End");

		add(label,BorderLayout.NORTH);
		
		add(p);
		p.add(cb1, BorderLayout.EAST);
		p.add(cb2, BorderLayout.CENTER);
		p.add(cb3, BorderLayout.WEST);
		
		p.add(p1);
		p1.add(btn1, BorderLayout.EAST);
		p1.add(btn2, BorderLayout.WEST);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

