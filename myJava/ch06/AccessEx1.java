package ch06;

/*
1. private (0.1%) -> Math
2. protected (0.01%)
3. public (99.9%)
*/

class Acceess1{ // public으로 선언하면 오류남 -> 
	public int a = 0; // 어디에서나 접근 가능
	protected int b = 0; // 상속 또는 같은 pacakge 일 때 가능
	private int c = 0; // 자신의 클래스 안에서만 가능
}

public class AccessEx1 {

	public static void main(String[] args) {
		
	}

}
