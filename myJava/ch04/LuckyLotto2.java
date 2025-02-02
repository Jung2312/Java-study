package ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class LuckyLotto2 {

	public static void main(String[] args) {
			Object arr[] = getLotto();
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "\t");
			}
	}
	
	public static Object[] getLotto(){
		TreeSet<Integer> tr = new TreeSet<Integer>();
		Random r = new Random();
		for(int j = 0; tr.size() < 6; j++) {
			int rand = r.nextInt(45) + 1;
			tr.add(rand);
		}
		
		Object lotto[] = tr.toArray();
		return lotto;
	}
}
