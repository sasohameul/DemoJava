package quiz01;

import java.util.Arrays;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자를 추출
		 *    arr를 랜덤하게 10번 섞어줍니다.
		 *    0~2번째 값을 새로운 배열로 옯겨 담아보세요.
		 * 
		 * 
		 */
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int i = 0;
		int temp = 0;
		
		while (i <= 10) {
				
			int ran = (int) (Math.random()*9); // 0~8
			int ran2 = (int)(Math.random()*9); // 0~8
			
			temp = arr[ran];
			arr[ran] = arr[ran2];
			arr[ran2] = temp;
			
			i++;
		}
			
		int[] arr2 = {arr[0], arr[1],arr[2]};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
				
		
		
		
	}

}
