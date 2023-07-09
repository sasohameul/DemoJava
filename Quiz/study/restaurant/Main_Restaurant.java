package study04.restaurant;

public class Main_Restaurant {
	
	public static void main(String[] args) {
		
		String[] sm = {"안심", "등심", "채끝", "토마호크"};
		String[] dm = {"와인","맥주", "소주", "콜라"};
		
		int num = (int) (Math.random() * 3) + 1;
			
		Steak s = new Steak(sm[num], 150,45000);
		s.sell(num);
					
		Drink d = new Drink(dm[num], 350, 8000);
		d.sell(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
