package ����.����Ϲ�ũ�������α׷�;

//ȸ�� �ֿ��� : 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��

public class Member {

	private int mno;
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	public Member() {}

	public Member(int mno, String id, String pw, String name, String phone) {
		super();
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}	
	
	boolean ȸ������() {
		System.out.println("--------------ȸ������ ������---------------");
		System.out.print("���̵� : "); String id = Main.scanner.next();
		System.out.print("��й�ȣ : "); String pw = Main.scanner.next();
		System.out.print("�̸� : "); String name = Main.scanner.next();
		System.out.print("��ȣ��ȣ : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id)) {
				return false;
			}
		}
		int bno = 0;
		int j = 0;
		for(Member temp : Main.members) {
			if(temp == null) {
				if(j == 0) {
					bno = 1;
					break;
				}else {
					bno = Main.members[j-1].mno+1;
					break;
				}
			}
			j++;
		}		
		int i = 0;
		Member member = new Member(bno, id, pw, name, phone);
		for(Member temp : Main.members) {
			if(temp == null) {
				Main.members[i] = member;
				return true;
			}
			i++;
		}		
		return false;
	}
	String �α���() {
		System.out.println("-----------------�α��� ������-------------------");
		System.out.print("���̵� : "); String id = Main.scanner.next();
		System.out.print("��й�ȣ : "); String pw = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
			}
		}		
		return null;
	}
	void ���̵�ã��() {
		System.out.println("-------------------���̵� ã�� ������------------------");
		System.out.print("�̸� : "); String name = Main.scanner.next();
		System.out.print("��ȭ��ȣ : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("ȸ������ ���̵� : " + temp.id);
				return;
			}			
		}
		System.err.println("������ ȸ�� ������ �����ϴ�.");
	}
	void ��й�ȣã��() {
		System.out.println("------------------��й�ȣ ã�� ������----------------------");
		System.out.print("���̵� : "); String id = Main.scanner.next();
		System.out.print("��ȭ��ȣ : "); String phone = Main.scanner.next();
		
		for(Member temp : Main.members) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ : " + temp.pw);
				return;
			}
		}
		System.err.println("������ ȸ�� ������ �����ϴ�.");		
	}
}

















