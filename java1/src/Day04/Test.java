package Day04;

import java.util.Scanner;

public class Test {
	// ���� : ����� -> ���� -> �ݺ��� -> ���
	// ���Ǳ� ���α׷�
			// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ] 
			// 		// 1.�޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ� 
			//		// 2.��� �����ϸ� �˸�( ������ )
			// 2. �ʱ� ��� [ ��ǰ �� 10���� ]
			// 3. ������ �ݾ��Է¹޾� ������ ��ŭ ������ �ܵ� ��� 
					// 1. ������ �ݾ׺��� ���ž� �� �� ũ�� ���� ��� [ �ݾ׺��� ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� = 10;
		int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;
		
		while(true) {
			System.out.println("----------�Ŵ���----------");
			System.out.println(" 1. �ݶ�[300] 2. ȯŸ[200] 3. ���̴�[100] 4. ����");
			System.out.println(">>>>> ���� : "); int ���� = scanner.nextInt();
			
			if(���� == 1) {
				if(�ݶ���� == 0) {
					System.out.println(" ��� �����ϴ�. ");
				}
				else {
					System.out.println("[[�ݶ� ��ҽ��ϴ�.]]");
					�ݶ󱸸ż�++;
					�ݶ����--;
				}
			}
			else if(���� == 2) {
				if(ȯŸ��� == 0) {
					System.out.println(" ��� �����ϴ�. ");
				}
				else {
					System.out.println("[[ȯŸ�� ��ҽ��ϴ�.]]");
					ȯŸ���ż�++;
					ȯŸ���--;
				}
			}
			else if(���� == 3) {
				if(���̴���� == 0) {
					System.out.println(" ��� �����ϴ�. ");
				}
				else {
					System.out.println("[[���̴ٸ� ��ҽ��ϴ�.]]");
					���̴ٱ��ż�++;
					���̴����--;
				}
			}
			else if(���� == 4) {
				System.out.println("----------����ǰ��---------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				System.out.println("�ݶ�\t" + �ݶ󱸸ż� + "\t" + (�ݶ󱸸ż�*300));
				System.out.println("ȯŸ\t" + ȯŸ���ż� + "\t" + (ȯŸ���ż�*200));
				System.out.println("���̴�\t" + ���̴ٱ��ż� + "\t" + (���̴ٱ��ż�*100));
				int �Ѱ����� = (�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100);
				System.out.println("-------------------------");
				System.out.println(" 1. ���� 2. ��� "); int ����2 = scanner.nextInt();
				
				
			}
		
			
		}
		
	}
	
}
