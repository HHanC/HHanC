package Day08.bank;

import java.util.Scanner;

public class Count {
	
	static Scanner scanner = new Scanner(System.in);
	static Count [] banker = new Count[2000];
	
	// 1. �ʵ�
	String id;
	String pw;
	String name;
	int money;
	// 2. ������
	public Count() {
		
	}
	
	public Count(String id, String pw, String name, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}
	
	// 3. �޼ҵ�
	public boolean ���°���() {
		// 1. ���¸��鷯 ����
		// 2. �ڵ���(����)
		// 3. ���̵� ���� ��й�ȣ ������ �޴´�.
		// 4. ������ ����
		// 5. �ߺ�üũ
		// 6. ������
		System.out.println(" your id : ");
		String id = scanner.next();
		System.out.println(" your pw : ");
		String pw = scanner.next();
		System.out.println(" your accounttype : ");
		String name = scanner.next();
		
		Count bankers = new Count(id, pw, name, money);
		
		for(Count temp : banker) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("�˸�  : ���� ������� ���̵� �ֽ��ϴ�.");
				return false;
			}
		}
		int i = 0;
		for(Count temp : banker) {
			if(temp == null) {
				banker[i] = bankers;
				System.out.println("���°����� �Ϸ�Ǿ����ϴ�.");
				return true;
			}
			i++;
		}
		return false;
	}
	public void �Ա�() {
		// 1. �Ա��ϰڴٴ� ��ư ����
		// 2. �ݾ��� �޴´�.
		// 3. ���°� �ִ��� Ȯ���Ѵ�.
		// 4. ������ ����, ������ �ԱݿϷ�
		// 5. ���¹�ȣ�� �迭�� �ִ´�.
		// 6. ����� �Ѵ�
		// 7. ����� �ݾ��� ���¿� ����ִ� �ݾ׺��� ���ٸ� �����߻�
		
		
		System.out.println("�ݾ��� �Է����ּ���. �ݾ� :");
		int money = scanner.nextInt();
		int i = 0;
		for(Count temp : banker) {
			if(temp != null) {
				banker[i].money = money;				
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ���.");
				
			}
			i++;
		}					
	}
	// 1. ����ϰڴٴ� ��ư����
			// 2. ����� �ݾ��� �Է��Ѵ�.
			// 3. ��й�ȣ�� �Է��Ѵ�.
			// 4. ��й�ȣ ������ Ȯ���Ѵ�.
			// 5. ���࿡ ���¿� �ִ� �ݾ׺��� �� ���� �ݾ��� �Է��Ұ�� ����
			// 6. ������ ���
			// 7. ����Ͽ����ϴ�. ���
	public void ���() {
		System.out.println(" ����� �ݾ� : ");
		int �ݾ� = scanner.nextInt();
		int i = 0;
		System.out.println(" ������ ��й�ȣ�� �Է��� �ּ��� :");
		String ��� = scanner.next();
		for(Count temp : banker) {
			if(temp != null && temp.pw.equals(���) ) {
//				banker[i].money = money;
				System.out.println(" ���� ");
			}else {
				System.out.println(" ��й�ȣ�� �ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}
	

	// 1. ��ü ��ư�� Ŭ���Ѵ�.
	// 2. ���� ���¹�ȣ�� �Է��Ѵ�.
	// 3. ��й�ȣ�� �Է��Ѵ�.
	// 4. ��й�ȣ�� ������ ��ü ���� Ʋ���� ���Է�
	// 5. ��ü�� �Ϸ�Ǿ����ϴ�.
	public void ��ü() {
		System.out.println(" ���¹�ȣ �Է� : ");
		int ���¹�ȣ = scanner.nextInt();
		int i = 0;
		System.out.println(" ��й�ȣ : ");
		int ��� = scanner.nextInt();
		for(Count temp : banker) {
			if(temp != null && temp.pw.equals(pw)) {
				banker[i].money = money;
				System.out.println(" ��ü�� �Ϸ��߽��ϴ�.");
			}else {
				System.out.println(" ��й�ȣ�� �ٽ� �Է����ּ���");
				break;
			}
		}		
	}
	// 1. �ݾ��� �Է��Ѵ�.
	// 2. ������ Ŭ���Ѵ�.
	// 3. �ſ����� 2��� �̻��̸� ��� 2��� �̸��̸� �Ұ�
	
	public void ����() {
		System.out.println(" �ݾ� : ");
		int �ݾ� = scanner.nextInt();
		int �ſ��� = 0;
		while(true) {
			if(�ſ��� >= 2) {
				System.out.println("���� �Ϸ�");
			}else {
				System.out.println("�ſ����� 2��� �̸��̿��� ������ �Ұ��մϴ�.");
				break;
			}
		}
	}
	// 1. �����¸���� Ŭ���Ѵ�.
	// 2. ���°� �� �� �ִ��� Ȯ���Ѵ�.
	public void �����¸��() {
		System.out.print(" 1. ���ΰ��� 2. �츮���� 3. ibk���� 4. ���Ѱ��� ���� : ");
		int ���� = scanner.nextInt();
	}
}
