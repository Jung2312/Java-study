package ch07;

class Singleton{
	private static Singleton intance = null;
	
	private Singleton() {
		// DB 연결 객체 10개 생성
	}
	
	public static Singleton getInstance() {
		if(intance == null) {
			intance = new Singleton();
		}
		
		return intance;
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Singleton st = Singleton.getInstance();
			System.out.println(st);
		}
	}

}
