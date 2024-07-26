package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			int a, b;
			sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a / b);
			// 다중 catch는 예외 객체의 순서를 지켜야한다.
			// 상위 Exception 클래스가 먼저 오면 절대 안됨 하위 -> 상위 순
		} catch (ArithmeticException e) {
			System.out.println("0나누기 불가");
		} catch (InputMismatchException e) {
			System.out.println("문자 입력");
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sc.close();
		}
	}

}
