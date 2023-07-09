package programmers;

public class Solution_03 {


	public int solution(int a, int b) {
		
		int answer = 0;
		
		int ab = Integer.parseInt("" + a+b);
		int ba = Integer.parseInt("" + 2*a*b);
		
		return  answer = ab >= ba ? ab : ba;

	}

}
