package Day05;

import java.util.Scanner;

public class Day05_4_도서대여_2인과제 { // c s
	
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ] v
		2. 도서 [ 도서명(중복x) v , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	2. 초기메뉴
		1.회원가입 v 2.로그인  v
			1.회원가입시 아이디 중복체크 v 
	3. 로그인시 메뉴 
		1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 v
 			1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
			2. 도서목록시 모든 도서명 출력 
			3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
			4. 도서반납시 본인이 대여한 도서만 반납 처리 
			5. 로그아웃 초기메뉴로  v
	4. 로그인시 아이디가 admin 이면 관리자메뉴 
		1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
			1. 도서등록시 도서명을 입력받아 도서 등록처리
			2. 도서목록시 모든 도서명 출력 
			3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
			4. 로그아웃시 초기메뉴로 
	*/

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		boolean idcheck = true;
		String[][] member = new String[100][2];
		String[][] book = new String[100][3];
		boolean login = true;
		
		while(true) {
		System.out.println("-------------------");
		System.out.println(" 1. 회원가입 2. 로그인 ");
		System.out.println("-------------------");
		int 선택 = scanner.nextInt();
		
		if(선택==1) {
			System.out.println(" 아이디를 입력해주세요 : ");
			String id = scanner.next();
			System.out.println(" 비밀번호를 입력해주세요 :  ");
			String pw = scanner.next();
			  // 중복방지
			
			for( int i = 0; i<member.length; i++ ) {
				if(member[i][0] == null) {
					member[i][0] = id;
					member[i][1] = pw;
				} // if end				
			} // for end						
		} // if end
		// book 중복방지
		
		
		else if(선택==2) {
			System.out.println("---------------------로그인창-------------------");
			System.out.println(" 1. 아이디 : "); String id = scanner.next();
			System.out.println(" 2. 비밀번호 : "); String pw = scanner.next();
			for(int i = 0; i<member.length; i++) {
				if(member[i][0] != null && member[i][0].equals(id) && member[i][0].equals(pw)) {
					System.out.println(" 로그인 성공 ");
					
					for(int j = 0; j<member.length; j++) {					
					
						if(member[j][0] != null && member[j][0].equals("admin")) {
						while(true) {							
							System.out.println("------------------");
							System.out.println("1. 도서등록 2. 도서목록 3. 로그아웃 ");
							System.out.println("------------------");
							int 선택2 = scanner.nextInt();
								if(선택2 == 1) {}
									else if(선택2 == 2) {}
										else if(선택2 == 3){}
											System.out.println(" 로그아웃 하셨습니다. ");
											break;
											
							
							
							}
						}
					}
					
					
					while(true) {
						System.out.println("--------------------------------------------------");
						System.out.println(" 1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
						System.out.println("--------------------------------------------------");
						int 선택2 = scanner.nextInt();
						
						if(선택2 == 1) {
							System.out.println(" 검색하실 도서명을 입력해주세요. ");
							String 도서명 = scanner.next();
							for(int j = 0; j<book.length; j++) {
								if(book[j][0] != null && 도서명==book[j][0]) {
									System.out.println(" 대여 가능합니다. ");
								} else {
									System.out.println(" 대여 불가능합니다. ");
//									System.out.println(book[j][2]);
									break;
								}
							}
						}
						
							else if(선택2 == 2) {
								for(int u = 0; u < book.length; u++) {
									if(book[u][0].equals(book)) {
										System.out.println(" 도서 목록 ");
										System.out.println(book[u][0]);
									}
								}
							}
						
								else if(선택2 == 3) {}
						
									else if(선택2 == 4) {}
						
										else if(선택2 == 5) {
											break;
										}
										
										
										
						
					}
		
				}
			}
			}
			
			
			
		
	}// while end
		
		
	} // main end
} // c e

