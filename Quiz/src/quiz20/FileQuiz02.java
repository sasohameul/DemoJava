package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. Date 클래스를 이용해서 File 경로에 하위 폴더로 20230504file 폴더를 생성합니다.
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성
		 * 3. 그만을 입력받을 때 까지 엔터를 포함해서 입력 받습니다.
		 * 	  \r\n을 적절하게 이용해서 파일출력을 완료
		 * 	
		 * 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력
		 * 
		 */
		
		Date date = new Date();
		
		SimpleDateFormat day = new SimpleDateFormat("yyymmdd");
		String today = day.format(date);
		System.out.println(today);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + today;
		
		
		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path,true)) ) {
			
			File file = new File(path);

			if(!file.exists()) {
				
				file.mkdir();
				System.out.println("폴더 생성 완료!");
				
			} 
			
			Scanner scan = new Scanner(System.in);
			
			String path1 = path + "\\" + ;
			try {
				BufferedWriter bw1 = new BufferedWriter( new FileWriter(path1,true)); 
				System.out.println("파일명을 입력하세요>");
				String name = scan.next();
				
				bw1.write(name);
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			
			
				
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
}
