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
	// 회원가입 메소드
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
	// 로그인 메소드
	public int login(String mep, String mpassword) {
		
		String sql = "select * from member where mep=? and mpassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mep);
			ps.setString(2, mpassword);
			rs = ps.executeQuery();
			if(rs.next()) {
				return 1;
			}else {
				return 2;
			}
		} catch (Exception e) {System.out.println("로그인 실패" + e);}
		return 3;
	}
	// 회원번호 출력 메소드
	public int getmno(String mep) {
		
		String sql = "select mno from member where mep = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mep);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {System.out.println("회원번호 출력 메소드" + e);}
		return 0;
	}
	
	// 회원 이메일 및 연락처 출력
	public String getmname2(int mno) {
		String sql = "select mname2 from member where mno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mno);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {}
		return null;
	}
	// 회원 사용자 이름 찾기
	public String getname2(String mep , String mname) {
		String sql = "select mname2 from member where mep=? and mname=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mep);
			ps.setString(2, mname);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString("mname2");
			}
		} catch (Exception e) {System.out.println("아이디 찾기 오류" + e);}
		return null;
	}
	
	// 회원 비밀번호 찾기
	public String getpasswrod(String mep, String mname, String mname2) {
		String sql = "select mpassword from member where mep=? and mname=? and mname2=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mep);
			ps.setString(2, mname);
			ps.setString(3, mname2);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString("mpassword");
			}
		} catch (Exception e) {System.out.println("비밀번호 찾기 오류" + e);}
		return null;
	}
	
}













