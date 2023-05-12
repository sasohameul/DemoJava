package quiz01;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		
		// 1) 1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count (개수)
	
		// 2) 50~100까지의 합계
		
		//1) 
		
		int a = 1;
		int b = 0;
		
		while (a <= 1000) {
			
			if(a % 4 ==0 && a % 8 != 0) {
			
				b++; // 1증가. 누적의 개념
			}
			
		a++;
				
		}
				
		System.out.println("개수:" + b); 
		
		
		
		//2)
		
		int c = 50;
		int sum = 0; //합계 누적
		
		while (c <=100) {
			
			sum += c ;
			c++;
		}	
				
		System.out.println("합:" + sum);
		
	}
		

}
