package ch05;

public class Ex2 {

	public static void main(String[] args) {
		// 다차원 배열
		int arr[][] = new int[2][3];

		for (int i = 0; i < arr.length; i++) { // 1차
			for (int j = 0; j < arr[i].length; j++) { // 2차
				arr[i][j] = i + j;
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

		// 문제1. arr2의 모든 요소의 합을 구하라
		int sum = 0;
		int arr2[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 }, { 7, 8 }, { 9, 10 } };
		for (int i = 0; i < arr2.length; i++) { // 1차
			for (int j = 0; j < arr2[i].length; j++) { // 2차
				sum += arr2[i][j];
				
			}
		}
		System.out.println(sum);
		
		// 문제2. arr3의 평균을 구하시오.
		double arr3[][] = { { 1.0 }, { 2.3, 3.4 }, { 4.5, 6.2, 4.3 }, { 9.0 } };
		double sum1 = 0;
		double avg = 0;
		int size = 0;
		for (int i = 0; i < arr3.length; i++) { // 1차
			for (int j = 0; j < arr3[i].length; j++) { // 2차
				size++;
				sum1 += arr3[i][j];
			}
			
		}
		avg = sum1 / size;
		System.out.println(avg);
		
		// 문제3. arr4의 평균과 합을 각각 구하시오.
		int arr4[][][] = { { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } }, { { 10, 11 }, { 12, 13, 14 }, { 15 }, { 22 } },
				{ { 16, 17, 18, 19, 20 }, { 22, 23, 24 } } };
		
		double sum2 = 0;
		double avg2 = 0;
		int size2 = 0;
		for (int i = 0; i < arr4.length; i++) { // 1차
			for (int j = 0; j < arr4[i].length; j++) { // 2차
				for (int j2 = 0; j2 < arr4[i][j].length; j2++) {
					sum2 += arr4[i][j][j2];
					size2++;
				}
			}
			
		}
		avg2 = sum2 / size2;
		System.out.println(sum2);
		System.out.println(avg2);
	}

}
