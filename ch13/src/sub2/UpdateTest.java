package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 주솔지
 * 내용 : Java CRUD 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		// DB정보
		 String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //127.0.0.1 은 localhost로 변경가능
		 String user = "root";
		 String pass = "1234";
		
		try {
			// 1단계 - 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			// 4단계 - SQL 실행
			String sql = "UPDATE `user1` SET `name`='김유진', `hp`='010-1234-1011' " 
					   + "WHERE `uid`='j101'";	
			stmt.executeUpdate(sql);
			// 5단계 - 조회 결과처리(Select 경우)
			// 6단계 - 
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("UPDATE 완료...");
	}

}
