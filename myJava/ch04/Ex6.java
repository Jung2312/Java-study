package ch04;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 점수, 학년 입력 -> 점수가 60점 이상이면 합격
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();

		if (grade == 4) {
			if (score >= 70) {
				System.out.println(grade + "학년, 합격입니다.");
			} else {
				System.out.println(grade + "학년, 탈락입니다.");
			}
		} else {
			if (score >= 60) {
				System.out.println(grade + "학년, 합격입니다.");
			} else {
				System.out.println(grade + "학년, 탈락입니다.");
			}
		}

	}

}
