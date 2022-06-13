package dto;

public class Reply {
	
	private int rno;
	private int mno;
	private int bno;
	private String rcontent;
	private String rdate;
	private String rfile;
	private int rindex;
	
	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(int rno, int mno, int bno, String rcontent, String rdate, String rfile, int rindex) {
		super();
		this.rno = rno;
		this.mno = mno;
		this.bno = bno;
		this.rcontent = rcontent;
		this.rdate = rdate;
		this.rfile = rfile;
		this.rindex = rindex;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getRfile() {
		return rfile;
	}

	public void setRfile(String rfile) {
		this.rfile = rfile;
	}

	public int getRindex() {
		return rindex;
	}

	public void setRindex(int rindex) {
		this.rindex = rindex;
	}

	@Override
	public String toString() {
		return "Reply [rno=" + rno + ", mno=" + mno + ", bno=" + bno + ", rcontent=" + rcontent + ", rdate=" + rdate
				+ ", rfile=" + rfile + ", rindex=" + rindex + "]";
	}
	
	
}
