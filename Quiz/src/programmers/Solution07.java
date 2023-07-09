package programmers;

public class Solution07 {

	public int solution(String ineq, String eq, int n, int m) {

		int answer = 0;     

		if(ineq.equals(">") && eq.equals("=")) {

			if(n >= m) {

				answer = 1;
			} else {

				answer = 0;
			}

		} else if (ineq.equals("<") && eq.equals("=")) {

			if(n <= m) {

				answer = 1;
			} else {

				answer = 0;
			}

		} else if (ineq.equals(">") && eq.equals("!")) {

			if(n > m) {

				answer = 1;
			} else  {

				answer = 0;
			}

		} else if (ineq.equals("<") && eq.equals("!")) {

			if(n < m) {

				answer = 1;
			} else  {

				answer = 0;
			}
		}





		return answer;
	}

}

//boolean answer = false;
//if (ineq.equals(">") && eq.equals("="))
//    answer = n >= m;
//else if (ineq.equals("<") && eq.equals("="))
//    answer = n <= m;
//else if (ineq.equals(">") && eq.equals("!"))
//    answer = n > m;
//else 
//    answer = n < m;
//return answer ? 1 : 0;