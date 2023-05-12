package day14.api.io.stream;

import java.io.FileInputStream;
import java.util.Arrays;

public class inputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로가 들어갑니다.
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		try {
			
			FileInputStream is = new FileInputStream(path);
			
			//System.out.println(is.read());
			
			//1. read()는 한글자씩 데이터를 읽고, 더 읽을 값이 없으면 -1을 반환해주는 함수
//			while(true) {
//				
//				int result = is.read();
//				if(result == -1) break;
//				System.out.println((char) result);
//				
//			}

			
			//2nd
			//read(배열)
			
			byte[] arr = new byte[100];
			int result = is.read(arr); //읽어들인 크기 반환
			
			System.out.println(result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
				
				if(arr[i] == 0) break;
				System.out.println((char) arr[i]);
				
				i++;
			}
			
			int result2 = is.read(arr);
			System.out.println(result2); //이미 한번 다 읽어서 읽을값이 없으므로 -1반환
			
			
			
			
			
			
			is.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
