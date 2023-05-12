package quiz05;

public class Calculator {

	int result;
	double pi = 3.14 ;
	
	void add(int a) {
		
		result += a;
		System.out.println("누적" + result);
		
	}
	
	void sub(int a) {
		
		result -= a;
		System.out.println("차감" + result);
	}
	
	double circle(int a) {
		
		System.out.println("원의 넓이는? " );
		return pi* a*a;
	}
	
	
}
