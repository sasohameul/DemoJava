package day11.trycatch;

public class RunTimeEx {

	public static void main(String[] args) {
		
		//실행 에러들
		//ArrayIndexOUtofBoundsException
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[5]);
		
		//catsException
		String s = (String)new Object();
		
		
		//문자열을 숫자로 변경
		//NumberFormatException
		String str = "10a";
		int num = Integer.parseInt(str);
		
		//NullpointerException
		String str1 = null;
		str1.charAt(0);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
