package dao;

import java.util.ArrayList;

import dto.Board;

public class BoardDao extends Dao{

	public BoardDao() {
		super();
	}
	
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() {return boardDao;}
	
	// 게시물 작성 메소드
	public boolean write(Board board) {
		
		String sql = "insert into board(bcontent, mno, bfile)values(?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBcontent());
			ps.setInt(2, board.getMno());
			ps.setString(3, board.getBfile());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {System.out.println("게시물 작성 메소드" + e);}
		return false;
	}
	// 모든 게시물 출력 메소드
	public ArrayList<Board> getboardlist(){
		ArrayList<Board> boardlist = new ArrayList<Board>();
		String sql = "select * from board order by bno desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5)
						);
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {}
		return null;
		
	}
	
}
















