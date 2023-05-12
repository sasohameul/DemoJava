package quiz19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); //배열대체
		
		
		while(true) {
			
			System.out.println("[1.등록 | 2. 회원 정보 확인 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 프로그램 종료");
			System.out.println("메뉴 (번호)>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.println("회원 정보를 입력하세요");
				System.out.print("이름>");
				String name = scan.next();
				
				System.out.print("나이>");
				int age = scan.nextInt();
				
				User u = new User(name, age);
				
					list.add(u);
					
					System.out.println(u.getName() + " / " + u.getAge() + "가 등록되었습니다.");
					
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				break;
			case 2:
				for(User user : list)
					System.out.println(user.getName() + " / "+ user.getAge());
				
				//리스트에 담긴 모든 회원 이름, 나이를 출력
				break;
			case 3:
				//int count = 0;
				
				System.out.print("찾으실 이름을 입력해주세요>");
				name = scan.next();
				
				boolean bool = true;
				for(int i = 0; i < list.size(); i++) {
					
					User a = list.get(i);
					
					if(a.getName().equals(name)) {
						
						System.out.println("찾으시는 회원 정보입니다.");
						System.out.println(a.getName() + a.getAge());
						bool = false; //실행했음
						break;
					} else {
						System.out.println("찾는 이름은 없습니다.");
						//count++;
					}
					
				}
//				if(count == list.size()) {
//					
//					System.out.println(name + "은 목록에 없습니다.");
//				}
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력
				//조건 - 찾는 이름이 없다면 "~~는 목록에 없습니다" 출력합니다.
				break;
			case 4:
				System.out.print("삭제할 이름을 입력하세요>");
				name = scan.next();
				
				for(int i = 0;i < list.size(); i++) {
					
					User a = list.get(i);
					
					if(a.getName().equals(name)) {
						
						list.remove(i);
						System.out.println(name + "이 삭제되었습니다.");
						break;
					}
					
				}
				//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 첫번째 1개만 삭제
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				break;
			}
					
		}
		
	}
	
}
