package 과제.회원제도서프로그램;

public class Book {

	String ISBN;
	String bname;
	String bwriter;
	boolean brental;
	String mid;
	
	public Book() {}

	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
}
