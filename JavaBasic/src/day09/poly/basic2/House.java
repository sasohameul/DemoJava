package day09.poly.basic2;

public class House {

//	private Student[] student = new Student[100];
//	private Employee[] employee = new Employee[100];
//	private Teacher[] teacher = new Teacher[100];
//	
//	
//	public void inHouse(Students) {
//
//		
//		
//}

	
	//
	Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {
		
		person[index] = p;
		index++;
		
	}

	public void whoAreYou(Person p) {
		
		if(p instanceof Student) { //student라는 true가 나옴
			
			System.out.println("너는 학생이야!");
			//--> 캐스팅 할 수 있다는 뜻
			Student s = (Student)p;
			
		} else if (p instanceof Teacher) {
			
			//--> 캐스팅 할 수 있다는 뜻
			Teacher t = (Teacher)p;
			System.out.println("나는 선생이야!");
		} else if(p instanceof Employee) {
			
			System.out.println("너는 직원이야!");
		} else {
			
			System.out.println("너는 그냥 사람이야");
		}
		
		
	}
	
	
	
	
	
	
	
}