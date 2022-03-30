package 과제.회원제도서프로그램;

import java.util.Scanner;

import Day14.회원;

public class 회원제도서프로그램 {

	// * 도서 대여 console 프로그램[ 클래스버전 ]
			// 1. 클래스 설계 
				// 1. book
					// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원
					// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제
				// 2. member
					// 필드 : 번호,아이디,비밀번호,이름,연락처
					// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			// 2. 화면 설계 
				// 1. 초기 메뉴 [ 1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기  ]
				// 2. 일반회원메뉴 [ 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ]
				// 3. 관리자메뉴  [ 1.도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[1000];
	static Book[] books = new Book[1000];	
	
	public static void main(String[] args) {
		
		회원제도서프로그램 회원제도서프로그램 = new 회원제도서프로그램();
		회원제도서프로그램.회원가입();
		
	}
	
	void 회원가입() {
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
				System.out.println("로그인 실패");
			}else if(result.equals("admin")) {
				System.out.println("관리자 로그인 성공");
				관리자메뉴();
			}else {
				System.out.println("일반회원 로그인 성공");
				회원메뉴();
			}
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else {
				System.out.println("알 수 없는 번호입니다.");
			}
			
		}
	}
	void 회원메뉴() {
		Book book = new Book();
		System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
		int ch = scanner.nextInt();
		if(ch == 1) {
			book.도서검색();
		}else if(ch == 2) {
			book.도서목록();
		}else if(ch == 3) {
			book.도서대여();
		}else if(ch == 4) {
			book.도서반납();
		}else if(ch == 5) {
			return;
		}else {
			System.out.println("알 수 없는 번호입니다.");
		}
		
	}
	void 관리자메뉴() {
		Book book = new Book();
		System.out.println("1. 도서등록 2. 도서목록 3. 도서삭제 4. 순위 5. 로그아웃");
		int ch = scanner.nextInt();
		
		if(ch == 1) {
			book.도서등록();
		}else if(ch == 2) {
			book.도서목록();
		}else if(ch == 3) {
			book.도서삭제();
		}else if(ch == 4) {
			//
		}else if(ch == 5) {
			return;
		}else {
			System.out.println("알 수 없는 번호입니다.");
		}
		
	}
	
} 














