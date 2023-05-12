package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {

		/*List 1번
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 
		 * 2. list에 값을 순서대로 출력
		 * 
		 */

		List<Integer> list = new ArrayList<>();

		for(int i = 1; i <=20; i++) {

			list.add(i);
		}

		for(int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		/*
		 * List2번
		 * 1. User를 저장하는 list 생성
		 * 2. 3개의 각각 다른 User 객체를 만들고 순서대로 저장
		 * 3. User객체 안에 홍길동이 있으면 해당 객체의 name과 age를 출력하는 코드
		 * 4. User객체 안에 홍길자가 있으면 해당 객체를 삭제하는 코드
		 * 
		 */

		List<User> lists = new ArrayList<>();

		User u1 = new User("홍길동", 10);
		User u2 = new User("이순신", 10);
		User u3 = new User("홍길자", 10);

		lists.add(u1);
		lists.add(u2);
		lists.add(u3);

		System.out.println(lists.toString());

			/*
			User u = lists.get(i);

			String name = u.getName();

			if(name.equals("홍길동")) {

				System.out.println(u.getName());
				System.out.println(u.getAge());

			}
			 */
		for(int i = 0; i < lists.size(); i++) {
		
			User u = lists.get(i);

			if(u.getName().equals("홍길동")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());

			} 
		}
			
			System.out.println("-------------------");
			//////////////////////////////////////
			//홍길자가 있으면 삭제
			
			for(int i = 0; i < lists.size(); i++) {
				
				User u = lists.get(i);
				
				if(u.getName().equals("홍길자")) {
					
					lists.remove(i);
					
				}
			}
			
			System.out.println(lists.toString());
			
		}



	}

