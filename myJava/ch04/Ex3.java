package ch04;

public class Ex3 {

	public static void main(String[] args) {
		String month = "june";
		String month2 = new String("june");

		switch (month) {
		case "june": {
			System.out.println("6월");
			break;
		}

		case "july": {
			System.out.println("7월");
			break;
		}

		case "march": {
			System.out.println("3월");
			break;
		}

		default:
			System.out.println("8월 달 이후.....");
		}

		// 객체 참조형 클래스는 equals 사용
		if (month2.equals("june") ) {
			System.out.println("6월");
		} else if (month2.equals("july")) {
			System.out.println("7월");
		} else if (month2.equals("march")) {
			System.out.println("3월");
		}else {
			System.out.println("8월 달 이후.....");
		}
	}

}
