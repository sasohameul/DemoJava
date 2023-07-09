package study06.phonebook_hj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PhoneBook_Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			Person p = new Person();
			HashMap<String, Person> pb = new HashMap<>(5);

			System.out.println("전화번호 저장");
			System.out.println("==========================");
			for(int i = 1; i <= 5; i++) {

				System.out.print("이름 >> ");
				String name= br.readLine();

				System.out.print("번호 >> ");
				String phoneNum = br.readLine();

				pb.put(name,new Person(i,phoneNum));
				System.out.println(pb);
				System.out.println("------------------------");

			}

			while(true) {				

				System.out.println("검색할 이름 >>");
				String Sname= br.readLine();

				if(Sname.equals("exit")) {

					System.out.println("프로그램 종료");
					break;
				}

				if(pb.get(Sname) != null) {						

					System.out.println(pb.get(Sname).getOrder() + "번째, 전화번호:" + pb.get(Sname).getPhoneNum()); 

				} else {

					throw new Exception();

				}

			}


		} catch (Exception e) {

			System.out.println("없는 사람입니다.");
			System.out.println("---------------------");

		}

	} 

}