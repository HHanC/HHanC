package Day08.bank;

import java.util.Scanner;

public class Count {
	Scanner scanner = new Scanner(System.in);
	// 1. �ʵ�
	String ���°���;
	int �Ա�;
	int ���;
	int ��ü;
	int ����;
	String ���¸��;
	String �̸�;
	int ��й�ȣ;

	// 2. ������
	public Count() {}
	
	public Count(String ���°���, int �Ա�, int ���, int ��ü, int ����, String ���¸��, String �̸�, int ��й�ȣ) {
		this.���°��� = ���°���; // ?
		this.�Ա� = �Ա�;
		this.��� = ���;
		this.��ü = ��ü;
		this.���� = ����;
		this.���¸�� = ���¸��;
		this.�̸� = �̸�;
		this.��й�ȣ = ��й�ȣ;
	}
	
	// 3. �޼ҵ�
	boolean ȸ���޴�() {
		System.out.println("-------ȸ�� �޴�-------");
		System.out.println("1.���°��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� ���� : ");
		int ch = scanner.nextInt();
		String name = scanner.next();
		if(ch == 1) {
			 for(View temp : View.counts) {
				 if(temp == null && temp.�̸�.equals(�̸�)) {
					 System.out.println("���¸� �����Ͽ����ϴ�.");
				 }else {
					 System.out.println("�̸��� �ٽ� �� �� Ȯ�����ּ���");
					 
				 }
			 }			 
		}
		else if(ch == 2) {
			 for(Count temp : Count.counts) {
				 if(temp == null && temp.��й�ȣ == ��й�ȣ) {
					 System.out.println("�ݾ��� �־��ּ���. �׼� : ");
					 int �ݾ� = scanner.nextInt();
				 }else {
					 
					 
				 }
			 }
		}
		else if(ch == 3) {}
		else if(ch == 4) {}
		else if(ch == 5) {}
		else if(ch == 6) {}
		else {}
		return true;
		
	}
	
}
