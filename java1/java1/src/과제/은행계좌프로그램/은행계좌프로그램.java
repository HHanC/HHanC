package ����.����������α׷�;

import java.util.Scanner;

public class ����������α׷� {
	
	// ����������α׷� [ ��� ] 
			// ����[super]
			// ��������[sub] , ��������[sub] , �ϳ�����[sub]
			// �� ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.���� 
	public static ����[] ���¸���Ʈ = new ����[100];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		������Ʈ�ѷ� ��Ʈ�� = new ������Ʈ�ѷ�();
		
		while(true) {
			
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. �����¸�� 6. ���� ���� : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("---------���»��� ������---------");
				System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
				System.out.println("������ : "); String ������ = scanner.next();
				System.out.println("1. �������� 2. �������� 3. �ϳ�����"); int �����ȣ = scanner.nextInt();
				
				String ���¹�ȣ = ��Ʈ��.���»���(��й�ȣ, ������, �����ȣ);
				
				if(���¹�ȣ != null) {
					System.out.println("������ ���¹�ȣ : " + ���¹�ȣ);
				}else {
					System.out.println("���µ�� ����");
				}			
			}else if(ch == 2) {
				
				System.out.println("----�Ա� ������----");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("�Աݾ� : "); int �Աݾ� = scanner.nextInt();
				
				Boolean �Ա� = ��Ʈ��.�Ա�(���¹�ȣ, �Աݾ�);
				
				if(�Ա� == true) {
					System.out.println("�ԱݿϷ�!");
				}else {
					System.out.println("���¹�ȣȮ��..");
				}
				
			}else if(ch == 3) {
				System.out.println("-----��� ������----");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
				System.out.println("��ݾ� : "); int ��ݾ� = scanner.nextInt();
				
				int ��� = ��Ʈ��.���(���¹�ȣ, ��й�ȣ, ��ݾ�);
				
				if(��� == 1) {
					System.out.println("�ݾ�Ȯ��...");
				}else if(��� == 2) {
					System.out.println("��� ����!");
				}else if(��� == 3) {
					System.out.println("�����ڿ��� ����...");
				}
				
			}else if(ch == 4) {
				System.out.println("--------��ü ������--------");
				System.out.println("���¹�ȣ : "); String ���¹�ȣ = scanner.next();
				System.out.println("��й�ȣ : "); String ��й�ȣ = scanner.next();
				System.out.println("��ü�ݾ� : "); int ��ü�ݾ� = scanner.nextInt();
				System.out.println("�޴°��� : "); String �޴°��� = scanner.next();
				
				int ��ü = ��Ʈ��.��ü(���¹�ȣ, ��й�ȣ, ��ü�ݾ�, �޴°���);
				
				if(��ü == 1) {
					System.out.println("�ݾ�Ȯ��....");
				}else if(ch == 2) {
					System.out.println("��ü����!");
				}else if(ch == 3) {
					System.out.println("�����ڹ���..");
				}else if(ch == 4) {
					System.out.println("�����ڹ���..");
				}
				
			}else if(ch == 5) {
				
				System.out.println("----���¸�� ������---");
				System.out.println("������ : "); String ������ = scanner.next();
				
				����[] ���¸�� = ��Ʈ��.���¸��(������);
				
				int i = 1;
				for(���� temp : ���¸��) {
					if(temp != null) {
						System.out.println(i + "��° ������ " + temp.get���¹�ȣ());
					}
					i++;
				}
				
			}else if(ch == 6) {
				System.out.println("---���� ������----");
			}else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}
			
			
		}
		
	}
	
}
