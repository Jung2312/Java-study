package awt;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener{
	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	public ChoiceEx3() {
		star = new Choice();
		star.add("���ڿ�����");
		star.add("���ڿ�����");
		
		name = new Choice();
		changeStar(ms, name);
		star.addItemListener(this);
		add(star);
		add(name);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(star.getSelectedItem().equals("���ڿ�����")) {
			changeStar(ms, name);
		}else {
			changeStar(fs, name);
		}
	}
	
	public static void changeStar(String list[], Choice name) {
		name.removeAll();
		for(int i = 0; i <list.length;i++) {
			name.add(list[i]);
		}
	}
	

	public static void main(String[] args) {
		new ChoiceEx3();
	}




}