package dto;

public class Replys {

	private int rnum; 
    private String rcontent;
    private String rwrite;
    private String rdate;
    private int nnum;
    
    public Replys() {}

	public Replys(int rnum, String rcontent, String rwrite, String rdate, int nnum) {
		super();
		this.rnum = rnum;
		this.rcontent = rcontent;
		this.rwrite = rwrite;
		this.rdate = rdate;
		this.nnum = nnum;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public String getRwrite() {
		return rwrite;
	}

	public void setRwrite(String rwrite) {
		this.rwrite = rwrite;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public int getNnum() {
		return nnum;
	}

	public void setNnum(int nnum) {
		this.nnum = nnum;
	}
    
    
	
}
