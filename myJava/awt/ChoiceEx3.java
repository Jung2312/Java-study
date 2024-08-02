package awt;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener{
	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	public ChoiceEx3() {
		star = new Choice();
		star.add("남자연예인");
		star.add("여자연예인");
		
		name = new Choice();
		changeStar(ms, name);
		star.addItemListener(this);
		add(star);
		add(name);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(star.getSelectedItem().equals("남자연예인")) {
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