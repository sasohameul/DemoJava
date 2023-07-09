package study03.animal;

public class Cat extends Animal {

	//생성자를 통해 sound를 받고 부모 생성자 호출해서 sound변수에 sound값 저장 
	public Cat(String sound) {
		super(sound);
	}

	
	@Override
	public void makeSound() {
		
		System.out.println(super.getSound() + "~ 동물 소리를 재생합니다.");
		System.out.println("야옹이는 야옹");
	}


	//부모의 get.Sound 호출
	public String getSound() {
		return super.getSound();
	}


	public void setSound(String sound) {
		
	}
	
	
	
	
	
}
