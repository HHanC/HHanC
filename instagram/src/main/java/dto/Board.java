package dto;

import dao.MemberDao;

public class Board {
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", bcontent=" + bcontent + ", mno=" + mno + ", bdate=" + bdate 
				+ ", mname2=" + mname2 + "]";
	}


	private int bno;
	private String bcontent;
	private String bdate;
	private int mno;
	private String mname2;
	
	
	public Board() {}
	
	public Board(int bno) {}

	public Board(int bno, String bcontent, String bdate, int mno, String mname2) {
		super();
		this.bno = bno;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.mno = mno;
		this.mname2 = MemberDao.getMemberDao().getmname2(mno);
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public String getBdate() {
		return bdate;
	}


	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}
	
	public String getmname2() {
		return mname2;
	}


	public void setMname2(String mname2) {
		this.mname2 = mname2;
	}

	
	
}
