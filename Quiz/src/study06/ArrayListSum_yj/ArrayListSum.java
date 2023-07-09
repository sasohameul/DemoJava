package study06.ArrayListSum_yj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSum {

	public static void main(String[] args) {
		
		
	/*
	 * 사용자 입력으로 정수 데이터를 받아 ArrayList 에 저장 후, 
		ArrayList에 저장된 모든 정수(중복 허용)의 합을 구하여 출력한다. 
	
		<조건>
		1. 사용자 입력은 공백으로 구분하여 한줄로, 한 번만 사용한다.
	
		2. 정수만 받는다.
	
		3. 만약, 정수 외 입력이 있다면, 
	  	   경고문 “주의! 정수만 입력하세요, 다시 입력바랍니다.” 출력 후, 배열 내 요소 없애고, 
	       다시 입력받는다. 
	
		4. 정상적인 값을 입력받았을때에만 결과값을 출력하고 종료
	 * 
	 */
				

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
						
			while(true) {
								
				System.out.print("저장시킬 정수를 입력하세요 (공백으로 구분) =>");
				String num = br.readLine();
				//공백으로 자름
				String[] arrNum = num.split(" ");
				
				//합계
				int sum = 0;
				//list의 인덱스
				int index = 0;
				
				try {
					
					for(String s : arrNum) {
						
						list.add(Integer.parseInt(s));
						sum += list.get(index++);
						
					}
					
				} catch (Exception e) {
					
					System.out.println("***주의! 정수만 입력하세요, 다시 입력바랍니다.***");
					//입력을 새로 받기 위해 리스트 내 요소들을 없애준다.
					list.clear();
					//틀린 입력값을 받아서 catch문에 들어와 메소드가 종료되므로 다시 실행위해 continue;
					continue;
					
				}
				
				System.out.println("=================[결과]=====================");
				System.out.println("저장한 배열 값:" + list);
				System.out.println("배열에 있는 정수들의 합 : " + sum);
				break;
				
			} 
		
			br.close();
			
				} catch (Exception e2) {
					
					e2.printStackTrace();

				}
		
		
				
		
		
		
		
	}

}
