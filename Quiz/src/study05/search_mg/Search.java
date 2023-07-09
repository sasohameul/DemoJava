package study05.search_mg;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
	
	public static void main(String[] args) {
		
		/*
		Scanner를 사용하여 사용자로부터 정수 값을 입력받고, 입력된 값들을 배열에 저장한 뒤에
		sort(), binarySearch(), toString(), equals() 메서드를 활용합니다. 
		각각의 메서드를 사용하여 배열을 정렬하고, 원하는 값을 탐색하며, 배열을 문자열로 변환하고, 
		두 개의 배열을 비교하여 아래와 같이 출력해주세요.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 정수의 개수: ");
		int c = scan.nextInt();
		System.out.println(c +"개의 정수를 입력하세요: ");
		
		int[] arr = new int[c];
		
		for(int i = 1; i <= c; i++ ) {

			System.out.print("정수의 값#"+i + ":" );
			int n = scan.nextInt();
			arr[i-1] = n;
		}
		
		Arrays.sort(arr);
		
		System.out.print("탐색할 정수의 값: ");
		int s = scan.nextInt();
		
		System.out.println(s + "가 있는 인덱스 번호:" + Arrays.binarySearch(arr, s));
		
		System.out.println("정렬된 배열: " + Arrays.toString(arr));
		
		scan.close();
		
		
		
		
	}

}
