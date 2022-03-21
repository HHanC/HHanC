package Day05;

import java.util.Scanner;
import java.util.stream.DoubleStream.DoubleMapMultiConsumer;

public class Day05_4_도서대여_2인과제 { // c s
	
	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ] v
		2. 도서 [ 도서명(중복x)  , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ] v
	2. 초기메뉴
		1.회원가입  2.로그인  v
			1.회원가입시 아이디 중복체크 v
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

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[10][2];
		String[][] book = new String[10][3];
		
		while(true) {
			
			System.out.print("1. 회원가입 2. 로그인 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.println("id : "); String id = scanner.next();				
				System.out.println("pw : "); String pw = scanner.next();
				
				for(int i=0; i<member.length; i++) {
					
					boolean idcheck = true;
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("동일한 id가 존재합니다.");
						idcheck = false;
						break;
					}
					if(idcheck) {
						if(member[i][0] == null){
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("회원가입 성공");
							break;
						}						
					}					
				}				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();				
				
				for(int i=0; i<member.length; i++) {
					
					
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1] != null && member[i][1].equals(pw)) {
						System.out.println("로그인 성공");											
					}else {
						System.out.println("로그인 실패");							
					}	
					
					while(true) {
						
						System.out.print("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃 선택 : "); int ch2 = scanner.nextInt();
						
						if(ch2 == 1) { // 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력 // 도서 [ 도서명(중복x)  , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
							System.out.println("----------------도서검색--------------");
							System.out.println("도서명 : "); String 도서명 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null && book[j][0].equals(도서명)) {
									System.out.println(book[j][0] + book[j][1]);
									break;
								}else {
									System.out.println("입력하신 도서명이 존재하지 않습니다.");
									break;
								}
							}							
						}else if(ch2 == 2) { // 도서목록시 모든 도서명 출력
							System.out.println("-----------------도서목록----------------");
							System.out.print("번호\t도서명\n");
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null) {
									System.out.println(j+"\t"+ book[j][0]);
								}
							}
						}else if(ch2 == 3) { // 도서대여시 도서대여여부가 가능할때 도서대여 처리
							
							System.out.println("--------------도서대여--------------");
							System.out.println("대여할 도서명 : "); String 도서대여 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][1] != null && book[j][1].equals(도서대여)) {
									System.out.println("도서를 대여하시겠습니까?");
									System.out.println(" 1. 대여 2. 취소 "); int ch3 = scanner.nextInt();
									
									if(ch3 == 1) {
										System.out.println("도서를 대여하였습니다.");
									}else if(ch3 == 2) {
										System.out.println("도서 대여를 취소하였습니다.");
									}else {
										System.out.println("알 수 없는 행동입니다.");
									}									
								}else {
									System.out.println("입력하신 도서가 존재하지 않습니다.");
									break;
								}
							}														
						}else if(ch2 == 4) { // 도서반납시 본인이 대여한 도서만 반납 처리 
							
							System.out.println("반납할 도서명 : "); String 반납 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								
								if(book[i][0] )
								
							}
							
							
						}else if(ch2 == 5) {
							
						}else {
							System.out.println("알 수 없는 행동입니다.");
						}
						
						
					}
					
				}				
			}else {
				System.out.println("알 수 없는 행동입니다.");
			}													
		}						
	} // main end
} // c e























