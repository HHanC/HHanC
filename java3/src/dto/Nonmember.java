package dto;

public class Nonmember {

	private int nnum;
	private String ntitle;
	private String nwrite;
	private String ndate;
	
	public Nonmember() {}

	public Nonmember(int nnum, String ntitle, String nwrite, String ndate) {
		super();
		this.nnum = nnum;
		this.ntitle = ntitle;
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
