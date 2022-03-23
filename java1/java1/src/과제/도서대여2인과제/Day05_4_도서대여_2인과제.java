package 과제.도서대여2인과제;

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

	public static void main(String[] args) { // main메소드를 사용하여 아래 출력 코드를 입력한다.
		
		Scanner scanner = new Scanner(System.in); // 스캐너 객체를 생성하여 변수 선언할때 호출할 수 있도록 해준다.
		String[][] member = new String[10][2]; // 아이디와 비밀번호를 담는 배열을 생성해준다.
		String[][] book = new String[10][3]; // 도서명과 도서대여여부와 대여인을 담을 배열을 생성해준다.
		
		while(true) { // 반복문을 사용하여 아래 코드를 반복적으로 사용할 수 있도록 해준다.
			
			System.out.println("-------------초기매뉴------------");
			System.out.print("1. 회원가입 2. 로그인 선택 : "); int ch = scanner.nextInt(); // 입출력값을 만들고 스캐너 객체를 호출하여 번호를 선택할 수 있도록 해준다.
			
			if(ch == 1) { // 조건문을 1번을 입력하면 회원가입 페이지로 넘어갈 수 있게 해준다.
								
				System.out.println("id : "); String id = scanner.next(); // 스캐너 객체를 호출하여 id의 값을 저장해준다.			
				System.out.println("pw : "); String pw = scanner.next(); // 스캐너 객체를 호출하여 pw의 값을 저장해준다.
				
				for(int i=0; i<member.length; i++) { // for문을 사용하여 0~9까지 조건에 만족하면 반복해준다.
					
					boolean idcheck = true; // boolean을 사용하여 조건이 참이라면 true 거짓이면 false의 값을 준다. 
					if(member[i][0] != null && member[i][0].equals(id)) { // member배열의 i번째 인덱스가 null이 아니고 id가 동일하다면 false값을 줘서 동일한 id가 존재합니다. 를 출력한다.
						System.out.println("동일한 id가 존재합니다.");
						idcheck = false;
						break; // break를 통해 false이면 반복문을 빠져나간다.
					}
					if(idcheck) { // true일 경우 member배열에 id와 pw를 저장해준다.
						if(member[i][0] == null){
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("회원가입 성공");
							break; // 조건이 true일 경우 브레이크를 통해 반복문을 빠져나간다.
						}						
					}					
				}				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next(); 
				System.out.println("pw : "); String pw = scanner.next();				
				
				for(int i=0; i<member.length; i++) {	
					
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1] != null && member[i][1].equals(pw)) { // 반복문을 사용하여 member배열에 i의 값이 null이 아니고 id와 pw가 같다면 if문을 빠져나간다.
						System.out.println("로그인 성공");											
					}else { // 그렇지 않다면, id 또는 pw가 틀렸다면 로그인실패를 출력한다.
						System.out.println("로그인 실패");							
					}	
					
					while(true) { // 반복문을 사용하여 아래 코드를 반복해 준다.
						
						System.out.print("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃 선택 : "); int ch2 = scanner.nextInt();
						
						if(ch2 == 1) { // 1번을 선택하면 도서검색창을 띄어준다.
							System.out.println("----------------도서검색--------------");
							System.out.println("도서명 : "); String 도서명 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null && book[j][0].equals(도서명)) { // j번째 인덱스에 null이 아니고 도서명과 이름이 같다면 
									System.out.println(book[j][0] + book[j][1]); // 도서명과 도서대여여부를 출력한다.
									break; // break를 사용하여 반복문을 빠져나간다.
								}else { // 그렇지 않다면 
									System.out.println("입력하신 도서명이 존재하지 않습니다.");
									break; // break를 사용하여 반복문을 빠져나간다.
								}
							}							
						}else if(ch2 == 2) { // 2번을 입력하면 도서목록창을 띄어준다.
							System.out.println("-----------------도서목록----------------");
							System.out.print("번호\t도서명\n");
							for(int j=0; j<book.length; j++) { // 반복문을 사용한다.
								if(book[j][0] != null) { // j번째 인덱스가 null이 아니라면 
									System.out.println(j+"\t"+ book[j][0]); // j의 번호와 j번째 인덱스 안에 저장되어있는 도서명을 출력한다.
								}
							}
						}else if(ch2 == 3) { // 3번을 입력하면 도서대여창을 띄어준다.
							
							System.out.println("--------------도서대여--------------");
							System.out.println("대여할 도서명 : "); String 도서대여 = scanner.next();
							
							for(int j=0; j<book.length; j++) { // 반복문을 사용한다.
								if(book[j][1] != null && book[j][1].equals(도서대여)) { // 도서대여가 null이 아니고 도서대여명과 같다면 if문을 실행시킨다.
									System.out.println("도서를 대여하시겠습니까?");
									System.out.println(" 1. 대여 2. 취소 "); int ch3 = scanner.nextInt();
									
									if(ch3 == 1) { // 1번을 입력하면 대여
										System.out.println("도서를 대여하였습니다.");
									}else if(ch3 == 2) { // 2번을 입력하면 취소
										System.out.println("도서 대여를 취소하였습니다.");
									}else { // 그 외 다른 번호를 입력하면 알 수 없는 행동입니다를 출력한다.
										System.out.println("알 수 없는 행동입니다.");
									}									
								}
							}														
						}else if(ch2 == 4) { // 4번을 입력시 반납창을 띄어준다.
							
							System.out.println("반납할 도서명 : "); String 반납 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								
								
								
							}
							
							
						}else if(ch2 == 5) {
							
						}else { // 1~5번 외에 다른 번호를 입력하면 알 수 업는 행동입니다.를 출력한다.
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























