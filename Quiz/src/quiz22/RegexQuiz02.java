package quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		String s = "\\d{6}-\\d{7}";
		String s2 = "[A-Z]+[0-9]+";
		String s3 = "\\([가-힣0-9]+\\)";
		String s4 = "\\d,\\d+원"; //[0-9,]+원
		
		List<String> list = Arrays.asList(str,str2);
		
		for(String a : list) {
			
			Matcher m1 = Pattern.compile(s).matcher(a);
			Matcher m11= Pattern.compile(s2).matcher(a);
			Matcher m111= Pattern.compile(s3).matcher(a);
			Matcher m1111=Pattern.compile(s4).matcher(a);
			
	    	 if (m1.find()&& m11.find() && m111.find() &&m1111.find()) {
			 
			 System.out.println(m1.group());
			 System.out.println(m11.group());
			 System.out.println(m111.group());
			 System.out.println(m1111.group());
		 }
		 
		 System.out.println("----------------------");
		 
//		 while(m2.find() && m22.find() &&m222.find() && m2222.find()) {
//			 
//			 System.out.println(m2.group());
//			 System.out.println(m22.group());
//			 System.out.println(m222.group());
//			 System.out.println(m2222.group());
//		 }
//		
		
	}
	
	}
}
