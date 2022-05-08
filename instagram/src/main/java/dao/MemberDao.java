package dao;

public class MemberDao extends Dao{
	
	public MemberDao() {
		super();
	}
	public static MemberDao memberDao = new MemberDao();
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	// 회원가입 메소드
	
	// 로그인 메소드
	
	// 아이디 중복체크 메소드
	public boolean idcheck(String mid) {
		String sql = "select * from member where mid='"+mid+"'"; 
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) return true;
		}catch (Exception e) {System.out.println("id오류" + e);}
		return false;
	}
	// 비밀번호 체크 메소드
	public boolean passwordcheck() {
		return true;
	}
	// 이메일 중복 체크 메소드
	public boolean emailcheck(String email) {
		String sql = "select * from member where memail='"+email+"'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) return true;
		}catch (Exception e) {}
		return false;
	}
	// 회원 수정 메소드
	
	// 회원 탈퇴 메소드
	
	// 회원번호 출력 메소드
	
	// 회원 아이디 출력 메소드
	
	
}
