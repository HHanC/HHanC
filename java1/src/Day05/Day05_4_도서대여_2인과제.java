package Day05;

import java.util.Scanner;

public class Day05_4_�����뿩_2�ΰ��� { // c s
	
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ] 
		2. ���� [ ������(�ߺ�x)  , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	2. �ʱ�޴�
		1.ȸ������  2.�α���  
			1.ȸ�����Խ� ���̵� �ߺ�üũ 
	3. �α��ν� �޴� 
		1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� 
 			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
			2. ������Ͻ� ��� ������ ��� 
			3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
			4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
			5. �α׾ƿ� �ʱ�޴���  
	4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
		1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
			1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
			2. ������Ͻ� ��� ������ ��� 
			3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
			4. �α׾ƿ��� �ʱ�޴��� 
	*/

	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[10][3];
		String[][] book = new String[10][3];
		
		while(true) {
			
			System.out.println("1. ȸ������ 2. �α���"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true;
				for(int i=0; i<member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("������ id�� �����մϴ�.");
						idcheck = false;
						break;
					}
					if(member[i][0] == null) {
						member[i][0] = id;
						System.out.println("ȸ������ ����");
						idcheck = true;
						break;
					}
				}								
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				for(int i=0; i<member.length; i++) {
					
					boolean logincheck = false;
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("�α��� ����");
						logincheck = true;
						break;
					}
					
				}
				
			}else {
				
			}
			
		}
		
		
	} // main end
} // c e

