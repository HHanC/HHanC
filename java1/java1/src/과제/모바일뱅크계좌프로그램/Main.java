package 과제.모바일뱅크계좌프로그램;

import java.util.Scanner;

public class Main {

	// 모바일 뱅크 계좌 프로그램
			// 요구사항
			// 회원 주요기능 : 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기
			// 주요기능 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록
			// 설계 : 통장, 대출, 회원
				// 필드
				// 메소드
	
	static Scanner scanner = new Scanner(System.in); // 정적변수를 선언하여 다른 클래스나 페키지에서 사용할 수 있도록 한다.
	static Member[] members = new Member[1000]; // 정적변수를 선언하여 다른 클래스나 페키지에서 사용할 수 있도록 한다.
	static Bank[] banks = new Bank[1000]; // 정적변수를 선언하여 다른 클래스나 페키지에서 사용할 수 있도록 한다.
	
	public static void main(String[] args) { // main메소드
		Main main = new Main(); // 객체 생성
		main.member(); // 접근 연산자 사용하여 메소드 호출
	}
	
	void member() { 
		while(true) {
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기");
			int ch = scanner.nextInt();
			Member member = new Member();
			if(ch == 1) {
				boolean result = member.회원가입();
				if(result) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if(ch == 2) {
				String result = member.로그인();
				if(result == null) {
					System.out.println("동일한 회원 정보가 없습니다.");
				}else {
					System.out.println("로그인 성공");
					bankmember();
				}						
			}else if(ch == 3) {
				member.아이디찾기();
			}else if(ch == 4) {
				member.비밀번호찾기();
			}else {
				
			}			
		}
	}
	void bankmember() {
		while(true) {
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록");
			int ch = scanner.nextInt();
			Bank bank = new Bank();
			if(ch == 1) {
				bank.계좌개설();
			}else if(ch == 2) {
				bank.입금();
			}else if(ch == 3) {
				bank.출금();
			}else if(ch == 4) {
				bank.이체();
			}else if(ch == 5) {
				bank.대출();
			}else if(ch == 6) {
				bank.내계좌목록();
			}else if(ch == 7) {
				return;
			}else {
				System.out.println("알 수 없는 번호입니다.");
			}
		}
	}
}
