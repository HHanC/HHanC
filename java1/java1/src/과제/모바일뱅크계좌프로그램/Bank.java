package ����.����Ϲ�ũ�������α׷�;

import Day08.bank.Count;

public class Bank {

	String id;
	String pw;
	String name;
	int money;
	
	public Bank() {}

	public Bank(String id, String pw, String name, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}
	
	public boolean ���°���() {
		System.out.print("���̵� : "); String id = Main.scanner.next();
		System.out.print("��й�ȣ : "); String pw = Main.scanner.next();
		System.out.print("���� : "); String name = Main.scanner.next();
		
		for(Bank temp : Main.banks) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("�ߺ��� ���̵� �Դϴ�.");
				return false;
			}
		}
		Bank bank = new Bank(id, pw, name, money);
		int i = 0;
		for(Bank temp : Main.banks) {
			if(temp == null) {
				Main.banks[i] = bank;
				System.out.println("���°����� �Ϸ�Ǿ����ϴ�.");
				return true;
			}
			i++;
		}
		return false;
	}
	public void �Ա�() {
		int money = Main.scanner.nextInt();
		int i = 0;
		for(Bank temp : Main.banks) {
			if(temp != null) {
				Main.banks[i].money = money;	
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ���.");				
			}
			i++;
		}
	}
	public void ���() {
		System.out.println(" ����� �ݾ� : ");
		int �ݾ� = Main.scanner.nextInt();
		int i = 0;
		System.out.println(" ������ ��й�ȣ�� �Է��� �ּ��� :");
		String ��� = Main.scanner.next();
		for(Bank temp : Main.banks) {
			if(temp != null && temp.pw.equals(���) ) {
				System.out.println(" ���� ");
			}else {
				System.out.println(" ��й�ȣ�� �ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}
	public void ��ü() {
		System.out.println(" ���¹�ȣ �Է� : ");
		int ���¹�ȣ = Main.scanner.nextInt();
		int i = 0;
		System.out.println(" ��й�ȣ : ");
		int ��� = Main.scanner.nextInt();
		for(Bank temp : Main.banks) {
			if(temp != null && temp.pw.equals(���)) {
				Main.banks[i].money = money;
				System.out.println(" ��ü�� �Ϸ��߽��ϴ�.");
			}else {
				System.out.println(" ��й�ȣ�� �ٽ� �Է����ּ���");
				break;
			}
		}		
	}
	public void ����() {
		System.out.println(" �ݾ� : ");
		int �ݾ� = Main.scanner.nextInt();
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
	public void �����¸��() {
		System.out.print(" 1. ���ΰ��� 2. �츮���� 3. ibk���� 4. ���Ѱ��� ���� : ");
		int ���� = Main.scanner.nextInt();
	}
	
}









