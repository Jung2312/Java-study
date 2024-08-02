package ch13;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx1 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");
		ht.put("포도", "g");
		ht.put("a", "1111");
		System.out.println(ht.size());
		
		Enumeration<String> e = ht.keys();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			String value = ht.get(key);
			System.out.println(key+value);
		}
	}

}
