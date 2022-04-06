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

	private Connection conn; // 1. DB ���� Ŭ����
	private PreparedStatement ps; // 2. ����� DB��
	private ResultSet rs; // 3. SQL ��� �������� �������̽�
	
	public static BoardDao boardDao = new BoardDao(); // db���� ��ü
	
	public BoardDao() { // �����ڿ��� �����ϴ� ���� : ��ü
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234");
			
		}catch (Exception e) {}		
	}	
	// 1. �۾��� �޼ҵ�
	public boolean write(Board board) {
		try {
		// 1. sql �ۼ�
			String sql = "insert into board(btitle, bcontent, bwrite)values(?,?,?)";
		// 2. sql ����
			ps = conn.prepareStatement(sql);
			ps.setString(1, board.getBtitle()); ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
		// 3. sql ����
			ps.executeUpdate();
		// 4. sql ���
			return true;
		}catch (Exception e) {}
		
		return false;
		
	}
	// 2. ��� �� ȣ�� �޼ҵ�
	public ObservableList<Board> list () {
		
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		// 1. sql �ۼ�
			String sql = "select * from board order by bnum desc";
		// 1. sql ����
			ps = conn.prepareStatement(sql);
		// 1. sql ����
			rs = ps.executeQuery();
		
		// 1. sql ���
			// rs : �˻� ����� ���ڵ带 �ϳ��� ��ȸ[�������� = next()]
			while(rs.next()) {				
				// 1. ��üȭ
				Board board = new Board(rs.getInt(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5), 
						rs.getInt(6));
				// 2. �ش� ��ü�� ����Ʈ�� ���
				boardlist.add(board);
				
				
			}
			// ������ ����Ʈ ��ȯ
			return boardlist;
		}catch (Exception e) {}
		return null;
		
	}
	// 3. �� ���� �޼ҵ�
	public boolean delete(int bnum) {
		
		try {
			// 1. sql�ۼ�
			String sql = "delete from board where bnum=?";
			// 2. sql����
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			// 3. sql����
			ps.executeLargeUpdate();
			// 4. sql���
			return true;
			
		
		}catch (Exception e) {}
		return false;
	}
	// 4. �� ���� �޼ҵ�
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
		// 5. ��� �ۼ� �޼ҵ�
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
				System.out.println(e + " ���");
			}
			return false;
		}
		
		// 6. ��� ȣ�� �޼ҵ�
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
				System.out.println("���� ���Ĺ����ڳ�"+e);
			}
			return null;
		}
	
		
	
}











