package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0; //합계 변수
		
		for(int a = 1; a <=10; a++) {
			
			sum +=a;
			
		}
	
		 System.out.println("합계:" + sum);
		 
		 System.out.println("--------------");
		 
		 
		 int sum1 = 0;
		 
		 for(int a= 10; a >=1 ; a--) {
			 
			 sum1 +=a;
			 System.out.println(a);
		 }
		
		
		
		
	}
}
