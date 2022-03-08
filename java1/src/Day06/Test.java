package Day06;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println("---------커뮤니티----------");
			System.out.println("번호\t작성자\t제목");
			int index = 0;
			for (Board board : boardlist) {
				if( board != null ) {
					System.out.printf("%d\t%s\t \n", index, board.writer, board.title);
				}
				index++;
			}
			System.out.println("1. 글쓰기 2. 글보기");
			int ch = scanner.nextInt();		
			if(ch==1) {
				////////////////////////글쓰기///////////////////////
				System.out.println("---------글쓰기--------");
				System.out.println(" title : "); String title = scanner.next();
				System.out.println(" content : "); String content = scanner.next();
				System.out.println(" writer : "); String writer = scanner.next();
				System.out.println(" password : "); String password = scanner.next();
				
				Board board = new Board(title, content, writer, password);
				
				int i = 0;
				for(Board temp : boardlist) {
					if(temp == null) {
						boardlist[i] = board;
						break;
					}
					i++;
				}
			}
			else if(ch==2) {}
			else {
				 System.out.println(" 알 수 없는 행동입니다. ");
			}
		}
		
		
	}
	
} //  class end 
