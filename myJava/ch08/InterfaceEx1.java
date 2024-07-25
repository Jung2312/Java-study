package ch08;

interface Calc{
	// 추상 메소드 : abstract 사용 안해도 됨
	void plus(int a, int b);
}


class Function extends Object implements Calc{
	@Override
	public void plus(int a, int b) {
		System.out.println(a+b);
	}
}

class Graphisc implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		Function f = new Function();
		f.plus(10, 10);
	}
}
