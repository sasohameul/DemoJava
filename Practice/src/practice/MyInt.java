package practice;

public class MyInt {

	int value;
	
	public MyInt(int value) {

	this.value = value;
	
	}

	public boolean equals(Object obj) {
		
		if(obj instanceof MyInt) {
			
			MyInt mi = (MyInt)obj;
			
			return value == mi.value;
			
		}
		
		return false;
	}
	
	
	
	
	
}
