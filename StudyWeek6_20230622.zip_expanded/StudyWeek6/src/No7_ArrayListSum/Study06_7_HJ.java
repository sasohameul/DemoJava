package No7_ArrayListSum;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Study06_7_HJ {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		
		while(true) {
			try {
				
				System.out.print("저장시킬 정수를 입력하세요(공백 구분) => ");
				String str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str, " ");

				while(st.hasMoreTokens()) {
					list.add(Integer.parseInt(st.nextToken()));
				}
				
				for(int n : list) {
					sum += n;
				}
				
				System.out.println("===============[결과]===============");
				System.out.println("저장된 배열 값: " + list);
				System.out.println("배열에 저장된 정수들의 합: " + sum);
				
				break;
				
			} catch (Exception e) {
				System.out.println("***주의! 정수만 입력하세요***");
			}
			

		}
	}
}
