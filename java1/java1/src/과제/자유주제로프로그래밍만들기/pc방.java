package ����.�������������α׷��ָ����;

import java.util.Scanner;

public class pc�� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü����
		String[][] ȸ�� = new String[10][4]; // id, pw, name, �ݾ�, 2���� �迭 ����
		String[] �¼� = {"[ ]", "[ ]", "[ ]","[ ]","[ ]", // 1���� �¼� �迭 ����
						"[ ]","[ ]","[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		while(true) { // �ݺ��� ����
			
			System.out.println("1. ȸ������ 2.�α���  3. �¼����� 4. �ݾ����� 5. �α׾ƿ�");
			System.out.print("���� : ");
			int ch = scanner.nextInt(); // �Է� ��ü ����
			
			if(ch == 1) {
				System.out.println("----------------ȸ������ ������-----------------");
				System.out.println("id : "); String id = scanner.next(); // id �Է� ��ü ����
				System.out.println("pw : "); String pw = scanner.next(); // pw �Է� ��ü ����
				System.out.println("name : "); String name = scanner.next(); // name �Է� ��ü ����
				
				boolean ��� = true; // boolean �ʱⰪ true
				for(int i=0; i<ȸ��.length; i++) {	// for�� �迭		
					if(ȸ��[i][0] != null && ȸ��[i][0].equals(id)) {	 // id�� null�ƴϰ� id�� �Է¹��� id�� ���ٸ� 					
						System.out.println("�ߺ��� id�Դϴ�. �ٽ� �Է��� �ּ���"); // �ߺ��� id�Դϴ�. ���
						��� = false; // ��� = false
					}
					if(���) { // true��
						if(ȸ��[i][0] == null) { // �迭��id�� null�̸�
							ȸ��[i][0] = id; // �迭�� id�� ����
							ȸ��[i][1] = pw; // �迭�� pw�� ����
							ȸ��[i][2] = name; // �迭�� name�� ����
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break; // break�� ���ؼ� �ݺ��� Ż��
						}
					}
				}													
			}else if(ch == 2) {
				while(true) { // �ݺ��� ����
					System.out.println("-----------------�α��� ������-----------------");
					System.out.print("id : "); String id = scanner.next(); // id �Է� ��ü ����
					System.out.print("pw : "); String pw = scanner.next(); // pw �Է� ��ü ����
					
					boolean ��� = false; // �ʱⰪ false
					for(int i=0; i<ȸ��.length; i++) { // for �ݺ��� ����
						if(ȸ��[i][0] != null && ȸ��[i][0].equals(id) && ȸ��[i][1].equals(pw)) { // id �� null�� �ƴϰ� �Է¹��� id�� pw�� ���ٸ�
							System.out.println("�α��� ����"); // �α��� ���� ���
							��� = true; // true ��
							break; // break�� ���ؼ� �ݺ��� Ż��
						}
						if(!���) { // false�̸� �α��� ����
							System.out.println("�α��� ����");
						}				
					}
				}
				
			}else if(ch == 3) { 
				while(true) { // �ݺ��� ����
					for(int i=0; i<ȸ��.length; i++) { // for�ݺ��� ����
						System.out.print(�¼�[i]);	// �迭�� �ִ� ������ ȣ��
						if( i % 5 == 4) System.out.println();	// �������� 4 9 14 �϶� �� �ٲ�ó��		
					}
						System.out.println("--------------�¼� ����-------------");
						System.out.print("�¼� ���� : "); int ��ġ = scanner.nextInt();
						if(�¼�[��ġ].equals("[ ]")) { // �¼��� ��ġ�� �ε��� ��ȣ�� "[ ]" �̶��
							�¼�[��ġ] = "[o]"; // "[o]" �� ���
							break; // break�� ���ؼ� �ݺ��� Ż��
						}else {
							System.out.println("�ٸ� �¼��� ������ �ּ���.");
						}	
				}
				
			}else if(ch == 4) {
				
				System.out.println("--------------------����--------------------");
				System.out.println("1. ���� 2. ���");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					System.out.print("���� �ݾ� : "); String �����ݾ� = scanner.next();
					boolean ��� = false; // ��� �ʱⰪ false
					for(int i=0; i<ȸ��.length; i++) { // for�� �ݺ��� ����
						if(ȸ��[i][4] == null) { // �ݾ��� null �̶�� 
							ȸ��[i][4] = �����ݾ�;// �Է¹��� �����ݾ��� �迭�� ����
							System.out.println("���� ����");
							��� = true;
						}
						if(ȸ��[i][4] != null) { // �ݾ��� null�� �ƴϸ�
							ȸ��[i][4] = �����ݾ�; // �Է¹��� �����ݾ��� �迭�� ����
							System.out.println("�߰� ���� ����"); // �߰����� ����
							��� = true; // true
						}
					}				
				}else if(ch2 == 2) {
					System.out.println("������ ��ҵǾ����ϴ�.");
				}else {
					System.out.println("�� �� ���� ��ȣ�Դϴ�.");
				}			
			}else if(ch == 5) {
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				break;
			}else {
				
			}
		}
	}
}
