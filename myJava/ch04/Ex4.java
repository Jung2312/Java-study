package ch04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Month(1~12) 입력하고 각각 계절에 맞는 봄(3~5), 여름(6~8), 가을(9~11), 겨울 출력(12~2)
		// 5라고 입력을 하면 봄입니다. 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		// if-else
		if (3 <= month & month <= 5) {
			System.out.println("봄입니다.");
		} else if (6 <= month & month <= 8) {
			System.out.println("여름입니다.");
		} else if (9 <= month & month <= 11) {
			System.out.println("가을입니다.");
		} else if (12 == month | ( month > 0 & month <= 2)) {
			System.out.println("겨울입니다.");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		
		// swich
		switch (month) {
		case 3: case 4: case 5: {
			System.out.println("봄입니다.");
			break;
		}
		case 6: case 7: case 8: {
			System.out.println("여름입니다.");
			break;
		}
		case 9: case 10: case 11: {
			System.out.println("가을입니다.");
			break;
		}
		case 12: case 1: case 2: {
			System.out.println("겨울입니다.");
			break;
		}
		default:
			System.out.println("해당하는 계절이 없습니다.");
		}

	}

}
