package ch03;

public class Ex8 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int sum = a+b+c;
		System.out.println(sum);
		
		int arr[] = new int[3];
		int list[] = {a,b,c};
		
		sum = 0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		
		System.out.println(sum);
	}

}
