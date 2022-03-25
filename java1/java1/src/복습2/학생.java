package 복습2;

public class 학생 {
	
	// 1. 필드[ 저장곳 = 기록 ] 
	String 이름;
	int 국어;
	int 영어;
	int 수학;
	int 총점;
	double 평균;

	// 2. 생성자 
	public 학생() {
	}

	public 학생(String 이름, int 국어, int 영어, int 수학, int 총점, double 평균) {
		super();
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
	

		}	
}