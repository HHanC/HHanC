package 과제.도서대여2인과제;

import java.util.Scanner;

public class Day05_4_도서대여_2인과제 { // c s

	/*
	사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
	* 도서 대여 console 프로그램
	1. 배열 변수
		1. 회원 [ 아이디(중복x) , 비밀번호 ]
		2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
	2. 초기메뉴
		1.회원가입 2.로그인 
			1.회원가입시 아이디 중복체크 
			2.로그인 성공시 로그인메뉴 , 로그인 실패시 로그인실패 출력 
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

	// 1. 초기메뉴 (회원가입, 로그인) v
	// 2. 회원가입시 아이디 중복체크 배열 v
	// 3. 로그인시 아이디 비밀번호 입력 받고 배열에 저장 v
	// 4. 일단 관리자 메뉴까지 v
	// 5. 도서등록시 도서명을 입력받아 도서 등록처리 v
	// 6. 도서목록시 모든 도서명 출력 v..?
	// 7. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ] v
	// 8. 로그인시 회원의 메뉴 출력 v
	// 9. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력, 일단 여기까지 v
	// 10. 도서목록시 모든 도서명 출력  ?
	// 11. 도서대여시 도서대여여부가 가능할때 도서대여 처리 ?
	// 12. 도서반납시 본인이 대여한 도서만 반납 처리
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		String[][] member = new String[100][2]; // member 2차원 배열 생성
		String[][] book = new String[100][3]; // book 3차원 배열 생성

		while (true) { // w s // 반복문 실행

			System.out.println("1. 회원가입 2. 로그인"); // 1번을 입력하면 회원가입, 2번을 입력하면 로그인
			System.out.print("선택 : "); // 1번과 2번중 선택
			int ch = scanner.nextInt(); // 스캐너 객체를 생성하여 입력값이 저장되도록 함

			if (ch == 1) { // 1번 선택
				System.out.print("id : "); // id 입력
				String id = scanner.next(); // id 객체 생성
				System.out.print("pw : "); // pw 입력
				String pw = scanner.next(); // pw 객체 생성

				for (int i = 0; i < member.length; i++) { // f s // 배열을 돌려서 id 중복체크

					boolean idcheck = true; // boolean 자료형 선언
					if (member[i][0] != null && member[i][0].equals(id)) { // 배열의 값아 입력받은 값이 같다면
						System.out.println("이미 사용중인 id입니다."); // 이미 사용중입니다 출력
						idcheck = false; // false값을 주고
						break; // break를 통해서 아래로 내려갔다가 다시 올라와서 재입력
					}
					if (member[i][0] == null) { // member배열 i의 값이 null이라면 
						if (idcheck) { // idcheck의 초기값, 즉 true
							member[i][0] = id; // 입력값의 id를 i번째 인덱스에 저장
							member[i][1] = pw; // 입력값을 pw를 i번째 인덱스에 저장
							System.out.println("회원가입 성공"); // true이므로 회원가입 성공 출력
							break; // break를 통해서 아래로 내려갔다가 다시 올라와서 로그인 페이지로 돌아감
						}
					}

				} // f e
			} else if (ch == 2) {

				System.out.print("id : "); // id입력
				String id = scanner.next(); // id객체를 생성하여 입력값을 저장함
				System.out.print("pw : "); // pw입력
				String pw = scanner.next(); // pw객체를 생성하여 입력값을 저장함

				boolean logincheck = false; // logincheck변수의 초기값은 false

				for (int i = 0; i < book.length; i++) { // book배열을 돌려서 
					if (logincheck = true) { // logincheck가 true이면
						break; // break를 통해서 일반 회원 페이지로 이동
					}
				}

				if (id.equals("admin")) { // i s // 입력값을 준 id가 admin과 같다면
					logincheck = true; // true값을 주고 관리자 페이지로 이동

					while (true) { // w s // 반복문 실행
						System.out.print("1. 도서등록 2. 도서목록 3. 도서삭제 4. 로그아웃 선택 : "); // 1~4번 선택
						int ch2 = scanner.nextInt(); // 스캐너 객체 생성

						if (ch2 == 1) { // 1번 도서등록
							System.out.println("----------------------도서등록----------------------");
							System.out.println("도서명 : "); // 도서명 입력
							String 도서명 = scanner.next(); // 스캐너 객체 생성
							for (int j = 0; j < book.length; j++) { // 배열을 돌려서
								if (book[j][0] == null) { // book j의 값이 null이면 
									book[j][0] = 도서명; // book j의 값에 입력받은 도서명을 저장
									break; // break를 통해서 for문 탈출
								}
							}
						} else if (ch2 == 2) { // 2번 도서목록
							System.out.println("----------------------도서목록----------------------");
							for (int j = 0; j < book.length; j++) { // 배열을 돌려서
								if (book[j][0] != null) { // book의 j번째 인덱스가 null이 아니라면
									System.out.println(book[j][0]); // j번째 인덱스안에 저장된 데이터 출력
								}
							}
						} else if (ch2 == 3) { // 3번 도서삭제
							System.out.println("----------------------도서삭제----------------------");
							System.out.println("삭제할 도서명 : "); // 삭제할 도서명 출력
							String 도서삭제 = scanner.next(); // 객체 생성

							for (int j = 0; j < book.length; j++) { // 배열을 돌려서 
								if (book[j][0] != null && book[j][0].equals(도서삭제)) { // book의 j번째 인덱스가 null이 아니고 book의 j번째 인덱스가 도서삭제의 값이 같다면
									book[j][0] = null; // j번째 인덱스를 null로 변경
									break; // break를 통해서 반복문 탈출
								}
							}
						}
						
						else if (ch2 == 4) { // 4번 로그아웃
							System.out.println("로그아웃 되었습니다."); // 로그아웃 출력
							break; // break를 통생서 else if탈출
						} else { // 1~4번 외에 다른 번호 선택했을시
							System.out.println("알 수 없는 번호입니다. [재입력]"); // 알 수 없는 번호입니다. 출력
						}
					} // w e
				} // if e
				
				
				
				if (!id.equals("admin")) { // i s // 입력값을 준 id가 admin과 같다면
					logincheck = true;
					for (int i = 0; i < member.length; i++) { // f s // 배열을 돌려서
						if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) { // member의 i번째 인덱스 값이 null이 아니고 id와 pw가 동일하다면
							System.out.println("로그인 성공"); // 로그인 성공

							while(true) { // w s // 반복문 생성
								
								System.out.print("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃 선택 : "); int ch3 = scanner.nextInt(); // 스캐너 객체 생성
								
								if(ch3 == 1) {
									System.out.println("----------------------도서검색----------------------");
									System.out.println("도서명 : "); String 도서검색 = scanner.next();
									System.out.println("번호\t도서명\t도서대여여부\t대여인");
									for(int j=0; j<book.length; j++) {								
										if(book[j][0] != null && book[j][0].equals(도서검색)) {												
											book[j][2] = id;
											System.out.println(j +"\t"+book[j][0] +"\t"+ book[j][1] +"\t\t"+ book[j][2]);
										}									
									}								
								}else if(ch3 == 2) {							
									System.out.println("----------------------도서목록----------------------");
									System.out.println("번호\t도서명\t도서대여여부\t대여인");
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null) {
											book[j][2] = id;
											System.out.println(j +"\t"+book[j][0] +"\t"+ book[j][1] +"\t\t"+ book[j][2]);
										}
									}																
								}else if(ch3 == 3) {
									System.out.println("----------------------도서대여----------------------");
									System.out.println("대여할 도서명 : "); String 도서대여 = scanner.next();
									System.out.println("번호\t도서명\t도서대여여부\t대여인");
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null && book[j][0].equals(도서대여)) {
											if(book[j][1] == null) {
												System.out.println("도서를 대여하시겠습니까? yes , no"); String 선택 = scanner.next();
												if(선택.equals("yes")) {
													book[j][1] = "대여중";
													book[j][2] = id;
												}else {
													if(선택.equals("no")) {
														System.out.println("대여 취소");
													}
												}
											}
										}																																																						
									}
										
								}else if(ch3 == 4) { // 도서반납시 본인이 대여한 도서만 반납 처리 
									System.out.println("----------------------도서반납----------------------");
									System.out.println("반납할 도서명 : "); String 반납도서 = scanner.next();
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null && book[j][0].equals(반납도서)) {
											book[j][1] = null;
											book[j][2] = null;
											System.out.println("도서를 반납하였습니다.");
											break;
										}else if(book[j][1] == null){
											System.out.println("대여하지 않았습니다.");
											break;
										}
										
									}
									
								}else if(ch3 == 5) {
									System.out.println("로그아웃 되었습니다.");
									break;
								}else {
									System.out.println("알 수 없는 번호입니다. [재입력]");
								}
								
							} // w e
				}
				
				
						
						
					} if(!logincheck) {
						System.out.println("로그인 실패");
						break;
					}
				} // f e

			} else {
				System.out.println("알 수 없는 번호입니다. [재입력]");
			}
			
		} // w e
		
	} // m e

} // c e
