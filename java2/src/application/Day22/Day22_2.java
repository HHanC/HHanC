package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




public class Day22_2 {

	// 1. 필드
		private Connection connection; // DB연동 객체 선언
	// 2. 생성자
		public Day22_2() {
			try {
				// 1. DB 드라이브 클래스 호출[DB 회사마다 다르기 때문에 암기x 정리o]
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB 연결
				connection = DriverManager.getConnection(
						// JDBC : JAVA DABABASE CONNECTIION
						// "jdbc:mysql://IP주소(로컬이면[본인pc] localhost):port
						// , 계정명 , "DB비밀번호"
						"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" ,
						"root",
						"1234");
				// 3. 확인
				System.out.println("[DB연동 성공]");
			}catch (Exception e) {System.out.println("[DB연동 실패]");}
		}
	// 3. 메소드
	public boolean write(String 작성자, String 내용) {
		try {
			
			// 1. SQL 작성 [DB에 쓰기]
				// db내 테이블에 데이터 저장 : insert into 테이블명1(필드명1,필드명2) values(필드명1의값, 필드명2의값)
			String sql = "insert into test(writer, content) values(?,?)";
			// 2. SQL 설정 [연결된 DB에 SQL 설정]
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, 작성자);
			ps.setString(2, 내용);
			// 3. SQL 실행
			ps.executeUpdate(); // sql 삽입 실행
			// * 성공시 true
			return true;
			
		}catch (Exception e) {
			System.out.println("[sql 연결 실패 !!]" + e);
		}
		
		// * 성공시 true
				
				
		// * 실패시 false
		return false;
		
	}
	// 3. 데이터 호출 메소드
	public ArrayList<데이터> get(){
		
			// *
			ArrayList<데이터> 데이터목록 = new ArrayList<>();
			try {
			// 1. SQL 작성 [데이터 호출]
				// select *(모든필드) from 테이블명; : 모든 데이터를 가져오기
			String sql = "select * from test";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			// * 결과물 하나가 아니고 여러개 이므로 반복문 사용해서
				// 한줄씩 객체화 -> 리스트에 저장
			while(rs.next()) {
				데이터 temp = new 데이터(
						rs.getInt(1), // 해당 줄[레코드]의 첫번째 필드[세로] 값 가져오기
						rs.getString(2), // 해당 줄[레코드]의 두번째 필드[세로] 값 가져오기
						rs.getString(3) ); // 해당 줄[레코드]의 세번째 필드[세로] 값 가져오기
				데이터목록.add(temp); 
				
			}
			// 반복문 종료되면 리스트 반환
			// * 성공시 데이터 목록 반환
			
		}catch (Exception e) {
			System.out.println("[sql 연결 실패사유 : ]" + e);
		}
		
		
			return 데이터목록;
			
			//return null;				
	}
}













