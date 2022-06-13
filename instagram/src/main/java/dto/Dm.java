package dto;

public class Dm {

	private int dno; 
	private String dhost;
	private String dconnect;
	
	public Dm() {}
	
	public Dm(int dno, String dhost, String dconnect) {
		super();
		this.dno = dno;
		this.dhost = dhost;
		this.dconnect = dconnect;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDhost() {
		return dhost;
	}

	public void setDhost(String dhost) {
		this.dhost = dhost;
	}

	public String getDconnect() {
		return dconnect;
	}

	public void setDconnect(String dconnect) {
		this.dconnect = dconnect;
	}
	
	
	
	
	
}
