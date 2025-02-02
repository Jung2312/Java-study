package ch04;

public class Ex8 {

	public static void main(String[] args) {
		// for문을 이용해서 1~10까지 합을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			
			if(i == 10) {
				System.out.print(i);
			}
			else {
				System.out.print(i + "+");
			}
		}
		System.out.print("=" + sum);
		System.out.println();

		// 2. 3의 배수 합
		sum = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
		System.out.println();

		// 3. 짝수와 홀수의 합
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("짝수의 합 = " + sum1);
		System.out.println("홀수의 합 = " + sum2);

		// 4. 1~50 3/6/9 합
		sum = 0;
		for (int i = 1; i <= 50; i++) {
			int a  = i % 10;
			int b  = i / 10;
			if(a == 3 || a == 6 || a ==9 || b == 3) {
				sum += i;
			}
		}
		System.out.print(sum);
		System.out.println();
	}

}
