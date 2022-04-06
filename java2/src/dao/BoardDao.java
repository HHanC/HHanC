package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList; 

public class BoardDao {

	private Connection conn; // 1. DB 연결 클래스
	private PreparedStatement ps; // 2. 연결된 DB내
	private ResultSet rs; // 3. SQL 결과 가져오는 인터페이스
	
	public static BoardDao boardDao = new BoardDao(); // db연동 객체
	
	public BoardDao() { // 생성자에서 연동하는 이유 : 객체
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234");
			
		}catch (Exception e) {}		
	}	
	// 1. 글쓰기 메소드
	public boolean write(Board board) {
		try {
		// 1. sql 작성
			String sql = "insert into board(btitle, bcontent, bwrite)values(?,?,?)";
		// 2. sql 조작
			ps = conn.prepareStatement(sql);
			ps.setString(1, board.getBtitle()); ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
		// 3. sql 실행
			ps.executeUpdate();
		// 4. sql 결과
			return true;
		}catch (Exception e) {}
		
		return false;
		
	}
	// 2. 모든 글 호출 메소드
	public ObservableList<Board> list () {
		
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		// 1. sql 작성
			String sql = "select * from board order by bnum desc";
		// 1. sql 조작
			ps = conn.prepareStatement(sql);
		// 1. sql 실행
			rs = ps.executeQuery();
		
		// 1. sql 결과
			// rs : 검색 결과의 레코드를 하나씩 순회[가져오기 = next()]
			while(rs.next()) {				
				// 1. 객체화
				Board board = new Board(rs.getInt(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5), 
						rs.getInt(6));
				// 2. 해당 객체를 리스트에 담기
				boardlist.add(board);
				
				
			}
			// 성공시 리스트 반환
			return boardlist;
		}catch (Exception e) {}
		return null;
		
	}
	// 3. 글 삭제 메소드
	public boolean delete(int bnum) {
		
		try {
			// 1. sql작성
			String sql = "delete from board where bnum=?";
			// 2. sql조작
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			// 3. sql실행
			ps.executeLargeUpdate();
			// 4. sql결과
			return true;
			
		
		}catch (Exception e) {}
		return false;
	}
	// 4. 글 수정 메소드
	public boolean update(int bnum, String title, String content) {
		
		try {
		String sql = "update board set btitle=?, bcontent=? where bnum=?";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setInt(3, bnum);
		
		ps.executeUpdate();
		
		return true;
		}catch (Exception e) {
		return false;
		}
	}
		// 5. 댓글 작성 메소드
		public boolean rwrite(Reply reply) {
			try {
				String sql = "insert into reply(rcontent,rwrite,bnum)values(?,?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, reply.getRcontent());
				ps.setString(2, reply.getRwrite());
				ps.setInt(3, reply.getBnum());
				ps.executeUpdate();
				return true;
			}catch (Exception e) {
				System.out.println(e + " 댓글");
			}
			return false;
		}
		
		// 6. 댓글 호출 메소드
		public ObservableList<Reply> replylist(int bnum) {
			
			ObservableList<Reply> replylist = FXCollections.observableArrayList();
			
			try {
				String sql = "select * from reply where bnum = ? order by bnum desc";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, bnum);
				rs = ps.executeQuery();
				while(rs.next()) {
					Reply reply = new Reply(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getInt(5));
							replylist.add(reply);
				}
					return replylist;
				
			}catch (Exception e) {
				System.out.println("정말 뮈쳐버리겠네"+e);
			}
			return null;
		}
	
		
	
}












