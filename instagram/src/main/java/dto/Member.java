package dto;

public class Member {

	@Override
	public String toString() {
		return "Member [mno=" + mno + ", mep=" + mep + ", mpassword=" + mpassword + ", mname=" + mname + "]";
	}

	private int mno;
	private String mep;
	private String mpassword;
	private String mname;
	
	public Member() {}

	public Member(int mno, String mep, String mpassword, String mname) {
		super();
		this.mno = mno;
		this.mep = mep;
		this.mpassword = mpassword;
		this.mname = mname;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMep() {
		return mep;
	}

	public void setMep(String mep) {
		this.mep = mep;
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

	
	
}
