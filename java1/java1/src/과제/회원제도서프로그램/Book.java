package ����.ȸ�����������α׷�;

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
