package study03.Machine;

public class AICleaner extends Machine {



	// 생성자
	AICleaner(int battery){
		/* 
		 * 배터리 값을 매개변수로 받아, 부모 클래스의 생성자 호출
		 */

		super(battery);

	}

	// 메소드 - 전원 상태를 리턴하는 cleaning()함수
	public boolean cleaning() {
		/*
		 * 배터리 상태가 5 미만이면, "Charge Me!"를 출력하고 전원off, false 리턴
		 * 그렇지 않으면, 배터리가 3씩 줄어들고, "Cleaning up!, battery: n" 출력, true 리턴 
		 */
		for(int i = 0; i <= battery; i++) {
			
			if(battery < 5) {

				System.out.println("Charge Me!");
									
				super.powerOff();
				
				
				return false;

			} else {

				battery -= 3;
				System.out.println("Cleaning up!, battery: " + battery);
			}

		}

		return true;

	}

}
