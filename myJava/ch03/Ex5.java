package ch03;

public class Ex5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.println((a==b) & (a>b)); // 앞의 조건이 f여도 뒤에 조건을 확인
		System.out.println((a==b) && (a>b)); // 앞에 있는 조건이 f라면 뒤에 조건을 읽지 않음
		
		int c = 0;
		//System.out.println((a==b) & (a/c>b)); // 앞에 있는 조건이 f라면 뒤에 조건을 읽지 않음
		System.out.println((a==b) && (a/c>b)); // 앞에 있는 조건이 f라면 뒤에 조건을 읽지 않음
		
		int d = 0;
		System.out.println((a!=b) || (a/c>b)); // 앞에 있는 조건이 f라면 뒤에 조건을 읽지 않음
		//System.out.println((a!=b) | (a/c>b)); // 앞에 있는 조건이 f라면 뒤에 조건을 읽지 않음
		
		//XOR 
		System.out.println((a==b)^(a>b));
	}

}
