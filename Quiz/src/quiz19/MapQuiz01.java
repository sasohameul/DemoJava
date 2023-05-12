package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			 if(menu == 1) {
				
				System.out.print("등록하실 신규 메뉴>");
				String food = scan.next();
				if(map.containsKey(food)) {
					
					System.out.println("이미 존재하는 메뉴입니다. 다른 메뉴로 뵙겠습니다.");
					
				} else {
					System.out.print("가격을 입력하세요>");
					int price = scan.nextInt();
					map.put(food, price);
					
					System.out.println(food + "-" + price + "원 이 등록되었습니다.");
				}

			} else if(menu == 2) { //메뉴판 전체 보기

				System.out.println("===== 메뉴판 ======");
				Set<Entry<String, Integer>> entrySet = map.entrySet();
				
				for( Entry<String, Integer> entry : entrySet) {
					
					System.out.println("메뉴:" + entry.getKey() + ", 가격:" + entry.getValue());
				}
				
			} else if(menu == 3) {// 메뉴판 수정

				System.out.print("어떤 메뉴의 가격을 변경하시겠어요?>");
				String food = scan.next();
				
				if(map.containsKey(food)) {
					
					System.out.print("변경할 가격 입력>");
					int price = scan.nextInt();
					map.put(food, price);
					System.out.print(food+ "의 가격이" + price + "로 변경되었습니다!" );
					
				} else {
					
					System.out.println("입력한 메뉴는 현재 등록되어있지않습니다.");
					System.out.println("메뉴로 등록 후 이용바랍니다!");
				}
				
			} else if(menu == 4) { //삭제
				
				System.out.print("어떤 메뉴를 삭제하시겠어요?>");
				String food = scan.next();
				if(map.containsKey(food)) {
					
					map.remove(food);
					System.out.println(food + "이 삭제되었습니다.");
					System.out.println("다음에 또 이용해주세요!");
					
				} else {
					
					System.out.println("등록되어있는 메뉴를 입력해주세요!");
				}

			} else if(menu == 5) {
			
				System.out.println("다음에 또 오세요!ㅃ2");
				System.exit(0);
				//break;
			}

		}


	}
}
