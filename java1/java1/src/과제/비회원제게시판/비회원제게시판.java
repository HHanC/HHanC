package ����.��ȸ�����Խ���;

import java.util.Scanner;

public class ��ȸ�����Խ��� {

	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
			// 0. �Խù� ���� => Ŭ���� ���� v
				// �ʵ� : ���� , ���� , �ۼ��� , ��й�ȣ v
				// ������ : ������� ���� v
			// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
			// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
				// 1. �۾��� [ ���� , ���� , �ۼ��� , ��й�ȣ => 4������ -> ��üȭ ]
				// 2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
					// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
					// �ۺ��� �޴� 
			// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2.���� 3.���� ]
				// 1. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ :  ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
	
	
	public static void main(String[] args) { // main �޼ҵ� �ȿ� �Է��ؾ� ������ �ȴ�.
		Scanner scanner = new Scanner(System.in); // scanner��ü�� �����Ͽ� �Է°��� �޴´�.
		Board[] boardlist = new Board[100]; // BoardŬ������ �迭�� �����Ѵ�.
		
		while(true) { // �ݺ����� ����ؼ� �ݺ��� �� �ְ� ���ش�.
			
			System.out.println("��ȣ\t�ۼ���\t����");
			
			int index = 0; // index�� ���� �ʱⰪ�� 0���� �����ش�.
			for(Board board : boardlist) { // boardlist�迭�� �ӽ����� ������ board�� ��´�.
				if(board != null) { // �ӽ����� ������ null�� �ƴϸ�
					System.out.printf("%d\t%s\t%s \n", index, board.writer, board.title); // �ε��� ��ȣ�� board�� ���� �����ڸ� ����Ͽ� �ʵ忡 �������ش�.			
				}
				index++; // ���� ���� ��ȣ�� �÷��ֱ� ���ؼ� ���� �����ڸ� ������ش�.
			}
			
			System.out.print("1. �۾��� 2. �ۺ��� ���� : "); int ch = scanner.nextInt(); // scanner��ü�� ����Ͽ� ch������ �Է°��� ���� �� �ֵ��� ���ش�.
			
			if(ch == 1) {
				
				System.out.println("--------�۾��� ������-------");
				System.out.print("���� : "); String title = scanner.next(); // scanner��ü�� ����Ͽ� title������ �Է°��� ���� �� �ֵ��� ���ش�.
				System.out.print("���� : "); String content = scanner.next(); // scanner��ü�� ����Ͽ� content������ �Է°��� ���� �� �ֵ��� ���ش�.
				System.out.print("�ۼ��� : "); String writer = scanner.next(); // scanner��ü�� ����Ͽ� writer������ �Է°��� ���� �� �ֵ��� ���ش�.
				System.out.print("��й�ȣ : "); String password = scanner.next(); // scanner��ü�� ����Ͽ� password������ �Է°��� ���� �� �ֵ��� ���ش�.
				
				Board board = new Board(title, content, writer, password); // �����ڸ� ���Ͽ� �Է°��� ������ �ֵ��� �Ѵ�.
				
				int i = 0; // i�� ������ �ʱⰪ�� 0���� �������ش�.
				for(Board temp : boardlist) { // boardlist�迭�� �ӽ�������� temp�� ��´�.
					if(temp == null) { // �ӽ�������� temp�� null�� ���ٸ�
						boardlist[i] = board; // boardlist�迭 i��° �ε����� boared�� �����ڿ� �Էµ� ���� �����Ѵ�.
						break; // break�� ����Ͽ� �ݺ����� Ż��
					}
					i++; // ���� �ε��� ��ȣ�� �Է°��� �ޱ����� ���� �����ڸ� ������ش�.
				}				
			}else if(ch == 2) {
				System.out.print("�Խù� ��ȣ : "); int bno = scanner.nextInt(); // scanner��ü�� ����Ͽ� bno������ �Է°��� ���� �� �ֵ��� ���ش�.
				
				System.out.printf("�ۼ��� : %s ���� : %s \n", boardlist[bno].writer, boardlist[bno].title); // boardlist�迭�� bno��ȣ�� �Խù� ��ȣ�� �ش��ϴ� �ۼ��ڿ� ������ ȣ���Ͽ� �����ֵ����Ѵ�.
				System.out.printf("���� : %s \n" , boardlist[bno].content); // boardlist�迭�� bno��ȣ�� �Խù� ��ȣ�� �ش��ϴ� ������ ȣ���Ͽ� �����ֵ����Ѵ�.
				
				System.out.println("-------------------------------------");
				
				System.out.print("1. ��Ϻ��� 2. ���� 3. ���� ���� : "); int ch2 = scanner.nextInt(); // scanner��ü�� ����Ͽ� ch2������ �Է°��� ���� �� �ֵ��� ���ش�
				if(ch2 == 1) {	// 1���� �����ϸ� �ڵ� �帧�� ���� �ٽ� ���� �ö󰡼� �Խ��� �ʱ�ȭ���� �����ش�.														
				}else if(ch2 == 2) {
					
					System.out.println("��й�ȣ �Է� : "); String password = scanner.next(); // scanner��ü�� ����Ͽ� password������ �Է°��� ���� �� �ֵ��� ���ش�.
					
					if(boardlist[bno].password.equals(password)) { // boardlist�迭�� bno�� �ش��ϴ� password�� ����ڰ� �Է��� password�� ���ٸ� 
						System.out.println("�Խù��� �����Ǿ����ϴ�."); // �Խù��� �����Ǿ����ϴ� �� ����ϰ�
						boardlist[bno] = null; // �ش� �Խù���ȣ�� null�� ������ �ش�.
						
						for(int i = bno; i<boardlist.length; i++) {
							if(i == boardlist.length -1) { // i�� �ε��� ��ȣ�� boardlist �� ����-1�� ���ٸ� ( ��) 0(�ε�����ȣ) 1(�迭�� ����)-1 = 0)
								boardlist[boardlist.length-1] = null; // boardlist�� ����-1 �� null�� �������ش�.
							}else {
								boardlist[i] = boardlist[i+1]; // �� ������ �ƴ϶�� i+1�� i�� �������ش� (�ε��� ����)
							}
						}						
					}else { // ���� ��й�ȣ�� Ʋ�ȴٸ� ��й�ȣ�� �ٽ� Ȯ�����ּ��並 ���
						System.out.println("��й�ȣ�� �ٽ� Ȯ���� �ּ���.");
					}										
				}else if(ch2 == 3) {
					
					System.out.println("��й�ȣ�� �Է� : "); String password = scanner.next(); // scanner��ü�� ����Ͽ� password������ �Է°��� ���� �� �ֵ��� ���ش�.
					if(boardlist[bno].password.equals(password)) { // boardlist�迭�� bno�� �ش��ϴ� password�� ����ڰ� �Է��� password�� ���ٸ�
						System.out.println("������ ���� : "); boardlist[bno].title = scanner.next(); // boardlist�迭�� bno�� ��ȣ�� ���ٿ����ڸ� ���� �ʵ忡 �ִ� title�� ���� ����
						System.out.println("������ ���� : "); boardlist[bno].content = scanner.next(); // boardlist�迭�� bno�� ��ȣ�� ���ٿ����ڸ� ���� �ʵ忡 �ִ� content�� ���� ����
						System.out.println("������ �����Ǿ����ϴ�.");
					}
					
					
				}else { // �ش� ��ȣ �ܿ� �ٸ� ��ȣ�� �Է��ϸ� �� �� ���� ��ȣ�Դϴ�. ���
					System.out.println("�� �� ���� ��ȣ�Դϴ�.");
				}
				
			}else { // �ش� ��ȣ �ܿ� �ٸ� ��ȣ�� �Է��ϸ� �� �� ���� ��ȣ�Դϴ�. ���
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}										
			
		}
		
	}
	
}









