package day03;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		
		//배열
		
		int[] arr;
		
		//배열의 생성
		
		arr = new int[5];
		
		//배열의 초기화
		//arr[인덱스번호] = 값;
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 모형을 문자열로 출력
	
		System.out.println(arr); //주소값이 나옴(배열의 생성 위치) 
		
		System.out.println(Arrays.toString(arr)); //실제 모습을 나타내줌 [10,20,30,40,50]
		
		//배열 값의 변경
		
		arr [2] =100;
		
		System.out.println(Arrays.toString(arr)); //값이 변경됨[10,20,100,40,50]
		
		//배열의 길이
		
		System.out.println("배열의 길이:" + arr.length);
		
		//배열을 선언하는 다양한 방법
		
		// 1)
		int[] arr2 = new int[3];
		System.out.println(Arrays.toString(arr2));
	
		// 2)
		int[] arr3 = new int[] {1,2,3};
		System.out.println(Arrays.toString(arr3));
		
		//3)
		int[] arr4 = {1,2,3};
		System.out.println(Arrays.toString(arr4));
		
		//배열은 초기값을 지정하지않으면 기본값으로 자동 초기화
		//int는 0, double은 0.0, string은 null
		
		
		
		
		
		
	}
	

}
