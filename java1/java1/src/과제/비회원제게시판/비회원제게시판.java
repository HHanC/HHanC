package 과제.비회원제게시판;

import java.util.Scanner;

public class 비회원제게시판 {

	// 비회원제 게시판 [ 클래스 버전 ]
			// 0. 게시물 설계 => 클래스 선언 v
				// 필드 : 제목 , 내용 , 작성자 , 비밀번호 v
				// 생성자 : 사용유무 선택 v
			// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
			// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
				// 1. 글쓰기 [ 제목 , 내용 , 작성자 , 비밀번호 => 4개변수 -> 객체화 ]
				// 2. 글보기 [ 해당 글번호를 입력받아 해당 글 상세페이지(번호,작성자,제목,내용) 표시 ]
					// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
					// 글보기 메뉴 
			// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
				// 1. 삭제시 :  비밀번호 입력받아 동일하면 삭제
				// 2. 수정시 :  비밀번호 입력받아 동일하면 제목과 내용만 수정 
	
	
	public static void main(String[] args) { // main 메소드 안에 입력해야 실행이 된다.
		Scanner scanner = new Scanner(System.in); // scanner객체를 생성하여 입력값을 받는다.
		Board[] boardlist = new Board[100]; // Board클래스의 배열을 생성한다.
		
		while(true) { // 반복문을 사용해서 반복할 수 있게 해준다.
			
			System.out.println("번호\t작성자\t제목");
			
			int index = 0; // index의 값을 초기값을 0으로 맞춰준다.
			for(Board board : boardlist) { // boardlist배열을 임시저장 공간인 board에 담는다.
				if(board != null) { // 임시저장 공간이 null이 아니면
					System.out.printf("%d\t%s\t%s \n", index, board.writer, board.title); // 인덱스 번호와 board의 접근 연산자를 사용하여 필드에 저장해준다.			
				}
				index++; // 다음 글의 번호를 올려주기 위해서 증가 연산자를 사용해준다.
			}
			
			System.out.print("1. 글쓰기 2. 글보기 선택 : "); int ch = scanner.nextInt(); // scanner객체를 사용하여 ch변수에 입력값을 받을 수 있도록 해준다.
			
			if(ch == 1) {
				
				System.out.println("--------글쓰기 페이지-------");
				System.out.print("제목 : "); String title = scanner.next(); // scanner객체를 사용하여 title변수에 입력값을 받을 수 있도록 해준다.
				System.out.print("내용 : "); String content = scanner.next(); // scanner객체를 사용하여 content변수에 입력값을 받을 수 있도록 해준다.
				System.out.print("작성자 : "); String writer = scanner.next(); // scanner객체를 사용하여 writer변수에 입력값을 받을 수 있도록 해준다.
				System.out.print("비밀번호 : "); String password = scanner.next(); // scanner객체를 사용하여 password변수에 입력값을 받을 수 있도록 해준다.
				
				Board board = new Board(title, content, writer, password); // 생성자를 통하여 입력값을 저장해 주도록 한다.
				
				int i = 0; // i의 변수에 초기값을 0으로 저장해준다.
				for(Board temp : boardlist) { // boardlist배열을 임시저장공간 temp에 담는다.
					if(temp == null) { // 임시저장공간 temp가 null과 같다면
						boardlist[i] = board; // boardlist배열 i번째 인덱스에 boared의 생성자에 입력된 값을 저장한다.
						break; // break를 사용하여 반복문을 탈출
					}
					i++; // 다음 인덱스 번호에 입력값을 받기위해 증가 연산자를 사용해준다.
				}				
			}else if(ch == 2) {
				System.out.print("게시물 번호 : "); int bno = scanner.nextInt(); // scanner객체를 사용하여 bno변수에 입력값을 받을 수 있도록 해준다.
				
				System.out.printf("작성자 : %s 제목 : %s \n", boardlist[bno].writer, boardlist[bno].title); // boardlist배열에 bno번호의 게시물 번호에 해당하는 작성자와 제목을 호출하여 보여주도록한다.
				System.out.printf("내용 : %s \n" , boardlist[bno].content); // boardlist배열에 bno번호의 게시물 번호에 해당하는 내용을 호출하여 보여주도록한다.
				
				System.out.println("-------------------------------------");
				
				System.out.print("1. 목록보기 2. 삭제 3. 수정 선택 : "); int ch2 = scanner.nextInt(); // scanner객체를 사용하여 ch2변수에 입력값을 받을 수 있도록 해준다
				if(ch2 == 1) {	// 1번을 선택하면 코드 흐름을 따라 다시 위로 올라가서 게시판 초기화면을 보여준다.														
				}else if(ch2 == 2) {
					
					System.out.println("비밀번호 입력 : "); String password = scanner.next(); // scanner객체를 사용하여 password변수에 입력값을 받을 수 있도록 해준다.
					
					if(boardlist[bno].password.equals(password)) { // boardlist배열의 bno에 해당하는 password와 사용자가 입력한 password가 같다면 
						System.out.println("게시물이 삭제되었습니다."); // 게시물이 삭제되었습니다 를 출력하고
						boardlist[bno] = null; // 해당 게시물번호를 null로 변경해 준다.
						
						for(int i = bno; i<boardlist.length; i++) {
							if(i == boardlist.length -1) { // i의 인덱스 번호가 boardlist 의 길이-1과 같다면 ( 예) 0(인덱스번호) 1(배열의 길이)-1 = 0)
								boardlist[boardlist.length-1] = null; // boardlist의 길이-1 을 null로 변경해준다.
							}else {
								boardlist[i] = boardlist[i+1]; // 위 조건이 아니라면 i+1을 i에 대입해준다 (인덱스 당기기)
							}
						}						
					}else { // 만약 비밀번호가 틀렸다면 비밀번호를 다시 확인해주세요를 출력
						System.out.println("비밀번호를 다시 확인해 주세요.");
					}										
				}else if(ch2 == 3) {
					
					System.out.println("비밀번호를 입력 : "); String password = scanner.next(); // scanner객체를 사용하여 password변수에 입력값을 받을 수 있도록 해준다.
					if(boardlist[bno].password.equals(password)) { // boardlist배열의 bno에 해당하는 password와 사용자가 입력한 password가 같다면
						System.out.println("수정할 제목 : "); boardlist[bno].title = scanner.next(); // boardlist배열의 bno의 번호의 접근연산자를 통해 필드에 있는 title의 값을 변경
						System.out.println("수정할 내용 : "); boardlist[bno].content = scanner.next(); // boardlist배열의 bno의 번호의 접근연산자를 통해 필드에 있는 content의 값을 변경
						System.out.println("제목이 수정되었습니다.");
					}
					
					
				}else { // 해당 번호 외에 다른 번호를 입력하면 알 수 없는 번호입니다. 출력
					System.out.println("알 수 없는 번호입니다.");
				}
				
			}else { // 해당 번호 외에 다른 번호를 입력하면 알 수 없는 번호입니다. 출력
				System.out.println("알 수 없는 번호입니다.");
			}										
			
		}
		
	}
	
}









