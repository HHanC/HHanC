package Day09;

public class Day09_1 {

	// p. 277 : 확인문제	
		// 1. 3 [하나의 클래스로 여려개 객체 생성 가능]
		// 2. 4	[로컬 변수 {} 내에서 선언]
		// 3. 4 [반드시는 x]
		// 4. 3	[클래스의 멤버 선언 순서 x]
		// 5. 1
			// 1. 객체는 생성자x 인스턴스 생성자o
			// 2. this.멤버명
			//    this.필드명
			//    this.메소드
			//	  this() : 빈 생성자 호출
			// 	  this(데이터, 데이터) : 생성자
		// 6. void : 메소드가 종료되면서 반환값이 없다. *중요문제
			// 4. Override(정답) : 동일한 메소드를 재정의
		// 7. 2
		// 8. static : 정적 멤머 [생성자에서는 static] *중요문제
			// 객체없이 클래스를 통해 접근 가능 <---------> new 객체로 접근
		// 9. 2 final : 상수 [ 수정 불가 ]
		// 10. 4 [단 이클립스, 인텔리제이 같은 에디터는 자동 변경]
		// 11. 3 default : 해당 패키지 / private : 해당 클래스 *중요문제
		// 12. (1)필드 (2)생성자 (3)메소드
		// {} 있으면 생성자 혹은 메소드
		// 클래스명과 이름이 동일하면 생성자
		// 클래스명과 이름이 동일하지 않으면 메소드
		// 13.
			// String name;
			// String id;
			// String password;
			// String age;
		// 14.
			// 생성자 선언시 : 클래스 이름 동일
			// Member( String name, String id){
			// this.name = name
			// this.id = id;
			// }
		// 15.
			// 매개변수 : 인수 : 메소드 호출시 메소드로 들어오는 데이터
			// *** 로그인 메소드
			// boolean login(String id, String password){ 
			// 
			// if(id.equals("hong") && passwoed.equals("12345") ){
			// // 아이디가 hong 이면서 패드워드가 12345이면 true 반환
			// return true;
			// }
			// return false;
			// }
			// **로그아웃 메소드 [반환타입 메소드명 (인수1, 인수2) {} ]
			// void logout(String id){
			//
			// system.out.print("로그아웃 되었습니다.")
			// }
		// 16. 
		/*
		 * 객체를 통한 메소드 호출 가능
		 * *******동일한 이름으로 메소드를 선언가능 [단 서로 다른 인수[매개변수] 사용]
		 * void println(int x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
		 * 		system.out.println(x);
		 * }
		 * void println(boolean x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
		 * 		system.out.println(x);
		 * }
		 * void println(double x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
		 * 		system.out.println(x);
		 * }
		 * void println(String x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
		 * 		system.out.println(x);
		 * }
		 * 
		 * 
		 */
		// 17. 
			/*
			 * ***** 객체를 생성하지 않고 메소드를 호출하는 방법
			 * static void println(int x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
			 * 		system.out.println(x);
			 * }
			 * static void println(boolean x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
			 * 		system.out.println(x);
			 * }
			 * static void println(double x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
			 * 		system.out.println(x);
			 * }
			 * static void println(String x) { // 외부로부터 int형 변수를 인수로 받아 출력 메소드
			 * 		system.out.println(x);
			 * }
			 * 
			 * 
			 * 
			 */
		// 18. pass
		// 19. 모바일 뱅크 프로그램[2번 과제] 대체
			
	
	
}		
