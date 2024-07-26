package ch11;

public class PalindromeEx1 {

	public static final int MAX = 100000;

	public static int palindrome(int a) {
		int sum = 0;
		for (int i = 0; i < MAX; i++) {

			StringBuffer sbB = new StringBuffer(Integer.toBinaryString(i));
			StringBuffer sbS = new StringBuffer(Integer.toString(i));

			String strB = Integer.toBinaryString(i);
			String strS = Integer.toString(i);

			if (a == 1) {
				if (strS.equals(sbS.reverse().toString())) {
					sum += i;
				}
			} else if (a == 2) {
				if (strB.equals(sbB.reverse().toString())) {
					sum += i;
				}
			} else if (a == 3) {
				if (strB.equals(sbB.reverse().toString()) & strS.equals(sbS.reverse().toString())) {
					sum += i;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */

		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(palindrome(1));
		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(palindrome(2));
		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(palindrome(3));
	}
}
