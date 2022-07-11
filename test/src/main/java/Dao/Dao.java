package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.MemberDto;
import Dto.PartyDto;
import Dto.VoteDto;

public class Dao {

	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/xe?serverTimezone=UTC",
					"root","1234");
			System.out.println("연동 성공");
		}catch (Exception e) { System.out.println("연동 실패"+e);}
	}
	
	public ArrayList<MemberDto> 모든회원조회(){
		ArrayList<MemberDto> list = new ArrayList<>();
		
		String sql = "select * from tbl_member_202005";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto memberDto = new MemberDto(
				rs.getString(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6));
				list.add(memberDto);
			}
		} catch (Exception e) {System.out.println(e);}
		return list;
	}
	
	public PartyDto 대표전화() {
		
		String sql = "select * from tbl_party_202005";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				PartyDto partyDto = new PartyDto(
				rs.getString(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getString(7));
				return partyDto;
			}
		} catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	public boolean 저장(VoteDto voteDto) {
		String sql = "insert into tbl_vote_202005 values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, voteDto.getV_JUMIN());
			ps.setString(2, voteDto.getV_NAME());
			ps.setString(3, voteDto.getM_NO());
			ps.setString(4, voteDto.getV_TIME());
			ps.setString(5, voteDto.getV_AREA());
			ps.setString(6, voteDto.getV_CONFIRM());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	public ArrayList<VoteDto> 모든검수조회(){
		ArrayList<VoteDto> list = new ArrayList<>();
		String sql = "select * from tbl_vote_202005";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				VoteDto voteDto = new VoteDto(
					rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6));
				list.add(voteDto);
			}
		} catch (Exception e) {System.out.println(e);}
		
		return list;
	}
	
	public ArrayList<MemberDto> 후보자등수(){
		ArrayList<MemberDto> list = new ArrayList<>();
		String sql = "select A.M_NO , A.M_NAME , count(B.V_CONFIRM) "
				+ "from tbl_member_202005 A "
				+ "join tbl_vote_202005 B "
				+ "group by A.M_NO "
				+ "order by count(B.V_CONFIRM) desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
					memberDto.setM_NO(rs.getString(1));
					memberDto.setM_NAME(rs.getString(2));
					memberDto.setV_CONFIRM(rs.getString(3));
				list.add(memberDto);
			}
		} catch (Exception e) {System.out.println(e);}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

