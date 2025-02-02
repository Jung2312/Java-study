package ch03;

public class Ex7 {

	public static void main(String[] args) {
		// 삼항연산자 : 리턴값을 동적으로 세팅 가능
		int a = 10;
		System.out.println((a%2==0) ? "짝수" : "홀수");
	
		// 리턴값이 있는 메소드는 반드시 값을 받을 필요는 없음
		int b = Math.min(a, 20);
		int c = 10;
		int d = 20;
		int e = b > c ? b : c;
		System.out.println(e);
		
		int f = -20;
		int g = f > 0 ? f : -f;
		System.out.println(Math.abs(f));
	}

}
