package Day11;

public class Day11_1 {

	// p. 386 확인문제
		// 1. 3 [인터페이스의 멤버 : 1. 상수필드 2. 추상메솓, 3. 디폴트메소드 4. 정적메소드]
		// 2. 4 [인터페이스 변수 = 구현객체]
			// 구현객체 = 클래스가 implements 한 객체
		// 3. 
	private static void printSound(Soundable soundable) {
	// 접근제한자 정적 반환타입	 메소드명 (인수[변수 , 배열, 객체, 인터페이스]
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		
		
	}
}
