package ����.�������α׷�������;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		while(true) { // �ݺ��� ����
			try { // ����ó�� �߻� try
				System.out.println("--------------------���� ��Ȳ ǥ--------------------"); // ���� ��Ȳǥ ���
				System.out.println("\t\t 1. ���� \t 2. ����"); int ch = scanner.nextInt(); // ���� �Ǵ� ���� ����
				
				if(ch == 1) {	// 1�� �Է¹޾�����
					
					System.out.print("������ȣ : "); String ������ȣ = scanner.next(); // ������ȣ �Է�
					Controller controller = new Controller(); // Controller ���� ������ �޸� ����
					Boolean ��� = Controller.����(������ȣ); // Controller �� ���� �޼ҵ忡 ����ڰ� �Է��� ������ȣ�� �����ϰ� ���� �޼ҵ��� ������ȣ ���� true�̸� �������� false�̸� ���� �Ұ���
					if(��� == true) {
						System.out.println("���� ����");
					}else {
						System.out.println("���� �Ұ���");
					}
					
				}else if(ch == 2) { // 2���� �Է¹޾�����
					
					System.out.println("������ȣ : "); String ������ȣ = scanner.next(); // ������ȣ�� �Է¹޴´�
					Controller controller = new Controller(); // Controller Ŭ������ ���� Controller �����ڸ� �ҷ����� �޸𸮸� �Ҵ��Ͽ� controller��ü�� �޸𸮿� ���Եȴ�.
					Boolean ��� = Controller.����(������ȣ); // �Է¹޴� ������ȣ�� ControllreŬ������ ���� �޼ҵ忡 �����ϰ� �ȴ�. �̶� boolean ������ true�̸� ���� ���� false�̸� ���� �Ұ���
					
					if(��� == true) {
						System.out.println("���� ����");
					}else {
						System.out.println("���� �Ұ���");
					}
					
					
				}else {
					System.out.println("�� �� ���� ��ȣ�Դϴ�.");
				}
			}catch (Exception e) {
			}
			
		}
		
	}
	
}
