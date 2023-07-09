package study07.saying_js;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saying {

	public static void main(String[] args) throws IOException {
		
		
		//String path ="C:\\Users\\user\\Documents\\카카오톡 받은 파일\\saying.txt";
		
		//몇줄인지 세려고, 한번 읽어들이면 null값이어서 생성해줌..
		BufferedReader brc = new BufferedReader(new FileReader("saying.txt"));	
		//문제 만드려고
		BufferedReader br = new BufferedReader(new FileReader("saying.txt"));	
		//빠른 입력받기
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		//몇 줄인지 세려고
		int lineCount = 0;
		while(brc.readLine() !=null) {
			lineCount++;
		}

		int Rcount = 0;
		int Wcount = 0;

		System.out.println("속담 퀴즈입니다!! 빈 칸에 알맞은 말을 입력하시오.");
		System.out.println("================================================");

		String[] quiz= new String[lineCount];

		for(int i = 0; i < quiz.length; i++) {

			if(i % 2 == 0) {

				quiz[i] = br.readLine();

				System.out.println("(문제) " + quiz[i]);

			} else {

				quiz[i] = br.readLine();
				System.out.print("정답을 입력해주세요 =>");
				String answer = br2.readLine();

				if(quiz[i].equals(answer)) {

					System.out.println("정답입니다.");
					System.out.println();
					Rcount++;

				} else {

					System.out.println("오답입니다. 정답은 " + quiz[i] + "입니다.");
					System.out.println();
					Wcount++;
				}

			}

		}

		System.out.println("=======================================");
		System.out.println("퀴즈 끝! 수고링");
		System.out.println("정답 갯수 : " + Rcount + " 오답갯수 : " + Wcount);
		


	}
}



