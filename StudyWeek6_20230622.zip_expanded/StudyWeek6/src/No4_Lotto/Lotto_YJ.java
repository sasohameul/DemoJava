package No4_Lotto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Lotto_YJ {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			System.out.println("당신의 로또를 구매할 아이디는: hello_world");
			System.out.print("비밀번호를 입력하세요:");
			String pw = br.readLine();
			String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,}$";
			//왜 [A-Z]+[a-z]+[0-9]+[$@$!%*?&]+{8,}는 로그인 실패일까

			boolean result = Pattern.matches(pattern, pw);

			if(!result) {

				System.out.println("로그인 실패! 다음 주에 사세요~!");

			} else {

				System.out.println("로그인 성공!");


				int num;

				for(int i = 1; i <= 5; i++) {				
					
					//초기화 위해 for문 안에.. 
					Set<Integer> lotto = new HashSet<>();				
					
					while(lotto.size() !=5) {

						num = (int)(Math.random()*45+1);
						lotto.add(num);

					}

					ArrayList<Integer> list = new ArrayList<>(lotto);
					
					System.out.println("로또 구매 " + i + "번째:");
					System.out.println("로또번호: "+ list);
					
				}

				
			}

		}catch (Exception e) {
			
			
		}


	} 


}
