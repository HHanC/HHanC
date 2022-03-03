package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		boolean run = true; // 실행 여부 변수 / true=실행 false=중지		
		int balance = 0; // 예금액 [통장안에 있는 금액] 변수
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.println("----------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1) { //만약에 입력값이 1이면
				System.out.println(" 예금액 : "); int 예금액 = scanner.nextInt();
				balance += 예금액;
			}
			else if( 선택 == 2) { //만약에 입력값이 2이면
				System.out.println(" 출금액 : "); int 출금액 = scanner.nextInt();
				balance -= 출금액;
			}
			else if( 선택 == 3) { //만약에 입력값이 3이면
				System.out.println(" 잔고 : " + balance);
			}
			else if( 선택 == 4) { //만약에 입력값이 4이면
				break;
			}else{
				System.out.println("알림) 알수 없는 번호 입니다.");
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
