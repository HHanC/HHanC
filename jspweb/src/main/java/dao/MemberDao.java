package dao;
// dao : Db 접근 객체


import java.util.ArrayList;

import dto.Board;
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
		
		// 개별 회원정보 출력 [인수 : 세션에 저장된 회원 id]
		public Member getMember(String mid) {
			//String sql = "select * from member where mid=?";
			String sql = "select * from member where mid='"+mid+"'";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					Member member = new Member(
							rs.getInt(1), rs.getString(2),
							null, rs.getString(4),
							rs.getString(5), rs.getString(6),
							rs.getString(7), rs.getInt(8), rs.getString(9));
					return member;
				}
			} catch (Exception e) {System.out.println(e);} return null;
		}
		
		// 패스워드 확인 메소드
		public boolean passwordcheck(String mid, String mpassword) {
			
			String sql = "select * from member where mid = '"+mid+"' and mpassword = '"+mpassword+"'";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					return true;
				}
			} catch (Exception e) {System.out.println("패스워드 체크" + e);}
			return false;
		}
		
		// 회원 삭제 메소드
		public boolean delete(String mid) {
			String sql = "delete from member where mid = '"+mid+"'";
			try {
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return true;
			} catch (Exception e) {}
			return false;
		}
		
		// 회원 수정 메소드
		public boolean update(Member member) {
			try {
				if(member.getMpassword() == null) {
					String sql = "update member set mname=?, mphone=?, memail=?, maddress=? where mno=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, member.getMname());
					ps.setString(2, member.getMphone());
					ps.setString(3, member.getMemail());
					ps.setString(4, member.getMaddress());
					ps.setInt(5, member.getMno());
				}else {
					
				String sql = "update member set mname=?, mpassword=?, mphone=?, memail=?, maddress=? where mno=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, member.getMname());
					ps.setString(2, member.getMpassword());
					ps.setString(3, member.getMphone());
					ps.setString(4, member.getMemail());
					ps.setString(5, member.getMaddress());
					ps.setInt(6, member.getMno());
				}
					ps.executeUpdate();
					return true;
			} catch (Exception e) {System.out.println(e);}
			return false;
		}
		
		// 회원번호 출력 메소드
		public int getmno(String mid) {
			String sql = "select mno from member where mid='"+mid+"'";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					return rs.getInt(1);
				}
			} catch (Exception e) {} return 0;
		}
		
		// 회원 아이디 출력 메소드
		public String getmid(int mno) {
			String sql = "select mid from member where mno='"+mno+"'";
			try { 
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					return rs.getString(1);
				}
			} catch (Exception e) {} return null;
		}
		
		// 게별 게시물 출력 메소드
}














