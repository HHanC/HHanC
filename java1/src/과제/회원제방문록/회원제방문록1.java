package 과제.회원제방문록;

import java.util.Scanner;

import javax.swing.border.Border;

import Day06.Board;

public class 회원제방문록1 {

	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		
		
		while(true) {
			
			System.out.println("1. 회원가입 2. 로그인 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {										
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("중복된 id입니다.");
						idcheck = false;
						break;
					}
				}
				if( idcheck ) {
					for(int i=0; i<memberlist.length; i++) {
						if( memberlist[i][0] == null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							memberlist[i][2] = name;
							System.out.println("회원가입 성공");								
							break;						
						}
					}
				}
								
				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][0].equals(pw)) {
						System.out.println("로그인 성공");
						logincheck = true;
						break;
						
						while(true) {
							System.out.println("------------------------");
							System.out.println("--------- 방문록 ---------");
							System.out.println("번호\t작성자\t제목\t내용");
								// 모든 방문록 출력 
								for( int j = 0 ; j<boardlist.length ; j++  ) {
									if( boardlist[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
										System.out.printf("%d\t%s\t%s\t%s \n" , 
												j , 
												boardlist[j][2] , // id
												boardlist[j][0] ,  // 제목
												boardlist[j][1] ); // 내용
									}
								}
								
							System.out.print("1. 방문록남기기 2. 로그아웃 선택 : "); int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								
								System.out.println("제목 : "); String 제목 = scanner.next();
								System.out.println("내용 : "); String 내용 = scanner.next();
								
								for(int j=0; j<boardlist.length; j++) {
									
									if(boardlist[i][0] == null) {
										boardlist[i][0] = 제목;
										boardlist[i][1] = 내용;
										boardlist[i][2] = id;
										System.out.println("방문록 쓰기가 완료되었습니다.");
										break;
									}									
								}								
							}else if(ch2 == 2) {
								System.out.println("로그아웃 되었습니다.");
								break;
							}else {
								System.out.println("알 수 없는 행동입니다.");
							}							
						}						
					}
				}
				if(logincheck == false) System.out.println("로그인 실패");
			}else {
				System.out.println("알 수 없는 행동입니다.");
			}			
		}		
	}
}
