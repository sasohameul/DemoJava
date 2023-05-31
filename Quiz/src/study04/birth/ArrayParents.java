package study04.birth;

public abstract class ArrayParents implements YearOfBirth {

	String name;
	int age;
	String hobby;
	
	public static final String hobby2 = "노래부르기";
	
	public ArrayParents(String name, int age, String hobby) {
		
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		
	}
	
	public abstract void info();
	
	
}
