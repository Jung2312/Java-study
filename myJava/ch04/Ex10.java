package ch04;

public class Ex10 {

	public static void main(String[] args) {
		int a = 0;
		while(true) {
			
			if(a == 10) {
				break;
			}
			//System.out.println(a);
			a++;
		}
		
		/*for문을 이용하여 순차적으로 1에서 n까지의 
		합이 100에서 최대한 가까운 합을 리턴*/
		
		int sum = 0;
		
		for(int i  = 1; true; i++) {
			if(sum > 100) break;
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		int n = 1;
		for(; true; n++) {
			sum += n;
			if(sum > 100) {
				sum -= n;
				n -= 1;
				break;
			}
		}
		System.out.println(n + " " + sum);
		
		for(int i = 1; i<11; i++) {
			if(i % 2== 0 ) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i<11; i++) {
			if(i % 2 != 0 ) {
				continue;
			}
			System.out.println(i);
			
		}
		
		sum = 0;
		for(int i = 1; i<21; i++) {
			if(i % 3 != 0) {
				continue;
			}
			sum += i;
			if(i == 18) {
				System.out.print(i+"=");
			}else {
				System.out.print(i+"+");
			}
		}
		
		System.out.print(sum);
		
		
	}

}
