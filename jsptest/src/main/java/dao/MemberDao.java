package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDao() {
		try { // 예외처리 => 자바외 외부통신할때 : 일반예외가 무조건 발생 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsptest?serverTimezone=UTC",
					"root","1234");
			System.out.println("연동 성공 ");
		}catch(Exception e ){ System.out.println("연동 실패 ");}
		
	}
	
	// 1. 회원가입
	public boolean signup(Member member) {
		
		String sql = "insert into member(mid, mpassword, mname) values(?,?,?)";
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {System.out.println("회원가입 오류" + e);}
		return false;
		
	}
	
	public boolean login(String id, String password) {
		String sql = "select * from member where mid=? and mpassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch (Exception e) {}
		return false;
	}
	
	
}



















