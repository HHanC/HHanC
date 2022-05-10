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
	
	//아이디 유효성검사 메소드
	public boolean idcheck(String mid) {
		
		String sql= "SELECT * FROM member WHERE mid=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, mid);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("idcheck err!!   memberdao.idcheck  "+e);
		}			
		return false;
	}
	
	//이메일 유효성검사 메소드
	public boolean emailcheck(String memail) {
		
		String sql="SELECT * FROM member WHERE memail=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, memail);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("email check err !! "+e);
		}
		return false;
	}
	//회원가입 메소드
	public boolean signup(Member member) {
		
		String sql ="INSERT INTO member (mid, mpassword, mname ,mphone ,memail ) VALUES (?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.setString(4, member.getMphone());
			ps.setString(5, member.getMemail());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("signup err!!  " +e);
		}
		
		return false;
	}
	//로그인 메소드
	public	int login(String mid, String mpwd) {
		
		String sql="SELECT *FROM member where mid=? and mpassword=? ";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mpwd);
			rs=ps.executeQuery();
			if(rs.next()) {
				return 1;
			}
		} catch (Exception e) {
			System.out.println("login err!! "+e);
			return 3;
		}
		return 2;
	}
	
	//아이디 찾기 메소드
	public String findid(String mname, String memail) {
		String sql ="SELECT mid FROM member where mname=? AND memail=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, mname);
			ps.setString(2, memail);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getString("mid");
			}
		} catch (Exception e) {
			System.out.println("findid err !!  "+e);
		}
		return null;
	}
	
	//비밀번호 찾기
	public boolean findpwd(String mid, String mname) {
		
		String sql="SELECT mpassword FROM member where mid=? AND mname=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mname);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("findpassword  err !!  "+e);
		}
		return false;
	}
}