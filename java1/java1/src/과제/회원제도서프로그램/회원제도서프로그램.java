package ����.ȸ�����������α׷�;

import java.util.Scanner;

import Day14.ȸ��;

public class ȸ�����������α׷� {

	// * ���� �뿩 console ���α׷�[ Ŭ�������� ]
			// 1. Ŭ���� ���� 
				// 1. book
					// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
					// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
				// 2. member
					// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
					// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
			// 2. ȭ�� ���� 
				// 1. �ʱ� �޴� [ 1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��  ]
				// 2. �Ϲ�ȸ���޴� [ 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]
				// 3. �����ڸ޴�  [ 1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] member = new Member[1000];
	static Book[] books = new Book[1000];	
	
	public static void main(String[] args) {
		
		ȸ�����������α׷� ȸ�����������α׷� = new ȸ�����������α׷�();
		ȸ�����������α׷�.ȸ������();
		
	}
	
	void ȸ������() {
		while(true) {
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��");
			int ch = scanner.nextInt();
			Member member = new Member();
			if(ch == 1) {
				
				boolean result = member.ȸ������();
				if(result) {
					System.out.println("ȸ������ ����");
				}else {
					System.out.println("ȸ������ ����");
				}
				
			}else if(ch == 2) {
				
			String result = member.�α���();
			if(result == null) {
				System.out.println("�α��� ����");
			}else if(result.equals("admin")) {
				System.out.println("������ �α��� ����");
				�����ڸ޴�();
			}else {
				System.out.println("�Ϲ�ȸ�� �α��� ����");
				ȸ���޴�();
			}
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}
			
		}
	}
	void ȸ���޴�() {
		Book book = new Book();
		System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
		int ch = scanner.nextInt();
		if(ch == 1) {
			book.�����˻�();
		}else if(ch == 2) {
			book.�������();
		}else if(ch == 3) {
			book.�����뿩();
		}else if(ch == 4) {
			book.�����ݳ�();
		}else if(ch == 5) {
			return;
		}else {
			System.out.println("�� �� ���� ��ȣ�Դϴ�.");
		}
		
	}
	void �����ڸ޴�() {
		Book book = new Book();
		System.out.println("1. ������� 2. ������� 3. �������� 4. ���� 5. �α׾ƿ�");
		int ch = scanner.nextInt();
		
		if(ch == 1) {
			book.�������();
		}else if(ch == 2) {
			book.�������();
		}else if(ch == 3) {
			book.��������();
		}else if(ch == 4) {
			//
		}else if(ch == 5) {
			return;
		}else {
			System.out.println("�� �� ���� ��ȣ�Դϴ�.");
		}
		
	}
	
} 














