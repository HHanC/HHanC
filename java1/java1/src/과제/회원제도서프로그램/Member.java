package ����.ȸ�����������α׷�;

public class Member { // c s
	
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
	boolean ȸ������() { // boolean Ÿ���� �޼ҵ� // ȸ������ s
		System.out.println("--------ȸ������ ������---------");
		System.out.println("���̵� : "); String id = ȸ�����������α׷�.scanner.next(); // mainŬ������ scanner��ü ���
		System.out.println("��й�ȣ : "); String pw = ȸ�����������α׷�.scanner.next(); // mainŬ������ scanner��ü ���
		System.out.println("�̸� : "); String name = ȸ�����������α׷�.scanner.next(); // mainŬ������ scanner��ü ���
		System.out.println("����ó : "); String phone = ȸ�����������α׷�.scanner.next(); // mainŬ������ scanner��ü ���
		
		for(Member temp : ȸ�����������α׷�.members) { // mainŬ������ members�迭�� Member temp�� ����
			if(temp != null && temp.id.equals(id)) { // temp�� null�� �ƴϰ� temp�� id�� ����ڰ� �Է��� id�� ���ٸ�
				System.out.println("���� ������� ���̵� �Դϴ�."); // �ߺ��� ���̵� ���
				return false; // false�� ��ȯ�Ͽ� ���Խ���
			}
		}
		int bno = 0; // ȸ����ȣ�� �����ϴ� ����
		int j = 0; // �ε���
		for(Member temp : ȸ�����������α׷�.members) { // for s // mainŬ������ members �迭�� Member temp �� ��´�.
			if(temp == null) { // temp�� ��� members�迭�� �����Ͱ� null �̶��
				if(j == 0) { // if e // ù��° �ε���[0�� �ε���]�� null�̶�� 
					bno = 1; // ù ȸ�� ��ȣ �� 1
					break;
				}else {
					bno = ȸ�����������α׷�.members[j-1].mno +1; // null �� [������ȸ��] ��ȣ�� +1 // ���� ����� ����
						// �� members �ε����� ȸ����ȣ�� ȣ���ؼ� + 1
					break;
				}				
			} // if e
			j++;
		} // for e
		Member member = new Member(bno, id, pw, name, phone); // ������ ȣ���Ͽ� member������ ��´�.
		int i = 0;
		for(Member temp : ȸ�����������α׷�.members) { // for s // Member temp�� main�� members�迭�� ��´�
			if(temp == null) { // temp �� null�̶��
				ȸ�����������α׷�.members[i] = member; // member������ members[i]�� �ε��� ��ȣ�� ��´�.
				System.out.println("ȸ������ ȸ����ȣ : " + bno); // ȸ�� ��ȣ
				return true; // ���� true
			}
			i++;
		} // for e		
		return false; // false��ȯ
	} // ȸ������ e
	String �α���() { // String s
		System.out.println("----------�α��� ������----------");
		System.out.println("���̵� : "); String id = ȸ�����������α׷�.scanner.next();
		System.out.println("��й�ȣ : "); String pw = ȸ�����������α׷�.scanner.next();
		for(Member temp : ȸ�����������α׷�.members) { // for s
			if(temp != null && temp.id.equals(id) && temp.password.equals(pw)) { // temp�� null�� �ƴϰ� temp����� id�� ����ڰ� �Է� id�� ���ٸ�
				return temp.id; // ������ id ��ȯ
			}
		} // for e		
		return null;		
	} // String e
	void ���̵�ã��() { // void s
		System.out.println("---------���̵�ã�� ������----------");
		System.out.println("�̸� : "); String name = ȸ�����������α׷�.scanner.next();
		System.out.println("����ó : "); String phone = ȸ�����������α׷�.scanner.next();
 		
		for(Member temp : ȸ�����������α׷�)
		
	} // void e
} // c e

















