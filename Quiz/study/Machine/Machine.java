package study03.Machine;

public class Machine {

	String name;   // 기계 이름 저장
	int battery;   // 배터리 양 저장

	// 생성자1
	Machine(int battery){

		if(battery < 0) {

			this.battery = 1;
		} else {

			this.battery = battery;

		}


		/*
			배터리 값을 매개변수로 받고, 배터리가 0 미만으로 떨어지지 않도록 초기화
		 */
	}

	// 생성자2
	Machine(String name, int battery){

		/*
			이름과 배터리 값을 매개변수로 받고, 이름은 받은 그대로 초기화
	    배터리는 위와 마찬가지로 0 미만으로 떨어지지 않도록 초기화
		 */
		this.name = name;
		this.battery = battery;

		if(battery < 0) {

			this.battery = 1;
		} else {

			this.battery = battery;

		}



	}

	// 메소드1 - 배터리 상태 확인
	public void info(){
		System.out.println("Battery: " + this.battery);
	}

	// 메소드2 - 전원 ON
	public void powerOn() {
		System.out.println("---------------------------------------");
		System.out.println("Power On");
	}

	// 메소드3 - 전원 OFF
	public void powerOff() {
		System.out.println("Power Off");
		System.out.println("---------------------------------------");
	}

	// 메소드4 - FULL 충전
	public void charge(){
		this.battery = 100;
		System.out.println("Fully Charged!");
	}



}
