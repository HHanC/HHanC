package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsptest?serverTimezone=UTC",
					"root","1234");
			System.out.println("연동 성공 ");
		}catch(Exception e ){ System.out.println("연동 실패 ");}
		
	}
	// 모든 글 조회 // list에 모든 정보가 저장됨
	public ArrayList<Board> list(){
		ArrayList<Board> boardList = new ArrayList<Board>();
		String sql = "select * from board order by bno desc";
		try {
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Board board = new Board(
						rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getString(4),
						rs.getString(5)
						);
				boardList.add(board);
			}
			return boardList;
		} catch (Exception e) {}
		return null;
	}
	
	public Board get(int bno) {
		String sql = "select * from board"
				+ " where bno=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5)
						);
				return board;
			}
		} catch (Exception e) {}
		return null;
		
	}
	
	public boolean write(Board board) {
		String sql = "insert into board(btitle, bcontent, bwriter, bdate) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwriter());
			ps.setString(4, board.getBdate());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {}
		return false;
	}
	
	public boolean delete(String mid) {
		String sql = "delete from member where mid=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {}
		return false;
	}
	
	public boolean update(String bcontent, String btitle, int bno) {
		try {
			String sql = "update board set bcontent=?, btitle=? where bno=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, bcontent);
			ps.setString(2, btitle);
			ps.setInt(3, bno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {}
		return false;
	}
	
	public boolean bdelete(int bno) {
		String sql = "delete from board where bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {}
		return false;
	}
	
}










