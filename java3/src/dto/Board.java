package dto;

public class Board {

	private int nnum;
	private String ntitle;
	private String ncontent;
	private String nwrite;
	private String ndate;
	
	public Board() {}

	public Board(int nnum, String ntitle, String ncontent, String nwrite, String ndate) {
		super();
		this.nnum = nnum;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.nwrite = nwrite;
		this.ndate = ndate;
	}

	public int getNnum() {
		return nnum;
	}

	public void setNnum(int nnum) {
		this.nnum = nnum;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNwrite() {
		return nwrite;
	}

	public void setNwrite(String nwrite) {
		this.nwrite = nwrite;
	}

	public String getNdate() {
		return ndate;
	}

	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	
	
}
