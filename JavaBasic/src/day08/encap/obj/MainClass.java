package day08.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Hotel h = new Hotel(new Chef());
		Chef c = new Chef();
		Hotel h = new Hotel(c);
		
		 h.getChef(); //반환유형을 보는 습관 들이기
		
		Chef chef = h.getChef();
		
		System.out.println(c == chef);
		
		//객체 안에는 객체가 들어간다.
		
		
		chef.cooking();
		
		
		
		//Chef를 생성해서 Hotel한테 전달
//		Chef chef = new Chef();
		h.setChef(new Chef());
		
//		Chef c = h.getChef(); // Hotel 안에 있는 Chef를 꺼냄
		c.cooking();
		
	}
}
