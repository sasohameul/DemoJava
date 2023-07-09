package study07.stringlength_lj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringLength {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열을 입력하세요: ");

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		System.out.println("단어 개수: " + st.countTokens());

		String[] str = new String[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {

			str[i] = st.nextToken();
			i++;
		}

		int avg = 0;
		for(int j = 0; j < str.length; j ++) {

			avg += str[j].length();

		}

		System.out.println("단어 평균 길이: "+ avg/str.length);

		int max = 0;
		int min = 100;

		for(int j = 0 ; j < str.length; j++) {

			if(max < str[j].length()) {

				max = str[j].length();

			} 
			
			if(min > str[j].length()) {
				
				min = str[j].length();
			}
			
		
		}
		System.out.println("단어 최대길이: " + max +  "\r\n단어 최소길이: " + min);








	}

}