package ch03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int c = sc.nextInt();
		
		// 실행하는 코드가 한 줄 이면 중괄호 괄호 생략 가능
		if(c % 2 == 0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
		
	}

}
