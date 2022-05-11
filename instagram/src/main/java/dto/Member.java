package dto;

public class Member {

	@Override
	public String toString() {
		return "Member [mno=" + mno + ", mep=" + mep + ", mname=" + mname + ", mname2=" + mname2 + ", mpassword="
				+ mpassword + "]";
	}

	private int mno;
	private String mep;
	private String mname;
	private String mname2;
	private String mpassword;
	
	public Member() {}

	public Member(int mno, String mep, String mname, String mname2, String mpassword) {
		super();
		this.mno = mno;
		this.mep = mep;
		this.mname = mname;
		this.mname2 = mname2;
		this.mpassword = mpassword;
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

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMname2() {
		return mname2;
	}

	public void setMname2(String mname2) {
		this.mname2 = mname2;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	
	
}
