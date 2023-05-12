package day14.api.thread; //runnable 인터페이스 상속하는 것을 더 추천(Thread 상속받는 것 보다)

public class ThreadTest implements Runnable {

	@Override
	public void run() {

		for(int i = 1; i <= 10; i++) {
			
			System.out.println("작업쓰레드에서 실행된 for문" + i);
			
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}
