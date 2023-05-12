package quiz16;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * updown 게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수: x회를 출력하고 종료
		 * 
		 * + 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int a = (int) (Math.random()* 100) +1;
		int count = 0;
		
		while(true) {
			
			try {
				System.out.print("게임 시작>");
				int num = scan.nextInt();
				count++;
				
				if(a > num ) {
					System.out.println("더 큰 수를 입력하세요");
					
				} else if(a < num ) {
					System.out.println("더 작은 수를 입력하세요");
					
				} else  {
					
					System.out.println("정답!");
					System.out.println("시도 횟수:" + count);
					break;
				}
				
			} catch(NumberFormatException e) {
				
				System.out.println("0보다 크거나 100이하의 숫자로 입력바랍니다.");
				scan.nextLine();
				count++;
				
				
			} catch (Exception e) {
			
				System.out.println("정수로 입력하셔야합니다.");
				scan.nextLine();
				count++;


		}
	scan.close();
	}



}
}