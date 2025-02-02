package ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LuckyLotto {

	public static void main(String[] args) {
			int arr[] = getLotto();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "\t");
			}
	}
	
	public static int[] getLotto(){
		int lotto[] = new int[6];
		
		Random r = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			int rand = r.nextInt(45);
			lotto[i] = rand;
			if(rand != 0) {
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
	
		Arrays.sort(lotto);
		return lotto;
	}
}
