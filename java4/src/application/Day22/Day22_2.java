package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Day22_2 {

	// 1. 필드
		private Connection connection;
	// 2. 생성자
		public Day22_2() {
			
			try { // JAVA외 외부와 연결시 무조건 일반예외 발생
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root",
					"1234");
			System.out.println("DB연동 성공");
			}catch (Exception e) {
				System.out.println("DB 연동실패");
			}
					
		}
	// 3. 메소드
	public boolean write(String 작성자, String 내용) {
		try {
			// 1. sql작성
				// db내 테이블에 데이터 저장 : insert into 테이블명1(필드명,필드명) values(필드명1의값, 필드명2의값)
			String sql = "insert into test(writer,content) values(?,?)";
			// 2. sql 설정 [해당 sql 연결된 db에 sql설정]
				// PreparableStatement : 연결된 db에서 테이블 조작할때 쓰는 인터페이스
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, 작성자); // 첫번째 ?에 변수 넣기
			ps.setString(2, 내용); // 두번째 ?에 변수 넣기
			// 3. sql 실행
			ps.executeUpdate(); // sql 삽입
			
			return true;
			
		}catch (Exception e) {
			System.out.println("sql 연결 실패" + e);
		}
		return false;
	}
	
	public ArrayList<데이터> get(){
		
		// DB에서 가져온 데이터를 저장할 리스트 선언
		ArrayList<데이터> 데이터목록 = new ArrayList<>();
		try {
		// 1. sql작성
		String sql = "select * from test";
		// 2. sql조작
		PreparedStatement ps = connection.prepareStatement(sql);
		// 3. sql실행
		ResultSet rs = ps.executeQuery();
		
		// 결과물 하나가 아니고 여러개 이므로 반복문 사용해서
			// 한줄씩 객체화 -> 리스트에 저장
		while(rs.next()) {
			데이터 temp = new 데이터(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3));
			데이터목록.add(temp);
		}
		
		return 데이터목록;
		}catch (Exception e) {
			System.out.println("sql 연결 실패" + e);
		}
		return null;
	}
		
}












