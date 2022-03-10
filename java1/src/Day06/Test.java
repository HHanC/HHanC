package Day06;

import java.util.Scanner;

public class Test {
	
	// 비회원제 게시판 [ 클래스 버전 ]
			// 0. 게시물 설계 => 클래스 선언 
				// 필드 : 제목 , 내용 , 작성자 , 비밀번호
				// 생성자 : 사용유무 선택
			// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
			// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
				// 1. 글쓰기 [ 제목 , 내용 , 작성자 , 비밀번호 => 4개변수 -> 객체화 ]
				// 2. 글보기 [ 해당 글 번호를 입력받아 해당 글 상세페이지(번호,작성자,제목,내용) 표시 ]
					// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
					// 글보기 메뉴 
			// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
				// 1. 삭제시 :  비밀번호 입력받아 동일하면 삭제
				// 2. 수정시 :  비밀번호 입력받아 동일하면 제목과 내용만 수정 
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // 입력 객체
		Board[] boardlist = new Board[100]; // 객체 배열 선언 [100]
		
		while(true) {
		System.out.println("----------게시물------------");
		System.out.println("번호\t작성자\t제목");
		int index = 0;
		for( Board board : boardlist ) {
			if( board != null ) {
				System.out.printf("%d\t%s\t%s \n" , index, board.writer, board.title);
			}
			index++;
		}
		System.out.println(" 1.글쓰기 2.글보기 ");
		System.out.println(" 선택 : "); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.print("제목 :  "); String title = scanner.next();
			System.out.print("내용 :  "); String content = scanner.next();
			System.out.print("작성자 :  "); String writer = scanner.next();
			System.out.print("비밀번호 :  "); String password = scanner.next();
			
			Board board = new Board(title, content, writer, password); 
			
			int i = 0; // 인덱스 번호
			for( Board temp : boardlist ) { // for(int temp =0; i < boardlist.length; i++ 이해할때 봐야할 for문
			
				if(temp == null) {
					boardlist[i] = board;
					break;
				}
				i++;
			}
			
		}
		else if(ch == 2) {
			System.out.println("게시물 번호 : "); int bno = scanner.nextInt();
			System.out.println("----------------상세페이지----------------");
			System.out.printf("작성자 : %s 제목 : %s \n ",
					boardlist[bno].writer, boardlist[bno].title);
			System.out.printf("내용 : %s \n ", boardlist[bno].content); 
			System.out.println("----------------------------------------");
			System.out.println("1. 목록보기 2. 글삭제 3. 글수정"); 
			
			int ch2 = scanner.nextInt();
			if(ch2==1) {}
			else if(ch2==2) {
				System.out.printf(" 비밀번호를 입력해 주세요 :  "); String password = scanner.next();
				if(boardlist[bno].password.equals(password)) {
					System.out.println(" 삭제 완료 ");
					boardlist[bno] = null;
					for( int i = bno ; i < boardlist.length ; i++ ) { // 배열길이 = 100  인덱스 : 0~99
						// * 검색된 게시물의 인덱스부터 마지막인덱스까지 1씩증가 
						if( i == boardlist.length-1 ) {
							boardlist[ boardlist.length-1 ] = null; // 99 == 99 ->  
						}
						// i가 마지막인덱스 와 같으면 마지막인덱스에는 null 대입
						else boardlist[i] = boardlist[i+1];// 삭제된 게시물 다음 게시물
//					           [50] = null         [51] = 6
//							   [50] = 6 			[51] = null
								
						
						// 마지막 인덱스가 아니면 인덱스 당기기 
							// *  	만약에 2번 인덱스 삭제시 
							// 		2인덱스 = 3인덱스 
							//	  	3인덱스 = 4인덱스 
							//		4인덱스 = 5인덱스 
							//      ~~~~~~~~~~~
							//		98인덱스 = 99인덱스 [ 0번~99번 -> 100개 인덱스 ]
							//		99인덱스 = null [ 99번 인덱스 : 마지막인덱스 ] 
					}
				}else {
					System.out.println();
				}
			}
			else {}
		}
		else {}
		
		}
		
		
	} // m e
		
	
} //  class end 
