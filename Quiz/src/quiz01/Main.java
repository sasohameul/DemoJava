package quiz01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("N>");

		int N = scan.nextInt();
		int a = 1;
				
		while(a < 10) {
			
			if(N>=1 && N<=9) {
				
			}
			
			System.out.println(N + " " + " * " + a + " = " + (N*a));						
			a++;
		}

    
		scan.close();




	}	
}	









//		     Scanner scan = new Scanner(System.in);
//		     
//		     int year = scan.nextInt();
//			 
//			 if ((year %4 == 0 && year %400 == 0)  || year %4 == 0 && year %100 !=0 ) {
//				 
//				 System.out.println(1);
//			 } else {
//					 System.out.println(0);
//				 }
//						
//			}
//			 
//			 
//				




















//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a - b);
//		
//	}




