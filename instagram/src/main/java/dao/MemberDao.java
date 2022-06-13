package dao;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.Member;

public class MemberDao extends Dao{
	
	public MemberDao() {
		super();
	}
	public static MemberDao memberDao = new MemberDao();
	public static MemberDao getMemberDao() {
		return memberDao;
	}
	
	
	
	// 사용자 이메일 체크
	public boolean memailcheck(String memail) {
		
		String sql = "select * from member where memail=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
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
		String sql = "insert into member( memail, mname, mname2, mpassword)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMemail());
			ps.setString(2, member.getMname());
			ps.setString(3, member.getMname2());
			ps.setString(4, member.getMpassword());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("회원가입 오류" + e);}
		return false;
	}
	// 로그인 메소드
	public int login(String memail, String mpassword) {
		
		String sql = "select * from member where memail=? and mpassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
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
		public String getmname2(String memail) {
			String sql = "select mname2 from member where memail = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, memail);
				rs = ps.executeQuery();
				if(rs.next()) {
					return rs.getString(1);
				}
			} catch (Exception e) {System.out.println("회원번호 출력 메소드" + e);}
			return null;
		}
	
	// 회원번호 출력 메소드
	public int getmno(String memail) {
		
		String sql = "select mno from member where memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {System.out.println("회원번호 출력 메소드" + e);}
		return 0;
	}
	
	// 회원 아이디 출력
	public String mname2(String memail) {
		String sql = "select mname2 from member where memail=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {}
		return null;
	}
	
	// 회원 아이디 출력
	public String getmname2(int mno) {
		String sql = "select mname2 from member where mno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mno);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("memberdao getmname2오류:" + e);
		}
		return null;
	}
	// 회원 아이디 출력 (json버전)/follow/followermnoinfo2서블릿 , /follow/followingmnoinfo2서블릿에서 사용함
		public JSONArray getmname2json(int mno) {
			JSONArray jsonArray = new JSONArray();
			String sql = "select mname2 from member where mno="+mno;
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					JSONObject object = new JSONObject();
					object.put("mname2",rs.getString(1));
					jsonArray.put(object);
					System.out.println(jsonArray);
				}
				return jsonArray;
			} catch (Exception e) {
				System.out.println("memberdao getmname2json오류:" + e);
			}
			return null;
		}
	// 회원 사용자 이름 찾기
	public String getname2(String memail , String mname) {
		String sql = "select mname2 from member where memail=? and mname=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			ps.setString(2, mname);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString("mname2");
			}
		} catch (Exception e) {System.out.println("아이디 찾기 오류" + e);}
		return null;
	}
	
	// 회원 비밀번호 찾기
	public String getpasswrod(String memail) {
		String sql = "select * from member where memail=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString(5);
			}
		} catch (Exception e) {System.out.println("비밀번호 찾기 오류" + e);}
		return null;
	}
	
	// 회원 탈퇴시
	public boolean dpasswordcheck(String memail , String mpassword) {
		String sql = "select * from member where memail=? and mpassword=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			ps.setString(2, mpassword);
			rs = ps.executeQuery();
			if(rs.next()) return true;
		} catch (Exception e) {System.out.println("비밀번호 체크" + e);} return false;
	}
	// 회원 탈퇴시
	public boolean delete(String memail) {
		String sql = "delete from member where memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memail);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("아이디 체크" + e);} return false;
	}
	
	
	
}













