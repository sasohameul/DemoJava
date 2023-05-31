package study04.birth;

public class ArrayChild extends ArrayParents {
	
	public ArrayChild(String name, int age, String hobby) {
		
		super(name, age, hobby);
	}

	@Override
	public void info() {
		
		System.out.println("이름: " + name + ", 나이: " + age + "살, 취미: " + hobby + ", 특기:" + hobby2);
	}

	@Override
	public void year() {
		
		int year = 2023 - super.age;
		System.out.println( (year+1) + "년생이시네요!");
		
	}
}
