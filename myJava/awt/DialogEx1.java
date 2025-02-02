package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DialogEx1 extends MFrame implements ActionListener {

	Button btn;
	String title = "메시지 대화상자";
	
	public DialogEx1() {
		super(300,300);
		setTitle("Dialog");
		setLayout(new BorderLayout());
		add(btn = new Button("보이기"), BorderLayout.SOUTH);
		btn.addActionListener(this);
		setResizable(true);
		validate();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MyDialog md = new MyDialog(this, title, true);
		md.setSize(150,100);
		md.setLocationRelativeTo(this);
		md.setVisible(true);
		
	}
	
	class MyDialog extends Dialog implements ActionListener{
		
		Button b;
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			b = new Button("확인");
			b.addActionListener(this);
			add(b);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	public static void main(String[] args) {
		new DialogEx1();
	}

}
