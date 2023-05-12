package day02;

public class BreakEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <=10; i++) {
//			
//			System.out.println(i);
//			if(i == 5) break;
//			
//			//System.out.println(i); 위치에 따라 출력값 달라짐
//			
//		}
		
		
		/* 무한 반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용합니다.
		 * - 자바에서는 while(true) 문장을 많이 사용합니다.
		 * - 특정 조건에서 탈출하는 형식으로 사용됩니다.
		 *  
		 */
		
		int i = 1;
		while(true){
			System.out.println(i);
			
			if(i == 15) {
				System.out.println("그만");
				break;
			}
			
			i++;
		}
		
		
		
	}
	
}
