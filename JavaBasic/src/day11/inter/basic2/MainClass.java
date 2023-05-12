package day11.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		
		for(Animal ani : animals) {
			
			ani.eat(); //Animal의 기능
		}
		
		System.out.println("=================="); 
		//dog,cat은 Interface 타입으로 형 변환이 됩니다.
		//dog,cat,goldfish를 저장하고, 반복문 돌리기
		IPet[] pets = new IPet[3];
	
		//pets[1] = (IPet)tiger; -> tiger는 IPet 기능이 없기
		pets[0] = (IPet) dog;
		pets[1] = (IPet) cat;
		pets[2] = new GoldFish();
		
		for(IPet p : pets) {
			
			p.play();
			
		}
		
		System.out.println("=========================");
		
		
		PetHouse.carePet( (IPet)dog );		
		PetHouse.carePet( (IPet)cat );		
		PetHouse.carePet( pets[2] );		
		
		
		
		
	}

}
