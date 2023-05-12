package day10.abstract_.good;

public class BusanStore extends Store{

	@Override
	public void apple() {
		
		System.out.println("부산 지점 사과아이가 100원");
	}

	@Override
	public void grape() {
		
		System.out.println("부산 지점 포도아이가 200원");
	}

	@Override
	public void orange() {
		
		System.out.println("부산 지점 오렌지아이가 300원");
	}

	@Override
	public void melon() {
		
		System.out.println("부산 지점 멜론아이가 400원");
	}

}
