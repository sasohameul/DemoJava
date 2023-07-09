package No5_NumOrChar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TreeeSet_YJ {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.println("숫자나 문자를 10번 입력해주세요");
			System.out.println("1.숫자 2.문자 3.종료");

			String s = br.readLine();
			int menu = Integer.parseInt(s);

			switch (menu) {
			case 1:

				System.out.print("숫자를 입력해주세요> ");

				TreeSet<Integer> set = new TreeSet<>();

				while(set.size() != 10) {

					String num = br.readLine();
					int number = Integer.parseInt(num);

					
					if(!set.add(number)) {
						
						System.out.println("중복된 값입니다. 숫자를 다시 입력해주세요");
						
						
					} else {
						set.add(number);
					}
					System.out.println(set);
					
					
					

				}


				break;
				
			default:
				break;
			}


		}catch (NumberFormatException e) {

			System.out.println("숫자만 입력해주세요");

		} catch (Exception e) {

			e.printStackTrace();
		}


	} 




















}

