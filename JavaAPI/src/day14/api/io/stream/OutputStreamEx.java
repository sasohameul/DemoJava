package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어갑니다. 
		 *    new FileOutputStream("경로\\파일명");
		 * 3. io패키지 거의 모든 클래스들은 생성자에 throws가 있기 때문에 
		 *    반드시 예외처리 문장 안에서 사용합니다. 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		// FileOutputStream out = new FileOutputStream(path);
		
			
		try {
			OutputStream out = new FileOutputStream(path);
			
//			out.write(65);  ==> 1. 한글자씩 쓰는방법이어서 오래걸림
//			out.write(66);
//			out.write(67);
			
			
//			byte[] arr = {65,66,67,68,69}; ==> 2. 배열에 들어있는 데이터를 한번에 처리
//			out.write(arr);
			
			String str = "abcdefg"; //한글로 쓰면 에러남
			byte [] arr = str.getBytes(); // 문자열을 바이트 배열로 변환
			
			out.write(arr);
			
			out.close(); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
