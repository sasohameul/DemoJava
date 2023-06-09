package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02_Answer {
	
	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date); //년월일
		
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명>");
		String filename = scan.nextLine();
		
		String filepath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now;
		String path = filepath + "\\" + filename + ".txt";
		
		File file = new File(filepath);
		if(file.exists() == false) {
			
			file.mkdir();
			System.out.println("폴더생성완료");
			
		} else {
			
			System.out.println("이미 존재합니다.");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			BufferedReader br = new BufferedReader(new FileReader(path))) {

			//쓰는 작업
			while(true) {
				System.out.println("메모내용 >");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					
					System.out.println("종료합니다.");
					break;
				}
				
				bw.write(str + "\n");//쓴다.
				bw.flush();
				
			}
			
			//읽는 작업
			String result;
			
			while((result = br.readLine()) != null) {
				
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
	

}
