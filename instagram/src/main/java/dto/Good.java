package dto;

public class Good {
	
	private int gno;
	private int mno;
	private int bno;
	private int rno;
	private String gdate;
	
	public Good() {
		// TODO Auto-generated constructor stub
	}

	public Good(int gno, int mno, int bno, int rno, String gdate) {
		super();
		this.gno = gno;
		this.mno = mno;
		this.bno = bno;
		this.rno = rno;
		this.gdate = gdate;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
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

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getGdate() {
		return gdate;
	}

	public void setGdate(String gdate) {
		this.gdate = gdate;
	}

	@Override
	public String toString() {
		return "Good [gno=" + gno + ", mno=" + mno + ", bno=" + bno + ", rno=" + rno + ", gdate=" + gdate + "]";
	}
	
	
	
}
