package 과제.회원제도서프로그램;

import java.util.Scanner;

public class 회원제도서프로그램 {

	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	
	
	void menu() {
		while(true) {
			System.out.println("-----------도서대여 프로그램------------");
			System.out.print("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else {
				
			}
		}
	}
	void membermenu() {
		while(true) {
			System.out.println("--------------회원 메뉴-------------");
			System.out.print("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서대여 5. 로그아웃 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else if(ch == 5) {
				
			}else {
				
			}			
		}
	}
	void adminmenu() {
		System.out.println("-------------관리자 메뉴-------------");
		System.out.print("1. 도서등록 2. 도서목록 3. 도서삭제 4. 로그아웃 선택 : "); int ch = scanner.nextInt();
		
		if(ch == 1) {
			
		}else if(ch == 2) {
			
		}else if(ch == 3) {
			
		}else if(ch == 4) {
			
		}else {
			
		}
		
	}
	
}














