package ch11;


// 멀티 스레드에서 동기화가 가능한 StringBuffer
// 단일 스레드 동기화가 불가능한 StringBuilder
public class PalindromeEx2 {

	public static final int MAX = 100000;


	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */

		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int i =1;
		int sum =0;
		while (i <= MAX) {
			String s = String.valueOf(i);
			StringBuffer sb = new StringBuffer(s);
			
			if (s.equals(sb.reverse().toString())) {
				sum += i;
			}
		}
		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		i = 1;
		sum = 0;
		while (i <= MAX) {
			String s = Integer.toBinaryString(i);
			StringBuffer sb = new StringBuffer(s);
			
			if (s.equals(sb.reverse().toString())) {
				sum += i;
			}
		}
		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		i = 1;
		sum = 0;
		while (i <= MAX) {
			StringBuffer sbB = new StringBuffer(Integer.toBinaryString(i));
			StringBuffer sbS = new StringBuffer(Integer.toString(i));

			String strB = Integer.toBinaryString(i);
			String strS = Integer.toString(i);
			
			if (strB.equals(sbB.reverse().toString()) & strS.equals(sbS.reverse().toString())) {
				sum += i;
			}
		}
	}
}
