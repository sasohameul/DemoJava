package study04.car;

public abstract class Car {

	public abstract void drive(); 
	
	public abstract void stop(); 
	
	public abstract void wiper(); 
	
	public void wash() {
		
	}
	
	public final void run() {
		
		drive();
		System.out.println("주행을 시작합니다.");
		
	}
	
}
