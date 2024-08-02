package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyAction implements ActionListener{

	
	EventEx2 f;
	
	public MyAction(EventEx2 f) {
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		f.setBackground(MColor.rColor());
		f.btn.setBackground(MColor.rColor());
	}
	
}

public class EventEx2 extends MFrame implements ActionListener{

	Button btn;
	
	public EventEx2() {
		// 1. 이벤트 소스 생성
		add(btn = new Button("버튼"), BorderLayout.SOUTH);
		
		// 4. 이벤트 소스랑 이벤트 핸들러 연결(addXxxListener)
		btn.addActionListener(this);
		
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
		
	}
	
	public static void main(String[] args) {
		new EventEx2();
	}

	// 3. 이벤트 리스너의 메소드(이벤트 핸들러) 구현
	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
