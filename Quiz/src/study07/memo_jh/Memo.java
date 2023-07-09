package study07.memo_jh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		System.out.println("오늘 날짜 : " + now);


		String path="C:\\Users\\user\\Desktop\\"+ now;

		File folder = new File(path);

		if(!folder.exists()) {

			folder.mkdir();
			System.out.println(now + " 폴더 생성 완료");

		} else {

			if(folder.exists() == true) {

				folder.delete();
				System.out.println("이미 폴더가 존재하므로 폴더 삭제!");
				System.out.println();
			}


		}

		System.out.print("text 제목 > ");
		String fileName = br.readLine();
		File file = new File(folder,fileName+".txt");

		if(!file.exists()) {

			file.createNewFile();
			System.out.println(fileName + " 파일 생성 완료!");
			System.out.println();
		} else {

			file.delete();
			System.out.println("파일이 삭제되었습니다.");
			System.out.println();

		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
		System.out.print("메모 > ");
		
//		while(br.readLine().equals("탈출")){
//	
//		String contents = br.readLine();
//		bw.write(contents);
//		bw.newLine();
//	}
//		이렇게하니까 br.readLine이 두번 호출되었기때문에.. 줄바꿈이 제대로 안되고 줄바꾼공간에 글씨가 안써졌다..
//		주의해야겠다. 이것때문인지.. 폴더 삭제도 제대로 안되었다. 이제 잘됨
//		
		
		String contents;
		while(!(contents =br.readLine()).equals("탈출")) {
			
			bw.write(contents);
			bw.newLine();		
			
		}
		
		bw.flush();
		bw.close();






















	}

}
