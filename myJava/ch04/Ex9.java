package ch04;

public class Ex9 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i < 11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		while(true) {
			System.out.println("반복");
			if(true) {
				System.out.println("탈출");
				break;
			}
		}
		
		do {
			System.out.println("무조건 한 번은 실행");
		}while(false);
	}

}
