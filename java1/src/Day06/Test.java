package Day06;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println("---------Ŀ�´�Ƽ----------");
			System.out.println("��ȣ\t�ۼ���\t����");
			int index = 0;
			for (Board board : boardlist) {
				if( board != null ) {
					System.out.printf("%d\t%s\t \n", index, board.writer, board.title);
				}
				index++;
			}
			System.out.println("1. �۾��� 2. �ۺ���");
			int ch = scanner.nextInt();		
			if(ch==1) {
				////////////////////////�۾���///////////////////////
				System.out.println("---------�۾���--------");
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
				 System.out.println(" �� �� ���� �ൿ�Դϴ�. ");
			}
		}
		
		
	}
	
} //  class end 
