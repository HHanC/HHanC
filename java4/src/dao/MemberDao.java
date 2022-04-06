package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao { // DB

	private Connection con; // DB연동시 사용되는 클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할떄 사용되는 인터페이스 : DB조작
	private ResultSet rs; // 결과물을 조작하는 인터페이스
	
	public static MemberDao memberDao = new MemberDao(); // DB연동객체
	
	public MemberDao() {
		try {
			// DB연동
			Class.forName("com.mysql.cj.jdbc.Driver");// 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");// 2. DB 주소 연결'
		
		}catch (Exception e) {
			System.out.println("DB연동 오류" + e);
		}
	}
	// 메소드
		// 아이디 중복체크 메소드 (인수 : 아이디를 인수로 받아 db에 존재하는지 체크)
	public boolean idcheck(String id) {
		try {
			// 1. SQL 작성
			String sql = "select * from member where mid=?";
			// 2. SQL 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL 실행
			rs = ps.executeQuery();
			// 4. SQL 결과
			if(rs.next()) {
				return true; // 해당 아이디는 중복이 존재
			}
		}catch (Exception e) {
				System.out.println("SQL연동 오류" + e);
		}
			
		return false; // 해당 아이디 중복이 없음
	}
		// 1. 회원가입 메소드(인수 : db에 넣을 아이디, 비밀번호,이메일,주소)
	public boolean signup(Member member) {
		try {
		// 1. sql 작성
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,mcince)values(?,?,?,?,?,?)";
		// 2. sql 조작
		ps = con.prepareStatement(sql); // prepareStatement 인터페이스내 연결된 db에 sql 넣기
		ps.setString(1, member.getMid()); // 1번 ?에 id 넣어주기
		ps.setString(2, member.getMpassword()); // 2번 ?에 비밀번호 넣어주기
		ps.setString(3, member.getMemail()); // 3번 ?에 이메일 넣어주기
		ps.setString(4, member.getMaddress()); // 4번 ?에 주소 넣어주기
		ps.setInt(5, member.getMpoint()); // 5번 ?에 포인트 넣어주기
		ps.setString(6, member.getMcince()); // 6번 ?에 가입일 넣어주기		
		// 3. sql 실행
		ps.executeUpdate();
		return true;
		}catch (Exception e) {
			System.out.println("SQL연동 오류" + e);
		}
		return false;
		}
		// 2. 로그인 메소드(인수 : 로그인시 필요한 아이디, 비밀번호)
	public boolean login(String id, String password) {return false;}
		// 3. 아이디찾기 메소드(인수 : 아이디찾기 시 필요한 이메일)
	public String finid(String email) {return null;}
		// 4. 비밀번호찾기 메소드(인수 : 비밀번호 찾기 시 필요한 아이디 이메일)
	public String findpassword(String id, String email) {return null;}
}















