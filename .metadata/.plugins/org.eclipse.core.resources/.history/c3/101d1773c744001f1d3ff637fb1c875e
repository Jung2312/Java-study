package ch06;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 인터페이스
class ThisFrame extends MFrame3 implements ActionListener {
	Button btn;

	public ThisFrame() {
		btn = new Button("버튼");
		add(btn, "South");
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
}

public class ThisEx2 {

	public static void main(String[] args) {
		new ThisFrame();
	}

}
