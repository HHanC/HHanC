package ����.��ġ��;

import java.time.LocalTime;
import java.util.Scanner;

public class ������_�޴� {

	public static void main(String[] args) {
		������_�޴� app = new ������_�޴�();
		app.�޴�();
	}

void �޴�() { // ��ȯ���� ����? void ����
	Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
	while(true) { // �ݺ����� ����Ͽ� �����ڸ޴��� ������?���� ����ش�.
		��������Ʈ�ѷ� admincontroller = new ��������Ʈ�ѷ�(); // �޼ҵ��� admincontroller ��ü�� ����
		
		System.out.println("�����ڸ޴�"); 
		System.out.println("1. ��ȭ��� �� ��ȭ�ð���� 2. ���ĵ�� 3. ����Ȯ�� 4. �α׾ƿ�"); int ch = scanner.nextInt();
		
		if(ch == 1) {
			System.out.print("��ȭ�̸� : "); String ��ȭ�̸� = scanner.next();
			System.out.print("��ȭ�ð� : "); String ��ȭ�ð� = scanner.next();
			
			Boolean ��� = admincontroller.��ȭ���(��ȭ�̸�, ��ȭ�ð�); // ��ȭ�̸��� ��ȭ�ð��� �Է¹����� admincontroller��ü�� ���ٿ����ڸ� ����Ͽ� ��ȭ��� �����ڿ� ���� ����Ѵ�.
			
			if(���) { // ��� = true �̸� if�� ���
				System.out.println("��ȭ��� �� ��ȭ�ð��� ��ϵǾ����ϴ�.");
			}else { // ��� = false �̸� else�� ���
				System.out.println("��ȭ ��� ����.");
			}		
		}else if(ch == 2) {
			
		}else if(ch == 3) {
			
		}else if(ch == 4) {
			
		}else {
			
		}
			
	}
	
}


} // ce