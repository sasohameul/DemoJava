package study02;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	/*
	 * 1. 복권을 구매하러 왔습니다. 구매한 복권의 번호를 출력합니다.
          (복권 숫자는 랜덤이고 범위는 1~45 까지 입니다!)
          (Random 클래스는 API 주제여서 사용하진 않았으나, 사용하셔도 됩니다.)

		2. 이번 주 당첨 번호를 출력하고

    	3. 구매한 복권 번호와 이번 주 복권 번호를 비교해서
           꽝인지, 당첨이 됐는지 출력해봅시다.
           (당첨 유무 출력은 자유롭게 해주시면 됩니다!)

     	4. 단, 복권을 구매할 때 수동으로 번호 3개를 지정합니다.
    		(수동으로 3개, 자동으로 3개 출력되면 됩니다.)

    		ex. lotto(3,7,10);	
         	출력시 -> [3,7,10,39,36,43]

	 */

	public static void main(String[] args) {

		Result();

	}

	public static int[] Lotto() {

		int[] lotto = new int[6];

		for(int i = 0; i < lotto.length; i++) {

			lotto [i] = (int)(Math.random()*45) +1;
			
			//중복 제거 위해 for구문 1번 더 반복, 중복되면 i값 감소시켜 다시 담게함
			for(int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("이번 주 로또 번호 : " + Arrays.toString(lotto));
		
		return lotto;
	}

	public static int[] MyLotto(int a, int b, int c) {

		int[] mylotto = new int[6];

		mylotto[0] = a;
		mylotto[1] = b;
		mylotto[2] = c;

		for(int i = 3; i < mylotto.length; i++) {

			mylotto[i] = (int)(Math.random()*45) +1;
			
			for(int j = 0; j < i; j++) {
				
				if(mylotto[i] == mylotto[j]) {
					
					i--;
				}
			}
			
		}

		System.out.println("구매한 로또 번호 : " + Arrays.toString(mylotto));
		
		return mylotto;
	}

	public static void Result() {

		int count = 0;

		int[] result = Lotto();
		int[] result2 = MyLotto(23,4,29);

		//이번 주 로또와 내가 구매한 로또 비교해서 이중for문 사용, 번호가 같으면 count해줌
		for(int i = 0; i < result.length; i++) {

			for(int j = 0; j < result.length; j++) {

				if(result[i] == result2[j]) {

					count++;
				} 
			}
		}

		switch (count) {
		case 6:

			System.out.println("1등입니다! 부자되세요!");
			break;
		case 5:

			System.out.println("2등입니다! 왕왕 축하해요!");
			break;
		case 4:

			System.out.println("3등입니다! 축하해용");
			break;
		case 3:
			
			System.out.println("4등입니다!");
			break;
		case 2:
			
			System.out.println("2개 맞췄당..이것도 꽈당..");
			break;

		default:

			System.out.println("꽝! 다음 기회에..");

			break;
		}
	}
}

