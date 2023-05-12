package day02;

public class MultiForEx01 {

	public static void main(String[] args) {
		
		// 바깥 9, 안쪽9
		
//		for(int i = 1; i <=9; i++) {
//			
//			System.out.println(i + "단");
//			for(int j = 1; j<=9; j++) {
//				
//				System.out.println(i + "-" + j);
//			}
//			
//		}
		
		// 2단~9단까지 구구단 모두 출력
		
		
		for(int a = 2; a <= 9; a++) {
			
			System.out.println("구구단:" + a + "단");

			for(int b = 1; b <=9; b++) {
				
				System.out.println(a + " x " + b + " = " + (a*b) );
			
				
			}
               System.out.println("---------");			
		}
		
		
		
		
		
		
	}
	
}
