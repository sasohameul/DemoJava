package No5_NumOrChar;

import java.util.Scanner;
import java.util.TreeSet;

public class Study06_5_HJ {

	public static void makeSetInt() {

		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("숫자를 입력해주세요>");

		Scanner sc = new Scanner(System.in);
		int num = 0;

		while(set.size() < 10) {
			num = sc.nextInt();
			if(set.contains(num)) {
				System.out.println("중복값입니다. 숫자를 다시 입력하세요.");
			}
			set.add(num);
		}
		System.out.println(set);
	}

	public static void makeSetString() {

		TreeSet<String> set = new TreeSet<>();
		System.out.println("문자를 입력해주세요>");

		Scanner sc = new Scanner(System.in);
		String str = "";

		while(set.size() < 10) {
			str = sc.next();
			if(set.contains(str)) {
				System.out.println("중복값입니다. 숫자를 다시 입력하세요.");
			}
			set.add(str);
		}
		System.out.println(set);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("숫자나 문자를 10번 입력해주세요");
			System.out.println("1.숫자 2.문자 3.종료");

			int key = sc.nextInt();
			
			switch (key) {
			case 1: {
				makeSetInt();
				break;
			}
			case 2: {
				makeSetString();
				break;
			}
			case 3: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}
	}
}
