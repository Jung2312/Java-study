package ch03;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요");
			int a = sc.nextInt(); 
			// thread 대기 상태 -> 키보드 입력 다시 실행
			
			// 입력한 숫자가 3의 배수인지 판별
			if((a != 0) && (a % 3 == 0))
				System.out.println("3의 배수입니다.");
			else
				System.out.println("3의 배수가 아닙니다.");
			
			
		}
	}

}
