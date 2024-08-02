package awt;

import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListEx1 extends MFrame implements ItemListener{
	List list1, list2;
	Label label1, label2;
	String team1[] ={"�Ե�","�Ｚ","��ȭ","KIA","NC"};
	String team2[] ={"LG","�λ�","�ؼ�","SK","KT"};
	
	public ListEx1() {
		list1 = new List(3,false);
		list2 = new List(4,true);
		
		for (int i = 0; i < team1.length; i++) {
			list1.add(team1[i]);
			list2.add(team2[i]);
		}
		list1.addItemListener(this);
		list2.addItemListener(this);
		add(list1);
		add(list2);
		add(label1=new Label("team1 :                          "));
		add(label2=new Label("team2 :                          "));
		
	}
	
	public static void main(String[] args) {
		new ListEx1();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str1 = list1.getSelectedItem();
		label1.setText("team1 :" + str1);
		String str2[] = list2.getSelectedItems();
		for (int i = 0; i < str2.length; i++) {
			str1 += str2[i] + "";
		}
		label2.setText("team2 :" + str1);
	}

}
