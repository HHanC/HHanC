package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	// 필드
	private Connection con; // 1. DB 연동 클래스
	private PreparedStatement ps; // 2. 연결된 DB내 SQL 조작 인터페이스
	private ResultSet rs; // 3. SQL 결과 레코드를 가져오는 인터페이스
	
	public static BoardDao boardDao = new BoardDao(); // db연동 객체
	
	// 생성자
	public BoardDao() { // 생성자에서 연동하는 이유 : 객체 생성지 바로 db 연동하기 위해 ?? 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc 드라이브 클래스 호출
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB 주소 연결 
		}catch (Exception e) {}	
	}
	
	// 메소드
		// 1. 글쓰기 메소드
	public boolean write(Board board) {
		try {
			// 1. sql 작성
			String sql = "insert into board(btitle, bcontent, bwrite) values(?,?,?)";
			// 2. sql 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			// 3. sql 실행
			ps.executeUpdate();
			// 4. sql 결과
			return true;
		}catch (Exception e) {}
		return false;
	}
		// 2. 모든 글 호출 메소드 [반환 타입 : ObservableList]
	public ObservableList<Board> list() {
		// * 리스트 선언
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			// 1. sql 작성
				// 정렬 : ordere by 필드명 asc [해당 필드명 기준으로 오름차순]
				// 정렬 : ordere by 필드명 desc [해당 필드명 기준으로 내림차순]
				String sql = "select * from board order by bnum desc";
			// 2. sql 조작
				ps = con.prepareStatement(sql);
			// 3. sql 실행
				rs = ps.executeQuery();
			// 4. sql 결과
				// rs : 검색 결과의 레코드를 하나씩 순회[가져오기 = next()]
					// rs.next() : 검색 결과의 다음 레코드
					// rs.get자료형(해당 필드의 순서번호) : 현 레코드에서 해당 필드의 데이터 가져오기
				while(rs.next()) { // 다음 레코드가 없을때까지 반복
					// 1. 객체화
					Board board = new Board(
							rs.getInt(1), 
							rs.getString(2), 
							rs.getString(3), 
							rs.getString(4), 
							rs.getString(5), 
							rs.getInt(6));
					// 2. 해당 객체를 리스트에 담기
					boardlist.add(board);
				}
				return boardlist; // 성공시 리스트 반환
		}catch (Exception e) {}
		return null; // 실패시 ㅜㅕㅣㅣ
	}
		// 3. 글삭제 메소드
	public boolean delete(int bnum) {
		
		return false;
	}
		// 4. 글 수정 메소드
	public boolean update(int bnum, String title, String content) {
		
		return false;
	}
}




















