package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


public class DesignEx2 extends MFrame2{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		
		
		Panel p = new Panel();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		p.setSize(500, 200);

		p.add(tf = new TextField("Hello JUN",30), BorderLayout.NORTH);
	
		add(p);
		
		p1.add(ta = new TextArea());
		p.add(p1);
		
		btn1 = new Button("마우스 시험용");
		btn2 = new Button("종료");
		p2.add(btn1, BorderLayout.EAST);
		p2.add(btn2, BorderLayout.WEST);
		p1.add(p2);
		validate();
	}
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

