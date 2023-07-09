package study07.schoolrecord_yj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RecordProgram {

	ArrayList<SchoolRecord> list = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public RecordProgram() {


	}	

	public void inputRecord() throws IOException {

		System.out.print("학생 이름 입력: ");
		String name = br.readLine();

		System.out.print("국어 성적 입력: ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("수학 성적 입력: ");
		int math = Integer.parseInt(br.readLine());

		SchoolRecord rp = new SchoolRecord(name, kor, math);

		list.add(rp);
		updateRank();
		System.out.println("추가되었습니다.");

	}

	public void printRecord() {

		for(int i = 0; i < list.size(); i++) {

			list.get(i).info();
		}
	}

	public void removeRecord() throws IOException{

		if(list.size() <= 0) {
			
			System.out.println("** 입력 후 삭제 바랍니다. **");
			return;
		}
		
		System.out.print("삭제할 이름: ");
		String name = br.readLine();
		

		for(int i = 0; i < list.size(); i++) {

			if(list.get(i).getName().equals(name)) {

				list.remove(i);
				updateRank();
				
				System.out.println("삭제되었습니다.");
				break;
				
			} else {
				
				System.out.println("** 존재하지 않는 학생입니다. **");
				break;
			}

		}
		
		
	}
	
	public void updateRecord() throws IOException{
		
		if(list.size() <= 0) {
			
			System.out.println("** 수정할 내용이 없습니다. 입력 후 이용 바랍니다.**");
			return;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("변경할 이름: ");
		String name = br.readLine();
		
		for(int i = 0; i < list.size(); i++) {
			
			if(!list.get(i).getName().equals(name)) {
				
				System.out.println("이름을 다시 확인 바랍니다.");
			break;
			}
			
			if(list.get(i).getName().equals(name)) {
				System.out.print("국어 점수를 변경하세요: ");
				int kor = Integer.parseInt(br.readLine());
				
				System.out.print("수학 점수를 변경하세요: ");
				int math = Integer.parseInt(br.readLine());
				
				list.get(i).setKor(kor);
				list.get(i).setMath(math);
				list.get(i).setTotal();
				updateRank();
				System.out.println("변경되었습니다.");
				
				break;
			}
			
		}
		
	}
	
		public void updateRank() throws IOException{

			for(int i = 0 ; i < list.size(); i++) {

				list.get(i).clearRank();

			}

			for(int i = 0; i < list.size(); i++) {
				
				for(int j = 0; j < list.size(); j++) {
					
					if(list.get(i).getTotal() < list.get(j).getTotal()) {
						
						list.get(i).plusRank();
					}
					
					
				}

			}

		}

		public void saveRecord() throws IOException{

			File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일");
			File file = new File(dir, "SchoolRecord.txt");

			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeObject(list);

			oos.close();
			System.out.println("저장되었습니다.");

		}

		public void openRecord() throws IOException{
			
			File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일");
			File file = new File(dir,"SchoolRecord.txt");
			
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			list.clear();
			
			try {
				list = (ArrayList<SchoolRecord>) ois.readObject();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("불러오기 성공!");
			
		}


	}

