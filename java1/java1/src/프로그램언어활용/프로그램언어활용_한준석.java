package ���α׷����Ȱ��;

import java.util.Scanner;

public class ���α׷����Ȱ��_���ؼ� {

	public static void main(String[] args) {
		
		�л�[] �л��迭 = new �л�[100];
		int[] ��ũ = new int[100];
		Scanner scanner = new Scanner(System.in);
		
			
		while(true) {	
			try {	
				System.out.println("-----------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ");
				System.out.println("-----------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("-----------------------------------------------------------");
				double ��� = 0;
				for(int i=0; i<�л��迭.length; i++) {										
					if(�л��迭[i] != null) {
						��� = �л��迭[i].����/(double)3;
					System.out.println(�л��迭[i].��ȣ + "\t" + �л��迭[i].�̸� + "\t" + �л��迭[i].���� + "\t" + �л��迭[i].���� + "\t" + �л��迭[i].���� + "\t" + �л��迭[i].���� + "\t" + String.format("%.2f", ���));									
					}
				}
				System.out.println("-----------------------------------------------------------");
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
					
					
					
					for(int i=1; i<�л��迭.length; i++) {
						if(�л��迭[i] == null) {
						�л��迭[i] = �л�;
						break;
						}						
					}
					
					
				}else if(ch == 2) {
					System.out.println("������ �л��� ��ȣ�� �Է����ּ���.");
					System.out.print("��ȣ : ");
					int no = scanner.nextInt();
						
					�л��迭[no] = null;
					for(int i=no; i<�л��迭.length; i++) {						
						if(i == �л��迭.length -1) {
							�л��迭[�л��迭.length -1] = null;	
							break;
						}else {
							�л��迭[i] = �л��迭[i+1];
							
						}
					}										
				}else {
					System.err.println("��ȣ�� �ٽ� �Է��� �ּ���.");
					break;
				}
			}catch(Exception e) {}
		}		
	}
	
}
