package ch01;

public class Ex7 {

	public static void main(String[] args) throws Exception  {
		System.out.println("키보드에서 입력하고 Enter하세요.");

		while (true) {
			int keyCode = System.in.read();
			System.out.println(keyCode);
			
			if(keyCode == 113) { //q
				System.out.println("종료");
				break;
			}
		}
	}

}
