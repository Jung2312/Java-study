package ch11;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("오늘의 날짜는");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		int ampm = cal.get(Calendar.AM_PM);
		if (ampm == Calendar.AM) {
			System.out.println("현재 시간은 am");
		}else {
			System.out.println("현재 시간은 pm");
		}
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	}

}
