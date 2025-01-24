package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2025/01/23
 * 이름 : 주솔지
 * 내용 : Java JDBC 접속 테스트 실습하기
 * 
 * 
 * */
public class JDBCTest {
	public static void main(String[] args) {
		
		//DB정보 
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		
		try {
		// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	   // 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
		
			if(conn != null) {
				System.out.println("데이터 베이스 접속 성공!");
			}else {
				System.out.println("데이터 베이스 접속 실패!");
			}
			//데이터베이스 종료
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
