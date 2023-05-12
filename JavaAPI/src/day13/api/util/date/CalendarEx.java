package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); 이렇게는 안  만들어짐
		
		//static 메소드를 사용해서 객체를 반환하는 모형
		 Calendar cal = Calendar.getInstance();
		
		 System.out.println(Calendar.YEAR); // 1의 값을 가지고있음
		 int year = cal.get(Calendar.YEAR); //1넣으면 현재 년을 불러올 수 있음
		 System.out.println(year + "년");
		
		
		System.out.println(Calendar.MONTH); //2의 값을 가지고있음
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1 +"월");
		
		System.out.println(Calendar.DATE); //5의 값을 가지고있음
		int day = cal.get(Calendar.DATE);
		System.out.println(day + "일"); //일
		
		int hour = cal.get(Calendar.HOUR); //시
		int min = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
		
	}
}
