package ����.ȸ�������α׷�;

import java.util.Scanner;

public class ȸ�������α׷� {

	// ȸ���� ���α׷� [ Ŭ���� ���� ] 
	
			// 0. ȸ�� ���� => ȸ�� Ŭ���� ����� 
				// 1. �ʵ� 
					// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
			// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� 3.���̵�ã�� , 4.��й�ȣã�� ]
				// 1. ȸ�����Խ� �Է¹޾� ���� 
				// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó�� 
				// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ��� 
				// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ��� 

	public static void main(String[] args) { // main �߰�ȣ �ȿ� �ڵ带 �Է��ؾ� ������ �ȴ�.
		Scanner scanner = new Scanner(System.in); // �Է� ���� �� ���� ��ü�� ��ĳ�� ��ü�̴�.
		Member[] memberlist = new Member[100]; // ��� ��ü�� �迭�� �����.
		
		while(true) { // �ݺ����� ����� �ش�.
			
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��");
			System.out.print("���� : "); int ch = scanner.nextInt(); // ��ĳ�� ��ü�� ������ ������ ch�� ����� �ش�.
			
			if(ch == 1) {
				
				System.out.println("------------ȸ������ ������------------");
				System.out.print("id : "); String id = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ id�� ����� �ش�.
				System.out.print("pw : "); String pw = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ pw�� ����� �ش�.
				System.out.print("name : "); String name = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ name�� ����� �ش�.
				System.out.print("phone : "); String phone = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ phone�� ����� �ش�.
				
				Member member = new Member(); // member��ü ����
			// Ŭ������	��ü��	�޸��Ҵ�	������
				
				member.id = id; // ���������ڸ� ���ؼ� �Է°��� ���� id�� �ʵ��� id�� ����
				member.pw = pw; // ���������ڸ� ���ؼ� �Է°��� ���� pw�� �ʵ��� pw�� ����
				member.name = name; // ���������ڸ� ���ؼ� �Է°��� ���� name�� �ʵ��� name�� ����
				member.phone = phone; // ���������ڸ� ���ؼ� �Է°��� ���� phone�� �ʵ��� phone�� ����
				
				boolean ��� = false; // boolean�� ���� ����� �ʱⰪ false; �� ����
				for(Member temp : memberlist) { // for�ݺ����� ���ؼ� ���Ŭ���� ȣ���ϰ� temp�� �ӽ�����, memberlist�迭�� temp�� ��
					if(temp != null && temp.id.equals(id)) { // temp�� ���� null�� �ƴϰ� �ʵ忡 ����� id�� ����ڰ� �Է��� id�� ���ٸ�
						System.err.println("�ߺ��� id �Դϴ�. [�ٽ� �Է�]"); // �ߺ��� id�Դϴ�. ���
						��� = true; // ���⼭ true�� ������ ���̿��� true�� ����
					}
				}
				if(!���) { // !�� ����Ͽ� true�� �ƴϸ��� ������ �־���
					int i = 0; // ������ ���� i�� 0���� �־���
					for(Member temp : memberlist) { // for�ݺ����� ���ؼ� ���Ŭ���� ȣ���ϰ� temp�� �ӽ�����, memberlist�迭�� temp�� ��
						if(temp == null) { // temp�� �ӽ�������� �ȿ� �迭�� ������ null�� ���ٸ�
							memberlist[i] = member; // �迭�� i�ε��� �ȿ� member��ü�� ����
							System.out.println("ȸ������ ����"); // ȸ������ ���� ���
							break; // ȸ�������� �����ϸ� break�� ���ؼ� �ݺ��� Ż��
						}
					}
				}				
			}else if(ch == 2) {
				
				System.out.println("------------�α��� ������-------------");
				System.out.print("id : "); String id = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ id�� ����� �ش�.
				System.out.print("pw : "); String pw = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ pw�� ����� �ش�.
				
				boolean ��� = false; // boolean�� ���� ����� �ʱⰪ false; �� ����
				for(Member temp : memberlist) { // for�ݺ����� ���ؼ� ���Ŭ���� ȣ���ϰ� temp�� �ӽ�����, memberlist�迭�� temp�� ��
					if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) { // temp�� ���� null�� �ƴϰ� �ʵ忡 ����� id���� ����ڰ� �Է��� id���� ���� �ʵ忡 ����� pw���� ����ڰ� �Է��� pw�� ���ٸ�
						System.out.println("�α��� ����"); // �α��� ���� ���
						��� = true; // ������ �´ٸ� true 
					}					
				}
				if(!���) { // true�� �ƴϸ�
					System.err.println("�α��� ����"); // �α��� ����
				}				
			}else if(ch == 3) {
				
				System.out.println("------------���̵� ã�� ������------------");
				System.out.print("name : "); String name = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ name�� ����� �ش�.
				System.out.print("phone : "); String phone = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ phone�� ����� �ش�.
				
				boolean ��� = false; // boolean�� ���� ����� �ʱⰪ false; �� ����
				for(Member temp : memberlist) { // for�ݺ����� ���ؼ� ���Ŭ���� ȣ���ϰ� temp�� �ӽ�����, memberlist�迭�� temp�� ��
					if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { // temp�� ���� null�� �ƴϰ� �ʵ忡 ����� name���� ����ڰ� �Է��� name���� ���� �ʵ忡 ����� phone���� ����ڰ� �Է��� phone�� ���ٸ�
						System.out.println("id�� ã�ҽ��ϴ�. id : " + temp.id); // �ʵ忡 ����� id�� ���
						��� = true; // true
					}
				}
				if(!���) { // true�� �ƴϸ�
					System.err.println("�̸��� ��ȭ��ȣ�� �ٽ� Ȯ���� �ּ���"); // �̸��� ��ȭ��ȣ�� �ٽ� Ȯ���� �ּ��� ���
				}				
			}else if(ch == 4) {
				System.out.println("--------------��й�ȣ ã��--------------");
				System.out.print("id : "); String id = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ id�� ����� �ش�.
				System.out.print("phone : "); String phone = scanner.next(); // ��ĳ�� ��ü�� ���ڿ� ������ phone�� ����� �ش�.
				
				boolean ��� = false; // boolean�� ���� ����� �ʱⰪ false; �� ����
				for(Member temp : memberlist) {  // for�ݺ����� ���ؼ� ���Ŭ���� ȣ���ϰ� temp�� �ӽ�����, memberlist�迭�� temp�� ��
					if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {  // temp�� ���� null�� �ƴϰ� �ʵ忡 ����� id���� ����ڰ� �Է��� id���� ���� �ʵ忡 ����� phone���� ����ڰ� �Է��� phone�� ���ٸ�
						System.out.println("��й�ȣ�� ã�ҽ��ϴ�. pw : " + temp.pw); // pw ���
						��� = true;
					}										
				}
				if(!���) { // true�� �ƴϸ�
					System.err.println("�̸��� ��ȭ��ȣ�� �ٽ� Ȯ���� �ּ���."); // �̸��� ��ȭ��ȣ�� �ٽ� Ȯ���� �ּ��� ���
				}
				
			}else { // 1~4�� �ܿ� �ٸ� ��ȣ�� �Է����� ��
				System.out.println("�� �� ���� ��ȣ�Դϴ�."); //�� �� ���� ��ȣ�Դϴ�. ���
			}						
		}		
	}	
}
