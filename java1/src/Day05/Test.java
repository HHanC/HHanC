package Day05;

import java.util.Scanner;

public class Test { // c s
	
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ] 
		2. ���� [ ������(�ߺ�x)  , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	2. �ʱ�޴�
		1.ȸ������v  2.�α���v 
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
		
		Scanner scanner = new Scanner(System.in); // �� ��� ��ü ����
		String[][] member = new String[100][2]; // �ɹ���� �迭 �� 100 �� 2
		String[][] book = new String[100][3]; // ���̶�� �迭  �� 100 ��3 
		// ��(=�����Ѵ�)
		
		while(true) { // while s
			System.out.println("-----------------------");
			System.out.println(" 1. ȸ������ 2. �α��� ");
			System.out.println("-----------------------");
			int ���� = scanner.nextInt();						
			
			if(���� == 1) {
				System.out.println(" ����) ���̵� : ");
				String id = scanner.next();			
				System.out.println(" ����) ��й�ȣ : ");
				String pw = scanner.next();
				
				
				boolean ��Ŭ = true;
				for(int i = 0; i < member.length; i++) {  // �ߺ�üũ			
					if( member[i][0] != null && member[i][0].equals(id)) {
						System.out.println(" ������ ���̵� �����մϴ�. ");						
						��Ŭ = false; // ����(=�����͸� �������� �ʴ´�)
						break;
					}
				}
				if( ��Ŭ ) {
					for(int i = 0; i < member.length; i++) { // ����üũ
						if(member[i][0] ==  null) {
							member[i][0] = id; // ��ӿ� ���̵� ����
							member[i][1] = pw; // ��ӿ� ��й�ȣ ����
						
							
						}							
					}
				}
				
			} else if(���� == 2) {
				System.out.println(" ���̵� : ");
				String id = scanner.next();
				System.out.println(" ��й�ȣ : ");
				String pw = scanner.next();
				
			
				boolean ��Ŭ2 = false; // 
				for(int i = 0; i < member.length; i++) {
					if( member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println(" �α��� ����");
						��Ŭ2 = true;
						break;
					}else {
						System.out.println(" �α��� ���� ");
					}
				}
			} 
			
		
		} // while end
		
	} // main end
} // c e

