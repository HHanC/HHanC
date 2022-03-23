package 과제.회원제방문록;

import java.util.Scanner;

public class 회원제방문록1 {

	// 회원제 방문록 프로그램 [ 2차원배열 ] 
			// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
				// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
				// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
			// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
				// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
				// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 객체를 생성
		String[][] memberlist = new String[100][3]; // id pw name 를 담을 맴버 변수 선언
		String[][] boardlist = new String[100][3]; // 제목 내용 id를 담을 맴버 변수 선언
		
		while(true) { // 반복문을 사용하여 회원가입과 로그인 선택을 반복적으로 할 수 있도록 해준다.
			
			System.out.print("1. 회원가입 2. 로그인 선택 : "); int ch = scanner.nextInt(); // ch의 입력 객체를 선언
			
			if(ch == 1) { // 1. 회원가입일 경우
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true; // 참과 거짓을 나타네는 boolean을 선언
				for(int i=0; i<memberlist.length; i++) { // for반복문
					if(memberlist[i][0] != null && memberlist.equals(id)) { // 멤버리스트 i의 값이 null이 아니고 id가 같다면 false
						System.out.println("중복된 id 입니다.");
						idcheck = false;
						break; // 중복일 경우 브레이크를 사용하여 아래로 내려간다.
					}					
				}	
				if(idcheck) { // 조건이 참일경우
					for(int i=0; i<memberlist.length; i++) { // 반복문
						if(memberlist[i][0] == null) { // i의 값이 null이라면
							memberlist[i][0] = id; // id를 멤버변수에 넣는다.
							memberlist[i][1] = pw; // pw를 멤버변에 넣는다.
							memberlist[i][2] = name; // name을 멤버변수에 넣는다.
							System.out.println("회원가입 성공"); 
							break; // 브레이크를 사용하여 회원가입에 성공했을경우 아래로 내려간다.
						}
					}
				}
			}else if(ch == 2) { // 로그인
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i=0; i<memberlist.length; i++) { // 반복문 활용			
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) { // 멤버변수 i의 값이 null이 아니고 id와 pw가 같다면 로그인 성공
						System.out.println("로그인 성공");
						logincheck = true; // boolean에 true를 대입 // 마지막에 break를 사용하지 않는 이유는 break를 사용하면 가장 가까운 반복문으로 탈출하기 때문
						
						while(true) {
							
							System.out.println("번호\t작성자\t제목\t내용");
							
							for(int j=0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null) { // boardlist가 null이 아니라면 printf에 형식문자를 활용하여 boardlist멤버변수를 대입
									System.out.printf("%d\t%s\t%s\t%s\n", 
											j, 
											boardlist[j][2], 
											boardlist[j][0], 
											boardlist[j][1]);																				
								}
							}						
							System.out.print("1. 방문록쓰기 2. 로그아웃 선택 : "); int ch2 = scanner.nextInt();
							if(ch2 == 1) {								
								System.out.println("제목 : "); String 제목 = scanner.next();
								System.out.println("내용 : "); String 내용 = scanner.next();								
								for(int j=0; j<boardlist.length; j++) {								
									if(boardlist[j][0] == null) { // boardlist의 값이 null이라면 boardlist에 입력값을 대입
										boardlist[j][0] = 제목;
										boardlist[j][1] = 내용;
										boardlist[j][2] = id;
										System.out.println("방문록 작성 완료");
										break; // 브레이크를 사용하여 가장 가까문 반복문으로 탈출
									}									
								}																				
							}else if(ch2 == 2) {
								System.out.println("로그아웃 성공");
								break;
							}else {
								System.out.println("알 수 없는 행동입니다.");
							}																																			
						}						
					}					
				}
				if(logincheck == false) System.out.println("로그인 실패"); // boolean의 logincheck의 변수가 false이면 로그인 실패
				
			}else {
				System.out.println("알 수 없는 행동입니다.");
			}			
		}		
	}	
}
