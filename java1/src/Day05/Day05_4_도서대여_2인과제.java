package Day05;

import java.util.Scanner;

public class Day05_4_도서대여_2인과제 { // c s
	
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ] 
		2. 도서 [ 도서명(중복x)  , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	2. 초기메뉴
		1.회원가입  2.로그인  
			1.회원가입시 아이디 중복체크 
	3. 로그인시 메뉴 
		1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 
 			1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
			2. 도서목록시 모든 도서명 출력 
			3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
			4. 도서반납시 본인이 대여한 도서만 반납 처리 
			5. 로그아웃 초기메뉴로  
	4. 로그인시 아이디가 admin 이면 관리자메뉴 
		1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
			1. 도서등록시 도서명을 입력받아 도서 등록처리
			2. 도서목록시 모든 도서명 출력 
			3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
			4. 로그아웃시 초기메뉴로 
	*/

	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[10][3];
		String[][] book = new String[10][3];
		
		while(true) {
			
			System.out.println("1. 회원가입 2. 로그인"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true;
				for(int i=0; i<member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("동일한 id가 존재합니다.");
						idcheck = false;
						break;
					}
					if(member[i][0] == null) {
						member[i][0] = id;
						System.out.println("회원가입 성공");
						idcheck = true;
						break;
					}
				}								
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				for(int i=0; i<member.length; i++) {
					
					boolean logincheck = false;
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("로그인 성공");
						logincheck = true;
						break;
					}
					
				}
				
			}else {
				
			}
			
		}
		
		
	} // main end
} // c e

