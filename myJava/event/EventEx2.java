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
		// 1. �̺�Ʈ �ҽ� ����
		add(btn = new Button("��ư"), BorderLayout.SOUTH);
		
		// 4. �̺�Ʈ �ҽ��� �̺�Ʈ �ڵ鷯 ����(addXxxListener)
		btn.addActionListener(this);
		
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
		
	}
	
	public static void main(String[] args) {
		new EventEx2();
	}

	// 3. �̺�Ʈ �������� �޼ҵ�(�̺�Ʈ �ڵ鷯) ����
	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
