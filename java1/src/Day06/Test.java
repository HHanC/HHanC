package Day06;

import java.util.Scanner;

public class Test {
	
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
			// 0. �Խù� ���� => Ŭ���� ���� 
				// �ʵ� : ���� , ���� , �ۼ��� , ��й�ȣ
				// ������ : ������� ����
			// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
			// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
				// 1. �۾��� [ ���� , ���� , �ۼ��� , ��й�ȣ => 4������ -> ��üȭ ]
				// 2. �ۺ��� [ �ش� �� ��ȣ�� �Է¹޾� �ش� �� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
					// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
					// �ۺ��� �޴� 
			// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
				// 1. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // �Է� ��ü
		Board[] boardlist = new Board[100]; // ��ü �迭 ���� [100]
		
		while(true) {
		System.out.println("----------�Խù�------------");
		System.out.println("��ȣ\t�ۼ���\t����");
		int index = 0;
		for( Board board : boardlist ) {
			if( board != null ) {
				System.out.printf("%d\t%s\t%s \n" , index, board.writer, board.title);
			}
			index++;
		}
		System.out.println(" 1.�۾��� 2.�ۺ��� ");
		System.out.println(" ���� : "); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.print("���� :  "); String title = scanner.next();
			System.out.print("���� :  "); String content = scanner.next();
			System.out.print("�ۼ��� :  "); String writer = scanner.next();
			System.out.print("��й�ȣ :  "); String password = scanner.next();
			
			Board board = new Board(title, content, writer, password); 
			
			int i = 0; // �ε��� ��ȣ
			for( Board temp : boardlist ) { // for(int temp =0; i < boardlist.length; i++ �����Ҷ� ������ for��
			
				if(temp == null) {
					boardlist[i] = board;
					break;
				}
				i++;
			}
			
		}
		else if(ch == 2) {
			System.out.println("�Խù� ��ȣ : "); int bno = scanner.nextInt();
			System.out.println("----------------��������----------------");
			System.out.printf("�ۼ��� : %s ���� : %s \n ",
					boardlist[bno].writer, boardlist[bno].title);
			System.out.printf("���� : %s \n ", boardlist[bno].content); 
			System.out.println("----------------------------------------");
			System.out.println("1. ��Ϻ��� 2. �ۻ��� 3. �ۼ���"); 
			
			int ch2 = scanner.nextInt();
			if(ch2==1) {}
			else if(ch2==2) {
				System.out.printf(" ��й�ȣ�� �Է��� �ּ��� :  "); String password = scanner.next();
				if(boardlist[bno].password.equals(password)) {
					System.out.println(" ���� �Ϸ� ");
					boardlist[bno] = null;
					for( int i = bno ; i < boardlist.length ; i++ ) { // �迭���� = 100  �ε��� : 0~99
						// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
						if( i == boardlist.length-1 ) {
							boardlist[ boardlist.length-1 ] = null; // 99 == 99 ->  
						}
						// i�� �������ε��� �� ������ �������ε������� null ����
						else boardlist[i] = boardlist[i+1];// ������ �Խù� ���� �Խù�
//					           [50] = null         [51] = 6
//							   [50] = 6 			[51] = null
								
						
						// ������ �ε����� �ƴϸ� �ε��� ���� 
							// *  	���࿡ 2�� �ε��� ������ 
							// 		2�ε��� = 3�ε��� 
							//	  	3�ε��� = 4�ε��� 
							//		4�ε��� = 5�ε��� 
							//      ~~~~~~~~~~~
							//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
							//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
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
