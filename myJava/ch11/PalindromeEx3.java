package ch11;

import java.util.Iterator;

// 멀티 스레드에서 동기화가 가능한 StringBuffer
// 단일 스레드 동기화가 불가능한 StringBuilder
public class PalindromeEx3 {

	public static final int MAX = 100000;

	public static boolean palindrome(int a, int radix) {
		int sum = 0;
		
		StringBuffer sb = new StringBuffer(Integer.toString(a, radix));

		return sb.toString().equals(sb.reverse().toString());
	}

	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */
		int sum[] = new int[3];
		for (int i = 1; i < 100000; i++) {
			if(palindrome(i, 10)) {
				sum[0]+=i;
			}
			if(palindrome(i, 2)) {
				sum[1]+=i;
			}
			if(palindrome(i, 10) && palindrome(i, 2)) {
				sum[2]+=i;
			}
		}
		
		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(sum[0]);
		
		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(sum[1]);
		
		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println(sum[2]);
	}
}
