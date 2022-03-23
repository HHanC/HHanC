package 과제.주차프로그램내부평가;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		while(true) { // 반복문 실행
			try { // 예외처리 발생 try
				System.out.println("--------------------주차 현황 표--------------------"); // 주차 현황표 출력
				System.out.println("\t\t 1. 입차 \t 2. 출차"); int ch = scanner.nextInt(); // 입차 또는 출차 선택
				
				if(ch == 1) {	// 1번 입력받았을시
					
					System.out.print("차량번호 : "); String 차량번호 = scanner.next(); // 차량번호 입력
					Controller controller = new Controller(); // Controller 깡통 생성자 메모리 생성
					Boolean 통과 = Controller.입차(차량번호); // Controller 의 입차 메소드에 사용자가 입력한 차량번호를 저장하고 입차 메소드의 차량번호 값이 true이면 주차가능 false이면 주차 불가능
					if(통과 == true) {
						System.out.println("입차 가능");
					}else {
						System.out.println("입차 불가능");
					}
					
				}else if(ch == 2) { // 2번을 입력받았을시
					
					System.out.println("차량번호 : "); String 차량번호 = scanner.next(); // 차량변호를 입력받는다
					Controller controller = new Controller(); // Controller 클래스를 통해 Controller 생성자를 불러오고 메모리를 할당하여 controller객체가 메모리에 들어가게된다.
					Boolean 통과 = Controller.출차(차량번호); // 입력받는 차량번호는 Controllre클래스의 출차 메소드에 저장하게 된다. 이때 boolean 변수가 true이면 출차 가능 false이면 출차 불가능
					
					if(통과 == true) {
						System.out.println("출차 가능");
					}else {
						System.out.println("출차 불가능");
					}
					
					
				}else {
					System.out.println("알 수 없는 번호입니다.");
				}
			}catch (Exception e) {
			}
			
		}
		
	}
	
}
