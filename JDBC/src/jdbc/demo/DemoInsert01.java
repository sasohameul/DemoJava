package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoInsert01 {

	public static void main(String[] args) {
		
		//입력될 값은 콘솔로 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("부서이름>");
		String name = scan.nextLine();
		
		System.out.println("매니저아이디>");
		String manager_id = scan.nextLine();
		
		System.out.println("로케이션 아이디>");
		String location_id = scan.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //"jdbc:oracle:thin:호스트이름:포트번호:DB이름
		String uid = "HR";
		String upw = "1234";
		
		//insert, update, delete는 ResultSet객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//INSERT INTO DEPTS VALUES( depts_seq.nextval,'TEST', 100,3000)
		String sql = "INSERT INTO DEPTS (DEPARTMENT_ID, DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID )VALUES( depts_seq.nextval, ?, ?, ? )";
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name); //첫번째 물음표, name
			pstmt.setString(2, manager_id); 
			//pstmt.setInt(2,Integer.parseInt(manager_id)); //정수로 변형
			pstmt.setString(3, location_id);
			
			//4. sql 실행
			int result = pstmt.executeUpdate();
			
			System.out.println("성공실패? : " + result);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			
		}
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
