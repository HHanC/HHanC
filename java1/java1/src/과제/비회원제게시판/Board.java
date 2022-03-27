package 과제.비회원제게시판;

public class Board {

	String title;
	String content;
	String writer;
	String password;
	
	public Board() {}

	public Board(String title, String content, String writer, String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	
	
}
