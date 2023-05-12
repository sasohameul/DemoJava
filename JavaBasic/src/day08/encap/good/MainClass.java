package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.day = 2002;
		
		me.setYear(2022);
//		int year = me.getYear();
		System.out.println(me.getYear());
		
		
		me.setDay(31);
		int day = me.getDay();
		System.out.println(day);
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println(month);
		
		
		me.setSsn("920108-2051111");
		String ssn = me.getSsn();
		System.out.println(ssn);
	
	}
	
}
