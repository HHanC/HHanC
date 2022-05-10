package dto;

public class Member {
	private int mnum;			//사용자 가입고유번호
	private String mid;			//사용자 아이디
	private String mpassword;	//사용자 패스워드
	private String mname;		//사용자 이름
	private String mphone;		//사용자 핸드폰번호
	private String memail;		//사용자 이메일

	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Member(int mnum,String mid, String mpassword, String mname, String mphone, String memail) {
		super();
		this.mnum=mnum;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname=mname;
		this.mphone = mphone;
		this.memail = memail;
	}

	
	
	@Override
	public String toString() {
		return "Member [mnum=" + mnum + ", mid=" + mid + ", mpasswrod=" + mpassword + ", mname=" + mname + ", mphone="
				+ mphone + ", memail=" + memail + "]";
	}


	public int getMnum() {
		return mnum;
	}


	public void setMnum(int mnum) {
		this.mnum = mnum;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getMpassword() {
		return mpassword;
	}


	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	
	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMphone() {
		return mphone;
	}


	public void setMphone(String mphone) {
		this.mphone = mphone;
	}


	public String getMemail() {
		return memail;
	}


	public void setMemail(String memail) {
		this.memail = memail;
	}
	
	
}
