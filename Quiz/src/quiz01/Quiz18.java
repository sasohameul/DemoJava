package quiz01;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		//배열 요소들 중 짝수인 값들의 합
		int[] arr = {54,32,3,5,7,14,20};
		
		int a = 0;
		int sum = 0;
		
		while(a < arr.length) {
			
			
			if(arr[a] %2 == 0) {
				
				sum += arr[a];
			}
			a++;
		}
		
		System.out.println("짝수 값들의 합:" + sum);
		
			
	}

}
