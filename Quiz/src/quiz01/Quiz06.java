package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*if 구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력받습니다.
		 * 가장 큰 값, 중간값, 작은값을 구분해서 출력. (조건 - 같은 수는 없다 라고 가정)
		 * 
		 * 
		 * 입력 
		 * 15,30,7 -> max:30, mid:15, min:7
		 * 1,2,3 -> max:3, mid:2, min:1
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 다른 숫자를 입력하세요");
		
		System.out.print("n1>");
		int n1 = scan.nextInt();
		
		System.out.print("n2>");
		int n2 = scan.nextInt();
		
		System.out.print("n3>");
		int n3 = scan.nextInt();
		
		if (n1> n2 && n2>n3){ 
		System.out.printf("max:" + n1+ " "+ "mid:" + n2+ " "+ "min:" + n3);
		}  else if (n2>n1 && n1>n3) {
				System.out.printf("max:" + n2+ " "+"mid:" + n1+" "+ "min:" + n3);
			} else if (n3>n1 && n1>n2){
				System.out.println("max:" + n3+ " "+"mid:" + n1+" "+ "min:" + n2);
			} else if (n3>n2 && n2>n1) {
				System.out.println("max:" + n3+ " "+"mid:" + n2+" "+ "min:" + n1);
			} 
	 
		scan.close();
			
		}
			
	}

