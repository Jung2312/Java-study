package ch05;

public class Ex1 {

	public static void main(String[] args) {
		// 1. 배열 변수 선언
		int arr[];
		
		// 2. 배열의 크기를 지정(불변)
		arr = new int[5];
		
		// 3. 배열에 값을 할당한다.
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		
		// 4. 배열을 출력한다.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int arr1[] = new int[3];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 10;
			System.out.println(arr1[i]);
		}
		
		int arr2[] =  {1,2,3,4};
	}

}
