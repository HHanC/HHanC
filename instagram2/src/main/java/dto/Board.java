package dto;

import dao.MemberDao;

public class Board {
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", bcontent=" + bcontent + ", mno=" + mno + ", bdate=" + bdate + ", bfile=" + bfile
				+ ", mid=" + mname2 + "]";
	}


	private int bno;
	private String bcontent;
	private int mno;
	private String bdate;
	private String bfile;
	private String mname2;
	
	
	public Board() {}


	public Board(int bno, String bcontent, int mno, String bdate, String bfile, String mname2) {
		super();
		this.bno = bno;
		this.bcontent = bcontent;
		this.mno = mno;
		this.bdate = bdate;
		this.bfile = bfile;
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


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public String getBdate() {
		return bdate;
	}


	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


	public String getBfile() {
		return bfile;
	}


	public void setBfile(String bfile) {
		this.bfile = bfile;
	}


	public String getmname2() {
		return mname2;
	}


	public void setMname2(String mname2) {
		this.mname2 = mname2;
	}

	
	
}
