package study05.blockmove_hj;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BlockMove {
	
//	9칸짜리 블록 안에서 좌우로 이동하는 문제입니다. 
//
//	1. 한 클래스 내에서 main(), move(), setRandom() 메소드 정의 
//	    : main()은 아래 코드와 동일
//	    : setRandom()은 매개변수 없고, 0~8 사이의 숫자 반환
//	    : move() 매개변수 X, 반환 X
//
//	2. move() 메소드 기능
//	    : □가 9개 들어있는 배열 생성
//	    : 랜덤 수 뽑아서 해당 위치 블록(배열 위치)은 ■ 저장
//
//	    : [1.왼쪽이동 / 2.오른쪽이동 / 3. 종료] 입력 받아 무한 실행
//	    : 숫자가 아닌 문자를 입력하면, 예외 처리로 "오류 발생! 숫자를 입력하세요.” 메시지
//	      (InputMismatchException 사용해보기)
//	    : 1을 입력하면 ■가 왼쪽으로 한 칸 이동합니다. 
//	      더이상 이동 못하면, 예외처리로 "왼쪽으로 더이상 이동 못함” 메시지
//	    : 2를 입력하면 ■가 오른쪽으로 한 칸 이동합니다. 
//	      더이상 이동 못하면, 예외처리로 "오른쪽으로 더이상 이동 못함” 메시지
//	    : 3을 입력하면 프로그램 종료
//	    : 그 외의 숫자 입력하면 "1~3 사이의 숫자만 입력” 출력 
//
//	    : 1 또는 2에서 예외 처리 시, ■의 위치는 랜덤으로 다시 정해져야 합니다.


	public static void main(String[] args) {

		move();


	}


	public static int setRandom() {

		Random r = new Random();

		int n = r.nextInt(9);

		return n;
	}


	public static void move() {

		String[] block = {"□","□","□","□","□","□","□","□","□"}; 

		int n = setRandom();

		block[n] = "■";
		//검정블럭 인덱스가 바뀌어야하니까 맨처음에는 랜덤으로 나온 숫자 저장할 인덱스 초기화 
		int index = n;

		while(true) {

			System.out.println(Arrays.toString(block));
			System.out.println("[1.왼쪽이동 / 2.오른쪽이동 / 3.종료]");
			//근데.. scan.close는 어디에 해야할지.. 모르겠다요
			Scanner scan  = new Scanner(System.in);
			System.out.print(">> ");
			
			try {
				
				int m = scan.nextInt();

				switch (m) {

				case 1://왼쪽 이동

					block [index] = "□";
					block[index-1] =  "■";

					//인덱스가 0인 상태에서 1번 선택하면 index-1 값이 음수이므로 오류 발생한 쪽으로 던져버리기
					if(index <= 0) {

						throw new ArrayIndexOutOfBoundsException();
					} else {
						//새로운 검정 블럭인덱스 번호를 다시 저장 
						index = index-1;

					}

					System.out.println("-------------------------");

					break;

				case 2://오른쪽 이동 

					block [index] = "□";
					block[index+1] =  "■";

					//인덱스가 8인 상태에서 2번을 선택하면 index+1 값이 배열길이의 범위를 넘어서기때문에 throw로 처리 
					if(index >= 8) {

						throw new ArrayIndexOutOfBoundsException();

					} else {

						index = index+1;

					}

					System.out.println("-------------------------");

					break;

				case 3:

					System.out.println("이동 종료");
					System.exit(0);

					break;

				default:

					System.out.println("1~3번만 선택해 주십시오");
					System.out.println("--------------------------");

					break;
					
				}

			} catch(ArrayIndexOutOfBoundsException e) {

				//오른쪽과 왼쪽 경우의 수 두가지가 있으니까 조건문으로 나누고, 다시 처음으로 돌아가
				if(index <= 0) {

					System.out.println(">> 오류 발생! 왼쪽으로 더 이상 이동 못함");
					System.out.println("----------------------------");
					move();

				} else if(index >= 8) {

					System.out.println(">> 오류 발생! 오른쪽으로 더 이상 이동 못함");
					System.out.println("----------------------------");
					move();

				}

			} catch (InputMismatchException e) {

				System.out.println("오류 발생! 숫자를 입력하세요.");
				System.out.println("-------------------------");

			}


		}


	}



}
