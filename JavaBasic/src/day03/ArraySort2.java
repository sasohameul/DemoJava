package day03;

import java.util.Arrays;

public class ArraySort2 {
	
	public static void main(String[] args) {
		
//		//버블 정렬- 가장느림 (큰 값을 뒤로 보낸다)
		int[] arr = {5,23,1,43,200,100,40};
//		// 5,1,23,43,100,40,200 //1회전 바로 옆 숫자 비교해서 큰 값을 뒤로가게 바뀜
//		// 1,5,23,43,40,100,200 //2회전
//		// 1,5,23,40,43,100,200 //3회전 - 정렬 완성
//		
//		//바깥 반복문은 -회전수
//		//안쪽 반복문이
//		
//		for(int i = 0; i < arr.length-1; i++){
//			
//			for(int j = 0; j < arr.length-i-1; j++) {
//				
//				if(arr[j] > arr [j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//			
//		}
//		
//		
//		System.out.println(Arrays.toString(arr));
		
		//아주 유용한 기능
		Arrays.sort(arr); //오름차순 정렬, 가장 빠른 퀵정렬기능!
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
	}	


}
