package No5_NumOrChar;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
import java.util.TreeSet;

public class study5_JH {
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자나 문자를 10번 입력해주세요");
			System.out.println("1.숫자 2.문자 3.종료");
			int a = sc.nextInt();
			if(a==1) {
				System.out.println("숫자를 입력해주세요>");
				TreeSet<Integer> ts = new TreeSet<Integer>();
				
				int i = 0;
				while(i<10) {
					int b = sc.nextInt();
					if(ts.contains(b)) {
					System.out.println("중복값입니다. 숫자를 다시 입력해주세요");					

					} else{
						ts.add(b);
						i++;
					}
				}
				System.out.println(ts.toString());
				
			} else if(a==2) {
				System.out.println("문자를 입력해주세요>");
				TreeSet<String> ts = new TreeSet<String>();
				
				int i = 0;
				while(i<10) {
					String b = sc.next();
					if(ts.contains(b)==true) {
					System.out.println("중복값입니다. 문자를 다시 입력해주세요");					

					} else if(ts.contains(b)==false) {
						ts.add(b);
						i++;
					}
				}
				System.out.println(ts.toString());
				
				
			} else if(a==3) {
				System.exit(0);
			}
			
			
			
		}
	}
}
