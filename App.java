package ����.������;

import java.util.Scanner;

public class App { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // w s
			try {
				
				System.out.println("---------------------------���� ��Ȳ ǥ---------------------------");
				System.out.println("\t\t\t1. ���� \t2. ���� : "); int ch = scanner.nextInt();
				// 1. ��� ���� ǥ ���
					//
							// �迭�̳� ����Ʈ�� ��� ��ü ȣ�� �ݺ���
					//
				if(ch == 1) { // �������
					// 1. ������ȣ�� �Է¹޴´�.
					System.out.print("������ȣ : "); String ������ȣ = scanner.next();
						// �Է�
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��.
					Controller controller = new Controller();
					boolean car = controller.����(������ȣ);
					if(car == true) {
						System.out.println("������ �� �� �ֽ��ϴ�.");
					}else {
						System.out.println("������ ������ �����ϴ�.");
					}
					// 3. �޼ҵ� ����� ���� ���
					
					
				}else if(ch == 2) {
					// 1. ������ȣ�� �Է¹޴´�.
						// �Է�
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��.
					// 3. �޼ҵ� ����� ���� ���
					
				}else {
					
				}	
			}catch (Exception e) {}
		} // w e
	} // m e	
} // c e
