package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class DemoSelect01 {

	public static void main(String[] args) {

		//데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //"jdbc:oracle:thin:호스트이름:포트번호:DB이름
		String uid = "HR";
		String upw = "1234";

		String sql = "SELECT * FROM EMPLOYEES WHERE SALARY > ?"; //전달된 값을 ?로 나타냅니다.

		//모든 데티어 베이스 연결은 try~catch 작성이 필요합니다.

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//1. 드라이버클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2. 커넥션 객체 생성
			//Connection conn = DriverManager.getConnection(url, uid, upw);
			conn = DriverManager.getConnection(url, uid, upw);
			//연결되면 주소 반환
			// System.out.println(conn);

			//3. 커넥션 객체에서 state 객체 생성
			//PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);
			
			//3-2. sql문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작합니다.
			//?에 전달될 값은 set메서드를 이용해서 채웁니다.
			//setString, setInt, setDouble, setDate, setTimeStamp
			pstmt.setInt(1, 20000); //첫번째 물음표, 20000원
			
			//4. SQL문의 실행
			//select 는 executeQuery()
			//update, insert, delete문장은 executeUpdate()
			//ResultSet rs = pstmt.executeQuery();
			rs = pstmt.executeQuery();

			//5. rs.next() 다음행이 있으면, 다음행으로 접근합니다.
			while(rs.next()) { //한 행에서 처리할 작업을 while문 안에 넣으면 됩니다.

				String first_name=  rs.getString("first_name"); //getString, getInt, getDouble, getDate, getTimestamp

				int salary = rs.getInt("salary"); //정수

				double cpt = rs.getDouble("commission_pct");

				Date date = rs.getDate("hire_date"); //java.sql 패키지

				Timestamp date2 = rs.getTimestamp("hire_date");

				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(cpt);
				System.out.println("date");
				System.out.println(date2);
				System.out.println("---------------");
			}

		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			
			try {
				
				conn.close();
				pstmt.close();
				rs.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
