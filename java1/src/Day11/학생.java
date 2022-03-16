package Day11;

public class 학생 {

	private String 이름;
	private int 국어;
	private int 영어;
	private int 과학;
	
	public 학생() {}

	public 학생(String 이름, int 국어, int 영어, int 과학) {
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.과학 = 과학;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get국어() {
		return 국어;
	}

	public void set국어(int 국어) {
		this.국어 = 국어;
	}

	public int get영어() {
		return 영어;
	}

	public void set영어(int 영어) {
		this.영어 = 영어;
	}

	public int get과학() {
		return 과학;
	}

	public void set과학(int 과학) {
		this.과학 = 과학;
	}
	
	
}
