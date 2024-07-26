package ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		
		
	}

}
