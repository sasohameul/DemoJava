package study05.tokenizer_yj;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//연산자인지, 숫자인지 비교하기 위해 담을 변수 선언
		String token = "";
		//숫자이면 값을 계산하기위해 저장할 변수 선언
		int total= 0;
		
		//수식이 다 끝났으면 반복문을 끝내기 위해(break) 별칭 x을 붙여준다
		x: while(true) {

			System.out.print("수식 입력=>");
			String cal = scan.nextLine();
			scan.close();
			
			//구분자를 기준으로 문자열을 분리할 때, 구분자에 토큰을 넣을 예정이므로 true
			StringTokenizer st = new StringTokenizer(cal, "*,+,-,/", true);

			try {

				while(st.hasMoreTokens()) {
					
					//입력한 순서대로 값을 하나씩 가져와서 비교하기 위해 
					token = st.nextToken();
					
					//+ 면 덧셈을 하기 위해
					if(token.equals("+")) {
						
						token = st.nextToken();
						//만약에 여기서 연산자 다음 또 연산자를 입력하면 int로 변환할 수 없으므로 오류 발생해서 catch부분으로 이동한다.
						//덧셈
						total += Integer.parseInt(token);
						
					} else if(token.equals("-")) {
						
						token = st.nextToken();
						//뺄셈
						total -= Integer.parseInt(token);

					} else if(token.equals("*")) {

						token = st.nextToken();
						//곱셉
						total *= Integer.parseInt(token);
					} else if(token.equals("/")) {

						token = st.nextToken();
						//나눗셈
						total /= Integer.parseInt(token);

					} else {
						//연산자가 아니라면 숫자값 저장
						total = Integer.parseInt(token);
					}


				} 

				System.out.println("수식 결과 값:" + total);
				break x;
				
			} catch (NumberFormatException e) {

				System.out.println("수식 입력 오류!!!");

			}

		}

	}

}