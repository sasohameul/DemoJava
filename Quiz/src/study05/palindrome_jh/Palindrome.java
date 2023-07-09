package study05.palindrome_jh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.print("공백없이 문자열을 입력해주세요> ");
			String pr = br.readLine();
			
			StringBuilder sb = new StringBuilder(pr);
			
			sb.reverse();
			
			if(pr.equals(sb.toString())) {
				
				System.out.println("회문입니다.");
				System.out.print("첫번째 숫자> ");
				String fn = br.readLine();
				System.out.print("두번째 숫자> ");
				String sn = br.readLine();
				int a = Integer.parseInt(fn);
				int b = Integer.parseInt(sn);
				System.out.println("두 수의 합은: " + (a+b) +"입니다.");
				
				br.close();
				
			} else {
				
				System.out.println("회문이 아닙니다. \n회문으로 바꾸겠습니다.");
				//첫번째 글자만 없애서 붙이면 회문이니까
				pr+=sb.deleteCharAt(0);
				System.out.println(pr);
			}
			
		} catch (Exception e) {

		}
		
		
	}

}
