package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int rCount = 0;
		int wCount = 0;
	
		while(true) {

			int i = (int)((Math.random()*100) +1);
			int j = (int)((Math.random()*100) +1);

			int k = (int) (Math.random()*2) ;

			System.out.println("-----------------------");			
			System.out.println(i + (k == 0 ? "+" : "-") + j + "= ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();

			int correct = k == 0? i + j : i - j ; //실제 정답

			if(answer == 0) {

				System.out.println("프로그램 정상 종료");
				System.out.println("정답:" + rCount);
				System.out.println("오답:" + wCount);

				break;

			} 
			if (answer == correct) {

				System.out.println("정답!");

				rCount++;

			}

			else {

				wCount++;
				System.out.println("틀렸는데요?");
			}
		}


		scan.close();

	}
}
