package day03;

import java.util.Arrays;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		// 배열은 삭제의 개념이 없습니다.
		// 뒷 요소를 앞으로 당겨와서 덮어 씌웁니다.
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int[] newArr= new int[arr.length-1]; //삭제한 후 복사할 새로운 배열
				
		int index = 5; //삭제할 위치
		for(int i = index; i < arr.length - 1; i++){
			
			arr[i] = arr[i+1];
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		//새로운 배열에, 기존 배열을 옮겨 담는 작업을 합니다.
		
		for(int i = 0; i < newArr.length; i++) {
			
			newArr[i] = arr[i];
		}
		
		// 기존 arr에 새로운 배열을 대입 후 newArr은 지움
		arr = newArr;
		newArr = null;
		
		System.out.println( Arrays.toString( arr));
		System.out.println( Arrays.toString( newArr));
		
	}

}
