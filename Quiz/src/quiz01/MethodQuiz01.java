package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		
		String result = method2("5");
		System.out.println(result);
		
		double result1 = method3(1,2,1.2);
		System.out.println(result1);
		
		String result3 = method4(3);
		System.out.println(result3);
		
		/*String result3 = method5("가",7);
		System.out.println(result3);
		*/
		
		method5("나",3);
		
		int b = maxNum(5,100);
		System.out.println(b);
		
		int result6= abs(-7);
		System.out.println(result6);
		
		String str = java(5);
		System.out.print(str);
	}
	
	
	//1.
	static void method1() {
		System.out.println("안녕");
		
	}
	
	//2.
	static String method2(String a) {
		
		String str = "";
		for(char b='A' ; b <= 'F' ; b++) {
			
			str += b;
		}
		return str;
	}
	
	//3.
	static double method3(int a,int b, double c) {
		
		return a+b+c;
	}

	//4.
	static String method4 (int c) {
		/*
		String str = "";
		
		if(c % 2 == 0) {
			
			str = "짝수";
			
		} else {
			
			str = "홀수";
		}
		
		return str;
		*/
		
		/*
		if(c % 2 ==0) {
			return "짝수";
		}else {
			return "홀수";
		}
		*/
		return c % 2 == 0 ? "짝수":"홀수";
	}
	
	//5.
	
	static void method5 (String a, int b) {
		
		for(int i =1; i <=b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
/*
	static String method5(String b, int d) {
		
		String str2 = "";
		for(int i = 1 ; i <= d; i++) {
			
			str2 += b;
		}
		
		return str2;
	}
	*/
	//6.
	
	static int maxNum(int e, int f) {
		
		if(e > f) {
			
			return e;
			/* System.out.println(e);
			*/
		} else {
			
			return f;
			/*System.out.println(f);
			 */
		}
		
	}
	
	//7.
	
	static int abs(int g) {

		return g > 0 ? g : -g;
		
		/*int a = -1;
		int b = 1;
		if(g > 0) {
			
			g *= b;
			
		} else if (g < 0){
			
			g *= a;
		}
		
		return g;
		*/
	}

	static String java(int s) {
		
		String str = "";
		for(int i = 1; i <= s; i++) {
			
			if(i % 2 == 1) {
				
				str += "자";
			} else {
				
				str += "바";
			}
			
		}
		return str;
		
	}
	





}
















