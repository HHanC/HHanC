package ����.����Ϲ�ũ�������α׷�;

import java.util.Scanner;

public class Main {

	// ����� ��ũ ���� ���α׷�
			// �䱸����
			// ȸ�� �ֿ��� : 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��
			// �ֿ��� 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸��
			// ���� : ����, ����, ȸ��
				// �ʵ�
				// �޼ҵ�
	
	static Scanner scanner = new Scanner(System.in); // ���������� �����Ͽ� �ٸ� Ŭ������ ��Ű������ ����� �� �ֵ��� �Ѵ�.
	static Member[] members = new Member[1000]; // ���������� �����Ͽ� �ٸ� Ŭ������ ��Ű������ ����� �� �ֵ��� �Ѵ�.
	static Bank[] banks = new Bank[1000]; // ���������� �����Ͽ� �ٸ� Ŭ������ ��Ű������ ����� �� �ֵ��� �Ѵ�.
	
	public static void main(String[] args) { // main�޼ҵ�
		Main main = new Main(); // ��ü ����
		main.member(); // ���� ������ ����Ͽ� �޼ҵ� ȣ��
	}
	
	void member() { 
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
					System.out.println("������ ȸ�� ������ �����ϴ�.");
				}else {
					System.out.println("�α��� ����");
					bankmember();
				}						
			}else if(ch == 3) {
				member.���̵�ã��();
			}else if(ch == 4) {
				member.��й�ȣã��();
			}else {
				
			}			
		}
	}
	void bankmember() {
		while(true) {
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸��");
			int ch = scanner.nextInt();
			Bank bank = new Bank();
			if(ch == 1) {
				bank.���°���();
			}else if(ch == 2) {
				bank.�Ա�();
			}else if(ch == 3) {
				bank.���();
			}else if(ch == 4) {
				bank.��ü();
			}else if(ch == 5) {
				bank.����();
			}else if(ch == 6) {
				bank.�����¸��();
			}else if(ch == 7) {
				return;
			}else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}
		}
	}
}
