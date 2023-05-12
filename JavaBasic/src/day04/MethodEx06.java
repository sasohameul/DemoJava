package day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {

		// Queue - First In First Out(FIFO - 선입선출)

		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= 4; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}
		
		
//		pop();
//		int r = pop();
//		System.out.println(r);
//		System.out.println(Arrays.toString(arr));

	}

	
	static int[] arr = {};

	static void push(int data) {

		//1. 배열의 크기를 +1 한 새로운 배열을 만들고
		int [] temp = new int[arr.length+1];

		//2. arr배열의 요소를 복사해서 가지고온다
		for(int i = 0; i < arr.length; i++) {

			temp [i] = arr[i];
		}
		//3. 마지막에 추가
		temp [temp.length-1] = data;

		//4. temp 배열을 원본배열에 옮겨담는다.
		arr = temp;
		temp = null; // temp는 지움
	}

	//배열의 맨 앞 요소부터 삭제되도록 처리.
	static int pop() {

		if(arr.length > 0) {
			
			int del = arr[0]; // 삭제할 데이터 백업
			int [] temp = new int[arr.length-1]; // arr-1인 사본 배열 생성

			for(int i = 0; i < temp.length; i++) {

				temp[i] = arr[i+1]; // 배열의 1번째 요소~마지막까지 옮겨담는다.
			}

			arr = temp; // 원본배열을 temp로 변경함
			temp = null;

			return del; // 삭제한 데이터를 반환
		}

		return 0;
	}




}
