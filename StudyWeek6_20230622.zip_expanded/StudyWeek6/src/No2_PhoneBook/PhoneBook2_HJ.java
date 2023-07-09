package No2_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook2_HJ {
	public static void main(String[] args) {
		//학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Person> map = new HashMap<String, Person>();

		Scanner sc = new Scanner(System.in);

		System.out.println("전화번호 저장");
		System.out.println("=========================================");
		//5명의 사람 저장
		for(int i = 1; i <= 5; i++) {
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("번호 >> ");
			String ph = sc.next();
			map.put(name, new Person(i, ph));
			System.out.println("-----------------------------------------");
		}

		System.out.println("=========================================");
		//전화번호 검색
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.next(); //사용자로부터 이름 입력

			if(name.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}

			Person p = map.get(name); //이름에 해당하는 Student 객체 검색

			try {
				
				//name이 키. 저장되는 건 키값인 Student 객체
				if(p == null) throw new Exception("없는 사람입니다.");
				else System.out.println(p.num +"번째, 전화번호 : " + p.tel);

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}
			System.out.println("-----------------------------------------");

		}

		sc.close();
	}
}
class Person <T, V> {
	T num;
	V tel;
	public Person(T num, V tel) {
		this.num = num;
		this.tel = tel;
	}
}