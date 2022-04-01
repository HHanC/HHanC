package 과제.타이어와비슷한예제만들기;

public class 왼팔 extends 근육 { // 슈퍼클래스 상속

	public 왼팔() {} // 깡통 생성자
	
	public 왼팔(int 최대근육, int 누적근육) { // 생성자에 정수의 최대근육과 누적근육 변수를 만듦
		super(최대근육); // 슈퍼클래으에 보낼 값
	}
	
	@Override // 슈퍼클래스 재정의
	public boolean make() { // 슈퍼클래스 생성자 호출
		누적근육++; // 증가 연산자 사용하여 실행 될때마다 1씩 업
		if(누적근육 < 최대근육) { // 누적근육이 최대근육보다 적다면
			System.out.println("왼팔 근육수명 : "+ (최대근육 - 누적근육)); // 최대근육 - 누적근육을 하여 수명을 나타냄
			return true; // 위 조건에 해당되면 true값 리턴
		}else { // 위조건이 아니라면
			System.out.println("왼팔 근육파괴");
			return false; // false 값 리턴
		}	
	}
	
}
