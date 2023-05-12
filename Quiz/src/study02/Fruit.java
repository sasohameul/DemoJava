package study02;

import java.util.*;

public class Fruit {

	int money; //손님이 지불한 금액
	int total; //구매한 5개의 과일 값
	int storesum; //가게 시제금
	int changes; //거스름돈
	
	int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
	int[] coin     = {2, 4, 0, 5, 5, 5, 5};
	
	public Fruit(int money) {
		
		this.money = money;
		
	}

	public int account() {
		
		int storesum = 0;
		
		for(int i = 0; i < coin.length; i++) {
		
			storesum += coinUnit[i] * coin[i];
		}
		
		System.out.println("시제 :" + storesum + "원");

		return storesum;
	}

	public void receipt() {

		String[] fruit = {"사과", "메론", "바나나", "딸기", "수박", "블루베리", "참외", "포도", "배"};
		int[] price = {4990, 7890, 3990, 14990, 17990, 9990, 1990, 24990, 4590};

		System.out.println("========영 수 증=========");
		
		String[] shuffle = new String[9];
		int[] price2 = new int [9];

		for(int i = 0; i < price.length; i++) {

			int j = (int)(Math.random() *9) +1;

			//셔플해서 랜덤으로 섞인 가격과 배열을 저장
			shuffle[i] = fruit[j-1]+ " - " + price[j-1];
			price2[i] = price[j-1];

			for(int k = 0; k < i; k++) {
				//string배열이므로 ==이 아닌 .equals메소드 사용
				if(shuffle[i].equals(shuffle[k])) {

					i--;
					
				}
			}

		}

		//5개만 출력하기위한 for문
		//int j 선언은 가격을 합산하기 위한 변수
		
		total = 0;
		for(int i = 0; i <= 4; i++) {
			
			total += price2[i];
			
			System.out.println(shuffle[i] + "원");
		}
		
		System.out.println("=======================");
		System.out.println("총액 : " + total + "원");

		//받은 돈과 구매액을가져와 calculate 메소드 실행
		calculate(this.money, this.total);
		
	}

	public void calculate(int money, int total) {
		
		//카운트 위한 변수 선언
		int man = 0;
		int ocheon = 0;
		int obaek = 0;
		int baek = 0;
		int osib = 0;
		int sib = 0;
		
		this.changes = this.money - this.total;
		
		System.out.println("======================"); 
		System.out.println("받은 돈 : " + money + "원");
		System.out.println("거스름돈 : " + changes + "원"); 

		System.out.println("=======거스름돈 내역=======");
		if(changes > storesum) {
			
			System.out.println("사장님 시제보충 해주세요!!!");
			
		} else if(changes % 10000 > 3300 ) {
			
			System.out.println("사장님 시제보충 해주세요!!!");
			
		} else  {
			
			while(changes % 10000 <= 2) {
			
				man++;
				
				changes -= 10000*man; 
				
				while (changes % 5000 <=4) {
					
					ocheon++;
					
					changes -= 5000*ocheon;
				}
				
				
			}
			
			
			System.out.println("...");
		}
		
	}

	

}
