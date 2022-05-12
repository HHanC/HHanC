package dao;

import dto.Member;

public class MemberDao extends Dao{
	
	public MemberDao() {
		super();
	}
	public static MemberDao memberDao = new MemberDao();
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	
	// 사용자 이메일 및 전화번호 체크
	public boolean mepcheck(String mep) {
		
		String sql = "select * from member where mep=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mep);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {System.out.println("이메일 체크 오류" + e);}
		return false;
	}
	
	// 이름 체크
	public boolean namecheck(String mname) {
		String sql = "select * from member where mname=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mname);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {System.out.println("이름 체크 오류" + e);}
		return false;
	}
	
	// 사용자 이름 체크 메소드
	public boolean namecheck2(String mname2) {
		
		String sql = "select * from member where mname2=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mname2);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {System.out.println("사용자 이름 체크 오류" + e);}
		return false;
	}
	// 사용자 비밀번호 체크 메소드
	public boolean passwordcheck(String mpassword) {
		
		String sql = "select * from member where mpassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mpassword);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {}
		return false;
	}
	
	public boolean signup(Member member) {
		String sql = "insert into member(mep, mname, mname2, mpassword)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMep());
			ps.setString(2, member.getMname());
			ps.setString(3, member.getMname2());
			ps.setString(4, member.getMpassword());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("회원가입 오류" + e);}
		return false;
	}
	
	
}













