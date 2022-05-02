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
	
	
	// 회원정보 저장
	public boolean signup(Member member) {
		String sql = "insert into member(mid, mpassword, mname, mphone, memail, maddress, mpoint, mdate)values(?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.setString(4, member.getMphone());
			ps.setString(5, member.getMemail());
			ps.setString(6, member.getMaddress());
			ps.setInt(7, member.getMpoint());
			ps.setString(8, member.getMdate());
			ps.executeUpdate();
			return true;
		}catch (Exception e) {}
		return false;
	}
	
	// 아이디 중복체크 메소드
	public boolean idcheck(String mid1) {
		String sql = "select * from member where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid1);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true; // 동일한 아이디가 존재하면
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false; // 동일한 아이디가 존재하지 않으면
		
	}
	
}














