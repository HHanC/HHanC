package 과제.주차평가;

import java.util.Scanner;

public class App { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // w s
			try {
				
				System.out.println("---------------------------주차 현황 표---------------------------");
				System.out.println("\t\t\t1. 입차 \t2. 출차 : "); int ch = scanner.nextInt();
				// 1. 모든 차량 표 출력
					//
							// 배열이나 리스트내 모든 객체 호출 반복문
					//
				if(ch == 1) { // 주차등록
					// 1. 차량번호를 입력받는다.
					System.out.print("차량번호 : "); String 차량번호 = scanner.next();
						// 입력
					// 2. 입력받은 차량번호를 컨트롤내 메소드에게 넘긴다.
					Controller controller = new Controller();
					boolean car = controller.입차(차량번호);
					if(car == true) {
						System.out.println("주차를 할 수 있습니다.");
					}else {
						System.out.println("주차할 공간이 없습니다.");
					}
					// 3. 메소드 결과에 따른 출력
					
					
				}else if(ch == 2) {
					// 1. 차량번호를 입력받는다.
						// 입력
					// 2. 입력받은 차량번호를 컨트롤내 메소드에게 넘긴다.
					// 3. 메소드 결과에 따른 출력
					
				}else {
					
				}	
			}catch (Exception e) {}
		} // w e
	} // m e	
} // c e
