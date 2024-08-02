package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("돼지국밥");
		list.add("내장국밥");
		list.add(2, "순대국밥");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String> e = list.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}
	}
	
}
