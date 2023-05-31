package study04.RC;

public class Main_LG {
	
	public static void main(String[] args) {
		
		TV tv = new SmartTV();
		SmartTV sm = (SmartTV)tv;
		
		if(sm instanceof TV) {
			tv.on();
			sm.iptv();
			sm.up();
			sm.up();
			sm.up();
			sm.up();
			sm.up();
			
			sm.down();
			sm.down();
			sm.down();
			sm.down();
			sm.down();
			sm.down();
			
			
			
			
			
		} else {
			
			System.out.println("실행 불가");
			
		}
		
		
		AC ac = new AC();
		
		ac.down();
		ac.down();
		ac.down();
		ac.down();
		ac.down();
		ac.down();
		ac.down();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();
		ac.up();

		
		
		
		
		
	}

}
