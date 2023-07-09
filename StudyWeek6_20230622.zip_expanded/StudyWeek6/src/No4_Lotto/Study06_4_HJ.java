package No4_Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Study06_4_HJ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("로또 구매할 아이디 : hello_world");
		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.next();
		
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[a-zA-Z0-9$@$!%*?&]{8,}$");
		Matcher m = p.matcher(pw);
		
		if(m.find()) System.out.println("로그인 성공!");
		else {
			System.out.println("로그인 실패! 다음 주에 사세요~!");
			return;
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("로또 구매 " + i + "번째: ");
			HashSet<Integer> set = new HashSet<>();
			while(set.size()<6) {
				set.add(rd.nextInt(1, 46));
			}
			System.out.println("로또 번호: " + set + "\n");
			
		}
	}
}
