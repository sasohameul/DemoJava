package study04.birth;

public class Main_array {

	public static void main(String[] args) {

		ArrayChild a = new ArrayChild("박수정",27, "공부");
		ArrayChild b = new ArrayChild("단비",5, "떼쓰기");
		ArrayChild c = new ArrayChild("뽀로로",6, "놀기");
		ArrayChild d = new ArrayChild("짱구",4, "흰둥이산책");

		ArrayParents []arr = {a,b,c,d};

		for(ArrayParents i : arr ) {
			System.out.println("---------------------------------");
			i.info();
			i.year();
			System.out.println("---------------------------------");
		}










	}

}
