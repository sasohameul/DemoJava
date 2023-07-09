package No4_Lotto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Studysmg04_JS {
	public static void main(String[] args) {


		Collection<Integer> lottoSet = new HashSet<>();
		List<Integer> lottoList = new ArrayList<>();
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("당신의 로또를 구매할 아이디는: ");
		String id = scan.next();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = scan.next();

		if(id.equals("hello_world") && pw.equals(pw)) {
			System.out.println("로그인 성공");

			for(int i = 1; i <= 5; i++) {

				while(lottoSet.size() < 6) {
					lottoSet.add(rd.nextInt(45)+1);
					lottoList = new ArrayList<>(lottoSet);
				}
				System.out.println("로또 구매 "+i+"번째:");
				System.out.println("로또 번호: "+ lottoList);
				System.out.println();
				lottoSet.clear();
			}
		} else {
			System.out.println("로그인 실패! 다음 주에 사세요~!");
		}
	}
}
