package ch08;

interface InterfaceA4{
	void prnA();
}

interface InterfaceB4{
	void prnB();
}

class MyClass4 implements InterfaceA4,InterfaceB4{

	@Override
	public void prnB() {
	}

	@Override
	public void prnA() {
	}
	
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		
	}
}
