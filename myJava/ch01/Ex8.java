package ch01;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요 : ");
	String name = sc.nextLine();
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	System.out.printf("\n%s %d", name, age);
	
	}

}
