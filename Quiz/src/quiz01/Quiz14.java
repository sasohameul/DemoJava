package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {


		/*
		 * 1. 가로, 세로길이를 입력받습니다.
		 * 2. 가로, 세로길이만큼 사각형을 출력합니다.
		 * 4. 단, 윤곽만 나오면 됩니다.
		 * 
		 * 
		 */ 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int w = scan.nextInt();
		
		System.out.print("세로>");
		int h = scan.nextInt();
		
		
		for(int a = 1; a <= h; a++) {
			
			
			if(a == h || a == 1) {
	
			}
			System.out.println("");
			
			for(int b = 1; b <= w; b++) {
				
				if(b == 1 || b == w) {
					
				}
				System.out.print("*");
				
				
				
			}
		}
		
		scan.close();
		
	}	
		
}	
		
		
		
		
		
		









