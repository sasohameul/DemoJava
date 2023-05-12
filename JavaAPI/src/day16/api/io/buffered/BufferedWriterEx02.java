package day16.api.io.buffered;

import java.io.*;
import java.util.Scanner;

public class BufferedWriterEx02 {
	
	public static void main(String[] args) {
	
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고싶으면 flush() 를 사용합니다.
		 * 
		 * (버퍼라이트가 끝나면(프로그램 완료되면) 자동으로 flush()가 나감)
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path, true) )){
			
			System.out.println(">"); 
			String word1 = scan.next();
			bw.write(word1);
			bw.flush(); //버퍼에 있는 내용을 내보낸다. 없으면 실행완료될때까지 출력이 안됨
			
			System.out.print(">"); 
			String word2 = scan.next();
			bw.write(word2);
			
			System.out.print("파일 출력 완료!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
