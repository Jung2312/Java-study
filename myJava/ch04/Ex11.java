package ch04;

import java.util.Iterator;

public class Ex11 {

	public static void main(String[] args) {
		for(int i = 2; i< 10; i++) {
			System.out.print(i+"단\t");
			for(int j = 1; j < 10; j++) {
				System.out.print(i+ " * " + j + " = " + (i*j) +"\t");
			}
			System.out.println();
		}
		
		for(int i = 1; i< 5; i++) {
			for(int j = 1; j < 10; j++) {
				if(i+j > 10) {
				
					break;
				}
				System.out.println(i + " + " + j + " = " +(i+j));
			}
		}
		
		aaa: // 라벨
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j > 10) {
					break aaa; // 전체 반복문 종료
				}
				System.out.println(i + " + " + j + " = " +(i+j));
			}
		}
		
		// 문제 : 중첩 for, i+j의 합이 30이 넘으면 종료
		bbb: // 라벨
		for (int i = 1; true; i++) {
			for (int j = 1; true; j++) {
				if(i+j > 30) {
					break bbb; // 전체 반복문 종료
				}
				System.out.println(i + " + " + j + " = " +(i+j));
			}
		}
	}

}
