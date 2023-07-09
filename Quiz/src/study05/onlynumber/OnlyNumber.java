package study05.onlynumber;

import java.util.Arrays;

public class OnlyNumber {

	public static void main(String[] args) {

		/*
		 *
		 * 숫자와 영문자(소문자)로 이루어진 arr스트링 배열이 있습니다.
		 * 배열의 각 요소에서 숫자만을 빼와서 새로운 int 타입 배열에 넣어주려고 합니다.
		 * arr과 같은 길이의 int 타입 arr2배열을 선언하고,
		 * 각 요소의 문자를 (StringBuffer or StringBuilder 사용) int로 변환해서 arr2에 넣어주는 코드를 작성하시오 (예외 1 발생)
		 * 예외가 발생되면 요소에서 소문자를 제외한 숫자값을 배열에 !!두번!! 넣어줍니다 (예외 2 발생)
		 * 예외가 발생되면 배열의 길이를 1개 늘려서 넣어줍니다
		 * 예외를 처리하여 결과를 출력하세요!
		 *
		 * 단 if문은 catch문 안에서만 사용 가능합니다.
		 * ArrayList , 정규표현식 사용 X
		 */

		String[] arr = {"75h", "123", "457", "a789", "ggg0", "fgd49","ddd", "444" };

		int[] arr2 = new int[arr.length];
		
		int count = 0;		
		int[] arr3 = new int[arr2.length+count];

		String a = "";
		int index = 11;

		String alph = "abcdefghijklmnopqrstuvwxyz";
		String[] com = alph.split("");
		
		int[] arr4 = new int[2];
		
		try {
			
			for(int ii = 0; ii < arr.length; ii++) {
				
				if(arr[ii].contains(alph)) {
					
					index = ii;
					
					if(index != 11) {
						
						count++;
						throw new NumberFormatException();
					}
					
				} else {
					
					for(int i = 0; i < arr.length;i++) {
						
						a = arr[i];
						StringBuilder sb = new StringBuilder(a);
						arr2[i] = Integer.parseInt(sb.toString());
					}
				
			}
				
			}


		} catch (NumberFormatException e) {

			a = arr[count];
			String[] split = a.split("");
			String b = "";
			
			for(int i = 0; i < split.length; i++) {
				
				for(int j = 0; j < com.length; j++) {
					
					if(split[i].equals(com[j]) == false) {
					
						b+=split[i];
					}
				
			}
				
			}
			
			arr4[0] = Integer.parseInt(b);
			arr4[1] = Integer.parseInt(b);
			
		}

		for(int i = 0; i < arr3.length; i++) {
			
			arr3[i] = arr2[i];
			
			if(arr3[i] == 0) {
				
				arr3[i] = arr4[0];
				arr3[i+1] = arr4[1];
			} 
			
		}

		
		System.out.println(Arrays.toString(arr3));













	}
}