package ch13;

import java.util.Vector;

// Collection 클래스의 대표 클래스
public class VecterEx1 {

	public static void main(String[] args) {
		// obj 타입의 객체를 저장하는 클래스
		Vector vec = new Vector();
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		boolean flag = vec.add("ㅎ");
		System.out.println(flag);
		vec.add(new String("ㅎㅎ"));
		vec.add(Integer.valueOf(22));
		vec.add(23);
		System.out.println(vec.size());
		
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
			// vec.elementAt(i);
		}
		
		for (Object object : vec) {
			System.out.println(object);
		}
	}

}
