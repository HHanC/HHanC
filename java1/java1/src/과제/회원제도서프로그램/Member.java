package 과제.회원제도서프로그램;

public class Member {

	int mno;
	String id;
	String password;
	String name;
	String phone;
	
	public Member() {}

	public Member(int mno, String id, String password, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
}
