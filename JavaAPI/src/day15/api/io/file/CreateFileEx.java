package day15.api.io.file;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {

		/*
		 * [File 클래스]
		 * 외부경로에 폴더 or 단순한 파일생성이나 삭제를 할 수 있습니다.
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\내옆짝꿍지인이";

		try {

			File file = new File(path);

			//생성
			if( !file.exists() ) { //존재하면 true, 존재하지않으면 false

				file.mkdir(); //makedirectory 의 약자
				System.out.println("폴더 생성 완료");

			} else {

				//삭제
				if(file.exists() == true ) {
					file.delete();
					System.out.println("이미 폴더가 존재합니다.");
					System.out.println("폴더 삭제!");
				}
			} 


		} catch (Exception e) {
			e.printStackTrace();
		}












	}

}
