package 과제.타이어와비슷한예제만들기;

public class 근육 {

	// 1. 필드
	public int 최대근육; 
	public int 누적근육;	
	// 2. 생성자
	public 근육() {}
	
	public 근육(int 최대근육) {
		this.최대근육 = 최대근육;
	}	
	// 3. 메소드
	public boolean make() { // make 만들다 , make 메소드 생성
		누적근육++; // 누적근육에 증가 연산자
		if(누적근육 < 최대근육) { // 누적근육이 최대 근육보다 작다면
			System.out.println("근육수명 : " + (최대근육 - 누적근육)); // 최대근육 - 누적근육을 하여 남은 근육 확인
			return true; // true값 return
		}else { // 위 조건이 아니라면
			System.out.println("근육파괴"); // 해당 근육 위치 파괴!!
			return false; // false값 return
		}						
	}
}
