package study07.schoolrecord_yj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Record_Main {

	public static void main(String[] args) throws IOException{

		RecordProgram rp = new RecordProgram();
		
		while(true) {
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("|-------------성적 관리 프로그램------------------|");
				System.out.println("| 1.입력 2.출력 3.삭제 4.수정 5.저장 6.열기 7.종료 |");
				System.out.println("|------------------------------------------------|");
				System.out.print(" : ");
				int menu = Integer.parseInt(br.readLine());
				
				switch(menu) {
				
				case 1: 
					
					rp.inputRecord();
					
					break;
					
				case 2:
					
					rp.printRecord();
					
					break;
				case 3:
					
					rp.removeRecord();
					
					break;
					
				case 4:
					
					rp.updateRecord();
					
					break;
					
				case 5:
					
					rp.saveRecord();
					break;
					
				case 6:
					
					rp.openRecord();
					break;
					
				case 7:
					
					System.out.println("프로그램이 종료되었습니다. "
							+ "이용해주셔서 감사합니다.");
					
					System.exit(0);
					
					break;
					
				default : 
					
					System.out.println("다시 입력바랍니다.");
					
					break;
					
				}
			} catch (Exception e) {
				
				System.out.println("메뉴를 다시 입력하세요");
			}
			
			



		}



	}

}
