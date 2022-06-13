package dto;

public class Image {

	private int ino;
	private int bno;
	private String ifile;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(int ino, int bno, String ifile) {
		super();
		this.ino = ino;
		this.bno = bno;
		this.ifile = ifile;
	}

	public int getIno() {
		return ino;
	}

	public void setIno(int ino) {
		this.ino = ino;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getIfile() {
		return ifile;
	}

	public void setIfile(String ifile) {
		this.ifile = ifile;
	}

	@Override
	public String toString() {
		return "Image [ino=" + ino + ", bno=" + bno + ", ifile=" + ifile + "]";
	}
	
}
