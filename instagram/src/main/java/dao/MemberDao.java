package dao;

public class MemberDao extends Dao{
	
	public MemberDao() {
		super();
	}
	public static MemberDao memberDao = new MemberDao();
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	// 사용자 이름 체크 메소드
	public boolean namecheck2(String mname2) {
		
		String sql = "select * from member where mname2="+mname2;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {}
		return false;
	}
	
	
}
