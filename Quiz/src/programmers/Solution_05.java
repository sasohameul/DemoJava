package programmers;

public class Solution_05 {

	public int solution(int number, int n, int m) {
		
        int answer = 0;
        
        return number % n == 0 && number % m == 0? 1 : 0;
        
    }
}
