package dto;

public class Dm2 {

	private int d2no;
	private String d2send;
	private String d2receive;
	private String d2content;
	private String d2date; 
	private int dno;
	
	public Dm2() {}
	
	public Dm2(int d2no, String d2send, String d2receive, String d2content, String d2date, int dno) {
		super();
		this.d2no = d2no;
		this.d2send = d2send;
		this.d2receive = d2receive;
		this.d2content = d2content;
		this.d2date = d2date;
		this.dno = dno;
	}

	public int getD2no() {
		return d2no;
	}

	public void setD2no(int d2no) {
		this.d2no = d2no;
	}

	public String getD2send() {
		return d2send;
	}

	public void setD2send(String d2send) {
		this.d2send = d2send;
	}

	public String getD2receive() {
		return d2receive;
	}

	public void setD2receive(String d2receive) {
		this.d2receive = d2receive;
	}

	public String getD2content() {
		return d2content;
	}

	public void setD2content(String d2content) {
		this.d2content = d2content;
	}

	public String getD2date() {
		return d2date;
	}

	public void setD2date(String d2date) {
		this.d2date = d2date;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
	
	
}
