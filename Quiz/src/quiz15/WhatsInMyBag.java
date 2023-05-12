package quiz15;

import java.util.Arrays;

public class WhatsInMyBag implements IBag{
	
	private String[] Bag = new String[100];
	private int index = 0;
	
	@Override
	public void insert(String item) {
		
			Bag[index] = item;
		
			index++;
	}

	@Override
	public void print() {
		
		String str = "[";
		for(int i = 0; i < this.index; i++) {
			
			str += Bag[i] + ",";
			//system.out.pring(bag[i] + "");
			
		}
			
		System.out.println(str+ "]");
		}
		
	@Override
	public int search(String item) {
		
		for(int i = 0 ; i < this.index; i++) {
			
			if(Bag[i].equals(item)) {

				System.out.println("찾는 물건은:" + (i + 1) + "번째에 있습니다!");
				return i;
			} else if(i == index-1 && Bag[i].equals(item) != true) {
				
				System.out.println("찾는 물건이 없습니다.");
			}
				//else 구문을 쓰게되면 시작하자마자 맞으면 종료 틀려도 종료된다.
		} 
		return -1;
		
	}

	@Override
	public boolean delete(String item) {
		
		if(item == null) return false;
		
		for(int i = 0; i < index; i++) {
			
			//찾은 경우의 조건
			if(Bag[i].equals(item)) {
				
				//뒤의 아이템을 당기고 종료
				for(int j = i ; j < index -1; j++) {
					
					Bag[j] = Bag[j+1];
				}
				
				Bag[index-1] = null;
				index--;
				return true;
				
			}
			
		}
		
		return false;
	}

}
