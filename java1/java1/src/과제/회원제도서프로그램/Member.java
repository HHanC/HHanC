package ����.ȸ�����������α׷�;

public class Member { // c s
	
	// 2. member
	// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
	// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	
	// 1. �ʵ�
	int mno; // ȸ����ȣ
	String id; // ���̵�
	String password; // ��й�ȣ
	String name; // �̸�
	String phone; // ����ó
	
	// 2. ������
	public Member() {} // ����

	public Member(int mno, String id, String password, String name, String phone) { // ������
		this.mno = mno;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}			
	// 3. �޼ҵ�
	
	boolean ȸ������() {
		while(true) {
			
			System.out.println("���̵� : "); String id = ȸ�����������α׷�.scanner.next();
			System.out.println("��й�ȣ : "); String pw = ȸ�����������α׷�.scanner.next();
			System.out.println("�̸� : "); String name = ȸ�����������α׷�.scanner.next();
			System.out.println("��ȭ��ȣ : "); String phone = ȸ�����������α׷�.scanner.next();
			
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp != null && temp.id.equals(id)) {
					return false;
				}
			}
			
			int bno = 0;
			int j = 0;
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp == null) {
					if(j == 0) {
						bno = 1;
						break;
					}else {
						bno = ȸ�����������α׷�.member[j-1].mno+1;
					}
				}
				j++;
			}
			
			int i = 0;
			Member member = new Member();
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp == null) {
					ȸ�����������α׷�.member[i] = member;
					return true;
				}
				i++;
			}			
		}		
	}
	String �α���() {
		while(true) {
			System.out.println("���̵� : "); String id = ȸ�����������α׷�.scanner.next();
			System.out.println("��й�ȣ : "); String pw = ȸ�����������α׷�.scanner.next();
			
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp != null && temp.id.equals(id) && temp.password.equals(pw)) {
					return temp.id;
				}
			}
		}				
	}
	void ���̵�ã��() {
		while(true) {
			System.out.println("�̸� : "); String name = ȸ�����������α׷�.scanner.next();
			System.out.println("��ȭ��ȣ : "); String phone = ȸ�����������α׷�.scanner.next();
			
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
					System.out.println("ȸ������ ���̵� : " + temp.id);
					return;
				}
			}
			System.out.println("�� �� ���� ȸ�� ���� �Դϴ�.");
		}		
	}
	void ��й�ȣã��() {
		while(true) {
			System.out.println("���̵� : "); String id = ȸ�����������α׷�.scanner.next();
			System.out.println("��ȭ��ȣ : "); String phone = ȸ�����������α׷�.scanner.next();
			
			for(Member temp : ȸ�����������α׷�.member) {
				if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
					System.out.println("ȸ������ ���̵� : " + temp.password);
					return;
				}
			}
			System.out.println("�� �� ���� ȸ�� ���� �Դϴ�.");
		}			
	}
	
} // c e

















