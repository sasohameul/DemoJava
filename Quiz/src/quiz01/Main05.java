package quiz01;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		switch (score/10) {
		case 10:
		
			System.out.println("A");
			break;
		
		case 9:
			
			System.out.println("A");
			break;
		case 8:
			
			System.out.println("B");
			break;
		case 7:
			
			System.out.println("C");
			break;
		case 6:
			
			System.out.println("D");
			break;

		default:
			System.out.println("F");
			break;
		}
		
		scan.close();
		
	}
}
