package day02;

public class MultiForEx02 {
	
	public static void main(String[] args) {
	
		//회전수가 변경되는 중첩 반복문
		//i 값에 따라서 j의 값을 변경
		//i가 1일때는 1바퀴, 2일때는 2바퀴, 3일때는 3바퀴
		
		for(int i = 1; i<=10; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.println(i + "-" + j);
				
			}
			
			
			
		}
		
		//별 출력하기
		/*
		 * 
		 **
		 *** 
		 ****
		 ***** 
		 */
		
		//행
		for(int i = 1; i <=5; i++) {
			//출력
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		      *
		     ***
		    *****
		   *******
		  *********
		  		  
		 */
		
		int star = 5;
		
		for(int i = 1; i<=star; i++) {
			//공백
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			//별 출력
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
				
		
		
		
	}

}
