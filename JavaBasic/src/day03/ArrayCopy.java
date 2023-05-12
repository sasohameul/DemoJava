package day03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//배열의 복사 - 길이가 고정
		
		//복사의 개념 2개 - 얕은 복사,깊은 복사
		//얕은 복사 => 주소값의 복사 (복사한 배열의 값을 바꾸면 원본 배열도 같이 바뀜에 주의!!)
		
		int[] arr = {1,2,3,4,5};
		int[] newArr = arr;
		
		newArr[0] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		
		//깊은 복사 - 완전히 새로운 배열을 만들고, 요소를 담는다.
		int[] arr2 = new int[arr.length]; //= new int[5];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
			
		}
		//값을 변경하더라도 원본 배열에는 영향이 없습니다.
		arr2[0] = 200;
		
		System.out.println("원본:" + Arrays.toString(arr));
		System.out.println("사본:" + Arrays.toString(arr2));
	}
}
