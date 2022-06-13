package dto;

public class Image2 {

	private int ino2;
	private int mno2;
	private String ifile2;
	
	public Image2() {
		// TODO Auto-generated constructor stub
	}

	public Image2(int ino2, int mno2, String ifile2) {
		super();
		this.ino2 = ino2;
		this.mno2 = mno2;
		this.ifile2 = ifile2;
	}

	public int getIno2() {
		return ino2;
	}

	public void setIno2(int ino2) {
		this.ino2 = ino2;
	}

	public int getMno2() {
		return mno2;
	}

	public void setMno2(int mno2) {
		this.mno2 = mno2;
	}

	public String getIfile2() {
		return ifile2;
	}

	public void setIfile2(String ifile2) {
		this.ifile2 = ifile2;
	}

	@Override
	public String toString() {
		return "Image2 [ino2=" + ino2 + ", mno2=" + mno2 + ", ifile2=" + ifile2 + "]";
	}
	
	
	
}