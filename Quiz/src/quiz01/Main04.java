package quiz01;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		
		
		if(A >= -10000 && A <= 10000 && B >= -10000 && B <= 10000) {
		
		if(A > B) {

			System.out.println(">");

		} else if (A < B) {

			System.out.println("<");

		} else if (A == B) {

			System.out.println("==");
		}


		scan.close();
	}

}

}