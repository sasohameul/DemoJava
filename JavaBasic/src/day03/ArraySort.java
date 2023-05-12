package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		// 배열 정렬 - 정렬은 대략 7개 정도 있음 (알고리즘이라고 부름)
		
		// 선택정렬
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 1,23,5,43,200,100,40 -1회전 후 (5 & 1 switch)
		// 1,5,23,43,200,100,40 -2회전 후 (23& 5 switch)
		// 1,5,23,43,200,100,40 -3회전 후 ( x )
		// 1,5,23,40,200,100,43 -4회전 후 (43 & 40)
		// 1,5,23,40,43,200,100 -5회전 후 (200 & 43)
		// 1,5,23,40,43,100,200 -6회전 후 (200 & 100)
		
		// 바깥 반복문은 회전수라고 생각할 수 있음
		// 안쪽 반복문은 비교할 값
		
		for(int i = 0; i < arr.length-1; i++) { // 0~5까지 돌기만해도 비교가 끝나므로 길이-1

			//비교의 시작값이 i+1, 비교는 끝까지 가기때문에 인덱스의 길이로 설정
			for (int j = i+1; j< arr.length; j++) { //i+1~끝
				
				if(arr[i] > arr[j]) { // 비교대상이 작다면, 자리 바꾸기 / 부등호를 바꾸면 내림차순
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
