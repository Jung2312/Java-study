package ch08;

abstract class Tv{
	String color;
	boolean power;
	int ch;
	
	void ofOFFPower() {
		power = !power;
	}
	
	void upCh() {
		ch++;
	}
	void downCh() {
		ch--;
	}
	
	abstract void setModel();
	
}

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class SMTv extends Tv implements RemoteControl{

	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}
class LGTv extends Tv implements RemoteControl{
	
	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}

class MyClass5{
	
}

public class InterfaceEx4 {
	public static void main(String[] args) {
		
	}
}
