package ch06;

/*
1. private (0.1%) -> Math
2. protected (0.01%)
3. public (99.9%)
*/

class Acceess2{ // public으로 선언하면 오류남 -> 
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}

}

public class AccessEx2 {

	public static void main(String[] args) {
		Acceess2 a2 = new Acceess2();
		a2.setAge(20);
		a2.setName("홍길동");
		System.out.println(a2.getAge());
		System.out.println(a2.getName());
	}

}
