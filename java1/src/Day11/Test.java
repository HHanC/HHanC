package Day11;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		�л�[] �л��迭 = new �л�[100];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("----------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ");
				System.out.println("----------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("----------------------------------------------------------------");
				double ��� = 0;
				for(int i=0; i<�л��迭.length; i++) {
					if(�л��迭[i] != null) {
						��� = �л��迭[i].����/3;
						System.out.println(�л��迭[i].��ȣ+ "\t" + �л��迭[i].�̸�+ "\t" + �л��迭[i].����+ "\t" + �л��迭[i].����+ "\t" + �л��迭[i].����+ "\t" + �л��迭[i].����+ "\t" + ��� );
					}
				}
				
				System.out.println("----------------------------------------------------------------");
				System.out.println("1. �л����� ��� 2. �л����� ����");
				int ch = scanner.nextInt();
				
				
				if(ch == 1) {			
					System.out.print("��ȣ : ");
					int ��ȣ = scanner.nextInt();			
					System.out.print("�̸� : ");
					String �̸� = scanner.next();			
					System.out.print("���� : ");
					int ���� = scanner.nextInt();			
					System.out.print("���� : ");
					int ���� = scanner.nextInt();		
					System.out.print("���� : ");
					int ���� = scanner.nextInt();
					int ���� = 0;
					���� = (���� + ���� + ����);
					�л� �л� = new �л�(��ȣ, �̸�, ����, ����, ����, ����);
					for(int i=0; i<�л��迭.length; i++){						
						if(�л��迭[i] == null) {
							�л��迭[i] = �л�;
							break;
						}						
					}															
				}else if(ch == 2) {
					
				}else {
					System.out.println("�� �� ���� �ൿ�Դϴ�.");
				}
			}catch(Exception e) {}
		}
	}
	
}
