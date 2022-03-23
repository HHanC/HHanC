package Day05;

import java.util.Scanner;

public class Test { // c s
	
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ] 
		2. 도서 [ 도서명(중복x)  , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	2. 초기메뉴
		1.회원가입v  2.로그인v 
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
		
		Scanner scanner = new Scanner(System.in); // 입 출력 객체 생성
		String[][] member = new String[100][2]; // 맴버라는 배열 행 100 열 2
		String[][] book = new String[100][3]; // 북이라는 배열  행 100 열3 
		// 참(=실행한다)
		
		while(true) { // while s
			System.out.println("-----------------------");
			System.out.println(" 1. 회원가입 2. 로그인 ");
			System.out.println("-----------------------");
			int 선택 = scanner.nextInt();						
			
			if(선택 == 1) {
				System.out.println(" 가입) 아이디 : ");
				String id = scanner.next();			
				System.out.println(" 가입) 비밀번호 : ");
				String pw = scanner.next();
				
				
				boolean 테클 = true;
				for(int i = 0; i < member.length; i++) {  // 중복체크			
					if( member[i][0] != null && member[i][0].equals(id)) {
						System.out.println(" 동일한 아이디가 존재합니다. ");						
						테클 = false; // 거짓(=데이터를 저장하지 않는다)
						break;
					}
				}
				if( 테클 ) {
					for(int i = 0; i < member.length; i++) { // 저장체크
						if(member[i][0] ==  null) {
							member[i][0] = id; // 멤머에 아이디 저장
							member[i][1] = pw; // 멤머에 비밀번호 저장
						
							
						}							
					}
				}
				
			} else if(선택 == 2) {
				System.out.println(" 아이디 : ");
				String id = scanner.next();
				System.out.println(" 비밀번호 : ");
				String pw = scanner.next();
				
			
				boolean 테클2 = false; // 
				for(int i = 0; i < member.length; i++) {
					if( member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println(" 로그인 성공");
						테클2 = true;
						break;
					}else {
						System.out.println(" 로그인 실패 ");
					}
				}
			} 
			
		
		} // while end
		
	} // main end
} // c e

