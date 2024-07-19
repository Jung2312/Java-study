package ch06;

// Annotation : 주석

class Ann1{
	void prn() {
		
	}
}
class Ann2 extends Ann1{
	@Override
	void prn() {
		
	}
}

public class AnnotationEx1 {

	public static void main(String[] args) {
		char c = 'a';
		if(Character.isSpace(c)) {
			System.out.println("공백 문자입니다.");
		}else {
			System.out.println("공백 문자가 아닙니다.");
		}
		prn();
	}
	
	@Deprecated
	public static void prn() {
		
	}

}
