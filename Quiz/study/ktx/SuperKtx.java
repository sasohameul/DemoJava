package study03.ktx;

public class SuperKtx extends Ktx{

	public SuperKtx() {

	}
	
	@Override
	void run() {
		
		super.run();
		
		if(speed >= 150 && speed <300) {
			
			System.out.println("고속으로 열차가 달립니다.");
		}
	}
	
	
	
	
	
}
