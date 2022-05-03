package dao;
// dao : Db 접근 객체


import dto.Member;

public class MemberDao extends Dao{
	
	public MemberDao() {
		super(); // 부모 클래스 생성자 호출
	}
	public static MemberDao memberDao = new MemberDao();		// dao 호출시 반복되는 new 연산자 제거
	public static MemberDao getMemberDao() {
		return memberDao;
	}	
	
	
	
	
	// 아이디 중복체크 메소드
	public boolean idcheck(String mid) {
		String sql = "select * from member where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true; // 동일한 아이디가 존재하면
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false; // 동일한 아이디가 존재하지 않으면
		
	}
	
	// 이메일 중복 체크 메소드
	public boolean emailcheck(String email) {
		String sql = "select * from member where memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery(); 
			if(rs.next()) 
				return true;
		}catch (Exception e) {}
		return false;
	}
	
	// 회원가입 메소드
		public boolean signup(Member member) {
			String sql = "insert into member(mid, mpassword, mname, mphone, memail, maddress)values(?,?,?,?,?,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, member.getMid());
				ps.setString(2, member.getMpassword());
				ps.setString(3, member.getMname());
				ps.setString(4, member.getMphone());
				ps.setString(5, member.getMemail());
				ps.setString(6, member.getMaddress());
				ps.executeUpdate();
				return true;
			}catch (Exception e) {}
			return false;
		}
		
		// 로그인 메소드
		public int login(String mid, String mpassword) {
			String sql = "select * from member where mid = '"+mid+"' and mpassword = '"+mpassword+"'";
//			String sql = "select * from member where mid = ? and mpassword = ?";
			try {
				
				ps = con.prepareStatement(sql);
//				ps.setString(1, mid);
//				ps.setString(2, mpassword);
				rs = ps.executeQuery();
				if(rs.next())
					return 1; // 동일한 값이 있으면 1 성공
					return 2; // 동일한 값이 없으면 2 성공
				
			}catch (Exception e) {} return 3; // DB오류이면 3 실패
			
		}
}














