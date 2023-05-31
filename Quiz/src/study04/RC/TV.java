package study04.RC;

public class TV implements RC{

	private int chNum = 8;

//	Tv 최대 채널은 10입니다. 
//	채널 10번을 넘기면 채널 1번이 나오고, 1번에서 아래로 넘기면 10번이 나오게 up(),down() 메서드를 만들어주세요.
//	아래 주어진 코드를 통해 
	
	public void on() {
		
			System.out.println("TV를 켭니다.");
				
										
		}

		
	public int getChNum() {
		return chNum;
	}


	public void setChNum(int chNum) {
		this.chNum = chNum;
	}


	public void up() {
		

		chNum++;
		if(chNum > 10) {
			
			chNum = 1;
		} 
		
		System.out.println("TV 채널 위로 넘기기 : " + this.chNum);
		
		
	}
	
	public void down() {
		
		
		chNum--;
		if(chNum < 1) {
			
			chNum = 10;
		}
		
		System.out.println("TV 채널 아래로 넘기기 : " + this.chNum);
		
	}
	
	
}
