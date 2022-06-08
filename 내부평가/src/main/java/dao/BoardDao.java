package dao;

import java.util.ArrayList;

import dto.Board;

public class BoardDao  extends Dao{

	public BoardDao() {
		super();
	}
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() { return boardDao; }

	
	public boolean write(Board board) {
		
		String sql = "insert into test(btitle, bcontent, bwrite, bpassword)values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			ps.setString(4, board.getBpassword());
			ps.executeUpdate();
		} catch (Exception e) {System.out.println("게시물 저장 메소드 : " + e);}
		return false;
	}
	
	public ArrayList<Board> getboardlist(){
		ArrayList<Board> boardlist = new ArrayList<Board>();
		String sql = "select * from test order by bno desc";
		try {
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
		} catch (Exception e) {System.out.println("게시물 출력 메소드 : " + e);}
		return null;
	}
	
	
	public Board getboard(int bno) {
		String sql = "select * from test where bno = ?";
		try {
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6));
				return board;
			}
		} catch (Exception e) {System.out.println("개별 게시물 출력 메소드 : " + e);}
		return null;
	}
	
	public boolean delete(int bno) {
		String sql = "delete from test where bno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("게시물 삭제 메소드 : " + e);}
		return false;
	}
	
	public boolean update(Board board) {
		String sql = "update test set btitle=?, bcontent=? where bno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setInt(3, board.getBno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("업데이트 메소드 : " + e);}
		return false;
	}
	
}


































