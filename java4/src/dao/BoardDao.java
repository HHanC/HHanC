package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	// �ʵ�
	private Connection con; // 1. DB ���� Ŭ����
	private PreparedStatement ps; // 2. ����� DB�� SQL ���� �������̽�
	private ResultSet rs; // 3. SQL ��� ���ڵ带 �������� �������̽�
	
	public static BoardDao boardDao = new BoardDao(); // db���� ��ü
	
	// ������
	public BoardDao() { // �����ڿ��� �����ϴ� ���� : ��ü ������ �ٷ� db �����ϱ� ���� ?? 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc ����̺� Ŭ���� ȣ��
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB �ּ� ���� 
		}catch (Exception e) {}	
	}
	
	// �޼ҵ�
		// 1. �۾��� �޼ҵ�
	public boolean write(Board board) {
		try {
			// 1. sql �ۼ�
			String sql = "insert into board(btitle, bcontent, bwrite) values(?,?,?)";
			// 2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			// 3. sql ����
			ps.executeUpdate();
			// 4. sql ���
			return true;
		}catch (Exception e) {}
		return false;
	}
		// 2. ��� �� ȣ�� �޼ҵ� [��ȯ Ÿ�� : ObservableList]
	public ObservableList<Board> list() {
		// * ����Ʈ ����
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			// 1. sql �ۼ�
				// ���� : ordere by �ʵ�� asc [�ش� �ʵ�� �������� ��������]
				// ���� : ordere by �ʵ�� desc [�ش� �ʵ�� �������� ��������]
				String sql = "select * from board order by bnum desc";
			// 2. sql ����
				ps = con.prepareStatement(sql);
			// 3. sql ����
				rs = ps.executeQuery();
			// 4. sql ���
				// rs : �˻� ����� ���ڵ带 �ϳ��� ��ȸ[�������� = next()]
					// rs.next() : �˻� ����� ���� ���ڵ�
					// rs.get�ڷ���(�ش� �ʵ��� ������ȣ) : �� ���ڵ忡�� �ش� �ʵ��� ������ ��������
				while(rs.next()) { // ���� ���ڵ尡 ���������� �ݺ�
					// 1. ��üȭ
					Board board = new Board(
							rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getString(4), 
							rs.getString(5), 
							rs.getInt(6));
					// 2. �ش� ��ü�� ����Ʈ�� ���
					boardlist.add(board);
				}
				return boardlist; // ������ ����Ʈ ��ȯ
		}catch (Exception e) {}
		return null; // ���н� �̤ŤӤ�
	}
		// 3. �ۻ��� �޼ҵ�
	public boolean delete(int bnum) {
		
		return false;
	}
		// 4. �� ���� �޼ҵ�
	public boolean update(int bnum, String title, String content) {
		
		return false;
	}
}




















