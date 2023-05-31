package study04.car;

public class AICar extends Car{
	
	public void startCar() {
		System.out.println("시동을 켭니다."); 
	}			

	@Override
	public void drive() {

		System.out.println("자율 주행을 시작합니다.");
	}

	@Override
	public void stop() {

		System.out.println("차가 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {

		System.out.println("와이퍼가 자동으로 시작합니다.");
		
	}

	public void wash() {

		System.out.println("자동 세차 시작합니다.");

	}

	public void turnOff() {
		
		System.out.println("시동을 끕니다.");
	}


}
