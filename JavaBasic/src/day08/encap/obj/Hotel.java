package day08.encap.obj;

public class Hotel {
	
//1.	private Chef chef = new Chef();
//2.    private Chef chef;
	
	private Chef chef;
	public Hotel(Chef chef) {
		
		this.chef = chef;
	} 
	
	// chef의 게터세터
	
	//객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		
		this.chef = chef;
		
	}
	
	//객체를 반환하는 모형
	public Chef getChef(){
		return chef;
	}

}
