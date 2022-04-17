package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static BoardDao boardDao = new BoardDao();
	
	public BoardDao() { // 생성자에 연동하는 이유는 객체 생성시 바로 db 연동하기 위해서
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234");
		}catch (Exception e) {System.out.println();}
	}
	public boolean write(Board board) {
		try {
			String sql = "insert into nboard(ntitle, ncontent, nwrite, npassword) values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getNtitle());
			ps.setString(2, board.getNcontent());
			ps.setString(3, board.getNwrite());
			ps.setString(4, board.getNpassword());
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	public ObservableList<Board> list() {
		
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			String sql = "select * from nboard order by nnum desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6));
				boardlist.add(board);
			}
			return boardlist;
		}catch (Exception e) {System.out.println("sql 오류" + e);}
		return null;
	}
	
	public boolean delete(int nnum) {
		try {
			String sql = "delete from nboard where nnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, nnum);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {}
		return false;
	}
	
	public boolean update(int nnum, String title, String content) {
		try {
			String sql = "update board set ntitle=?, ncontent=?, where nnum=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, nnum);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
}













