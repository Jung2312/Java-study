package ch11;

public class SystemEx1 {

	public static void main(String[] args) {
		System.out.println("출력");
		
		// 1초 1/1000 계산 : 1970년 1월 1일 0시부터 현재까지
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

}
