package practice;

import java.util.Scanner;

public class ChangeUppercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		char[] c = a.toCharArray();

		String nn = "";
		for(int i = 0; i < a.length(); i++) {

			char n= a.charAt(i);

			if(Character.isLowerCase(n)) {

				c[i] = Character.toUpperCase(n);



			} else {

				c[i] = Character.toLowerCase(n);

			}
			nn += c[i];

		}


		System.out.println(nn);









	}

}
