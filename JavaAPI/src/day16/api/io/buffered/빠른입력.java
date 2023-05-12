package day16.api.io.buffered;

import java.io.*;

public class 빠른입력 {

	public static void main(String[] args) {

		/*
		 * InputStreamReader는
		 * 
		 * 1바이트 데이터를 => 2바이트 기반으로 변경해줌
		 * 
		 */



//		Reader rw = new InputStreamReader( System.in );
//		BufferedReader bw = new BufferedReader( rw );

		try {
			
			BufferedReader bw = new BufferedReader( new InputStreamReader(System.in));
			System.out.print(">"); 
			String name = bw.readLine();
			
			System.out.println(name); //입력받은 결과
			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		





	}

}
