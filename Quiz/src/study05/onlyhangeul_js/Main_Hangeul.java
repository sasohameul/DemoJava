package study05.onlyhangeul_js;

public class Main_Hangeul {
	
	public static void main(String[] args) {
		
		Hangeul h = new Hangeul();
		
		System.out.println(h.deleteChar("(문!제@를!한~번)*풀$어%볼#까$요?)^@^" , "~!@#$%&*()"));
		System.out.println(h.deleteChar("문a제y내z느d라ik힘s들q었k다nh히vb유..." , "ayzdiksqknhvb"));
		
	}

}
