package ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class LuckyLotto3 {

	public static void main(String[] args) {
		int arr[] = getLotto();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}

	public static int[] getLotto() {
		int lotto[] = new int[6];

		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int rand = r.nextInt(45)+1;
			if (!isDuplication(lotto, rand)) {
				lotto[i] = rand;
			}else {
				i--;
			}
		}

		Arrays.sort(lotto);
		return lotto;
	}

	public static boolean isDuplication(int arr[], int num) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + " ";
		}
		return str.contains(String.valueOf(num));
	}
}
