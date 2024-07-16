package ch04;

public class Ex5 {

	public static void main(String[] args) {
		int a = 10;
		if(a > 0) {
			System.out.println("양수입니다.");
			if(a % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			System.out.println("양수입니다.");
			if(a % 2 == 0) {
				System.out.println("짝수가 아닙니다.");
			}
		}else if(a < 0) {
			System.out.println("음수입니다.");
		}
	}

}
