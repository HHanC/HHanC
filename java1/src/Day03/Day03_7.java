package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		boolean run = true; // ���� ���� ���� / true=���� false=����		
		int balance = 0; // ���ݾ� [����ȿ� �ִ� �ݾ�] ����
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.println("----------------------------");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("----------------------------");
			System.out.println("����>");
			int ���� = scanner.nextInt();
			
			if( ���� == 1) { //���࿡ �Է°��� 1�̸�
				System.out.println(" ���ݾ� : "); int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�;
			}
			else if( ���� == 2) { //���࿡ �Է°��� 2�̸�
				System.out.println(" ��ݾ� : "); int ��ݾ� = scanner.nextInt();
				balance -= ��ݾ�;
			}
			else if( ���� == 3) { //���࿡ �Է°��� 3�̸�
				System.out.println(" �ܰ� : " + balance);
			}
			else if( ���� == 4) { //���࿡ �Է°��� 4�̸�
				break;
			}else{
				System.out.println("�˸�) �˼� ���� ��ȣ �Դϴ�.");
			}
		}
		
		System.out.println("���α׷� ����");
		
	}
	
}
