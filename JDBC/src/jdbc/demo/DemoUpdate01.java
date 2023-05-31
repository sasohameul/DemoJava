package jdbc.demo;

import java.sql.*;
import java.util.Scanner;

public class DemoUpdate01 {

	public static void main(String[] args) {
		
		//부서아이디, 부서이름을 입력받아서, 해당 부서의 이름을 변경하는 update구문을 작성합니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("부서이름>");
		String d_name = scan.nextLine();
		
		System.out.println("부서id>");
		String d_id = scan.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //"jdbc:oracle:thin:호스트이름:포트번호:DB이름
		String uid = "HR";
		String upw = "1234";
		
		
		String sql = "UPDATE DEPTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, d_name);
			pstmt.setString(2, d_id);
			
			int result = pstmt.executeUpdate();
			System.out.println("성공실패? : " + result);
						
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			
		} try {
			
			conn.close();
			pstmt.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
				
	}
	
}
