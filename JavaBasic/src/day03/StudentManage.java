package day03;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//학생 정보를 등록할 배열을 while문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];

		//고객수
		int count = 0;
		//조회할 위치
		int index = -1;

		x:while(true){

			System.out.println("[정보] 고객수:" + count + ", 조회 위치:" + index);
			System.out.println("[메뉴]1.추가, 2.이전 정보, 3.다음 정보, 4.현재정보, 5.정보 수정, 6.정보 삭제, 7.종료");
			System.out.println("========================================================================");
			System.out.print("메뉴 입력>");
			String menu = scan.next();

			switch (menu) {
			case "추가":
			case "1":	

				System.out.println("********사용자 정보 입력**********");
				System.out.print("이름>");
				String name = scan.next();

				nameList [count] = name;

				System.out.print("성별>");
				String gender = scan.next();

				infoList [count] = gender;

				System.out.print("생년월일>");
				int birth = scan.nextInt();

				ageList [count] = birth;

				index++;
				count++;

				System.out.println(Arrays.toString(nameList));
				System.out.println(Arrays.toString(infoList));
				System.out.println(Arrays.toString(ageList));

				/* 추가:
				 * 이름, 성별, 간단한 정보를 입력 받아서 각각의 배열에 순서대로 저장될 수 있게 처리합니다.
				 * count를 증가합니다.
				 * 
				 */
				break;

			case "2":


				if(index <= 0) {

					System.out.println("조회할 정보가 없습니다.");
				} else {
					index--;

					System.out.println("******이전 정보******");
					System.out.println(nameList[index]+ " / " + ageList[index]+ " / " + infoList[index]);
				}


				/* 
				 * 이전 정보 출력:
				 * 정보 출력은 index 위치로 출력합니다.
				 * 이전 정보 출력을 누르면 index를 -1시키고 해당 위치에 정보를 출력.
				 * 조건
				 * index가 0보다 작다면 ,출력하지 않도록 처리.
				 */

				break;

			case "3":


				if(index >= count-1 ) {

					System.out.println("조회할 정보가 없습니다.");

				} else {
					index++;
					System.out.println("******다음 정보******");
					System.out.println(nameList[index]+ " / " + ageList[index]+ " / " + infoList[index]);
				}
				/*
				 * 다음 정보 출력:
				 * 다음 출력은 index위치로 출력합니다.
				 * 다음 정보 출력을 누르면 index를 +1시키고 해당 위치에 정보를 출력.
				 * 
				 * 조건
				 * count와 index간의 관게를 생각해서
				 * count-1보다 index가 같거나 크다면 출력하지 않도록 처리. 
				 */

				break;

			case "4":

				if(index >= 0 && index <= count-1) { //출력이 가능한 조건

					System.out.println("******현재 정보******");
					System.out.println(nameList[index]+ " / " + ageList[index]+ " / " + infoList[index]);

				} else {
					System.out.println("현재 위치에 회원 정보가 없네요");
				}
				System.out.println(Arrays.toString(nameList));
				System.out.println(Arrays.toString(infoList));
				System.out.println(Arrays.toString(ageList));
				
				/*
				 * 현재 정보 출력
				 * index가 가르키고 있는 위치 정보를 출력
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리. 
				 * 
				 */
				
				break;

			case "5":


				if(index >= 0 && index <= count-1) {

					System.out.println("********현재 정보 수정***********");
					System.out.println(index + "번째 위치를 수정합니다.");

					System.out.println("현재정보:"+ nameList[index]);

					System.out.print("수정할 이름>");
					nameList[index] = scan.next();

					System.out.print("수정할 성별>");
					infoList[index] = scan.next();

					System.out.print("수정할 생년월일>");
					ageList[index] = scan.nextInt(); 

				} else {

					System.out.println("****** 현재 위치에 수정할 정보가 없습니다. ******");
				}


				/*
				 * 정보 수정
				 * 새로운 이름, 나이, 정보를 입력 받아서
				 * 현재 위치를 수정해주면 됩니다.
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리
				 * 
				 */

				break;

			case "6":
				/*
				 * 현재 정보 삭제.
				 * 현재 삭제하려는 index 부터 ~~~뒤에 있는 배열 요소를 당겨와서 덮어씌웁니다.
				 * 
				 * 사람수를 감소시켜야함.
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리
				 * 
				 */

				if(index >= 0 && index <=count -1) {

					//삭제 가능한 조건

					System.out.println("****** 정보 삭제 *******");
					System.out.println(nameList[index] + "님 정보가 삭제되었습니다.");

					for(int i = index; i < count-1; i++) { // count와 length를 똑같다고 보면 됨


						nameList[i] = nameList[i+1];
						infoList[i] = infoList[i+1];
						ageList[i] = ageList[i+1];
						
					}
					count--; //사람수를 하나 줄여서 마치 삭제한 것 처럼 처리
					index--;	
				} else {

					System.out.println("***현재 위치에 삭제할 정보가 없습니다.***");
				}
				
				System.out.println(Arrays.toString(nameList));
				System.out.println(Arrays.toString(infoList));
				System.out.println(Arrays.toString(ageList));
				
				break;

			case "7":
				/*
				 * while문의 탈출
				 * 				 
				 */
				System.out.println("*****프로그램이 종료되었습니다.*******");			

				break x;

			default:
				System.out.println("잘못 입력했습니다.");
				break;




			}

		}
		scan.close();
	}
	
	
}









