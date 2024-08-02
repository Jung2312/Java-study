package event;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemClass implements ItemListener{
	ItemEventEx2 f;

	public ItemClass(ItemEventEx2 f) {
		this.f = f;
	} 
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() +":" + cb.getState();
		f.label.setText(str);
	}
}

public class ItemEventEx2 extends MFrame{
	
	Label label;
	Checkbox cb1, cb2, cb3;
	
	public ItemEventEx2() {
		super(300, 200);
		setLayout(new FlowLayout());
		add(cb1=new Checkbox("수박"));
		add(cb2=new Checkbox("바나나"));
		add(cb3=new Checkbox("멜론"));
		add(label = new Label("현재 상태 :                    "));
		
		ItemClass ic = new ItemClass(this);
		cb1.addItemListener(ic);
		cb2.addItemListener(ic);
		cb3.addItemListener(ic);
		validate();
	}


	public static void main(String[] args) {
		new ItemEventEx2();
	}
}




