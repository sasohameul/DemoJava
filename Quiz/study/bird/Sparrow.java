package study04.bird;

public class Sparrow extends Bird {
	
	@Override
	public void fly() {
		
		System.out.println( "참새(" +super.getName() + ")가 숨어있습니다.");
		
	}
		
	
	
	@Override
	public void showName() {

		System.out.println("참새의 이름은" + super.getName()+ "입니다.");
		
	}
	
	
	
	@Override
	public void sing() {
		
		System.out.println( "참새(" +super.getName()+ ")가 울지 않습니다.");
		
	}
	
	
	public String getName() {

		return super.getName();

	}

	public void setName(String name) {

		super.setName(name); 

	}
	

}
