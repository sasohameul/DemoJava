package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		//1. 두 정수를 입력을 받고, 큰 수를 출력하면 됩니다.
		// 단, 같은 수라면 "같은 수 입니다" 출력.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A점수 입력>" );
		int point = scan.nextInt();

		System.out.println("B점수 입력>" );
		int point2= scan.nextInt();
		

		if(point == point2) {
			System.out.println("같은 수 입니다.");
			
		} else if(point > point2){
		 System.out.println(point +"가 큰 수입니다.");
		} else if (point<point2) {
			System.out.println(point2 + "가 큰수입니다.");
		
		}
		scan.close();
		}
	
}

