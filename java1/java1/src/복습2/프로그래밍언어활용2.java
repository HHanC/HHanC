package ����2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import Day14.ȸ��;


public class ���α׷��־��Ȱ��2 {
	
	public static void main(String[] args) {
		// main�߰�ȣ�ȿ� �ڵ带 �Է��ؾ� ������ �ȴ�.

	�л�[] �л���� = new �л�[100];
	
	while( true ) { // ���ѹݺ� 
		Scanner scanner = new Scanner(System.in); // �Է¹��� �� ���� ��ü
		
		System.out.println("---------------------------"); // ����ϰ� �� �ٲ�
		System.out.println("\t��\t��\tǥ"); // \t : �鿩����
		System.out.println("---------------------------");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("---------------------------");
		
			// �迭�� ��� �л�(��ü) �������� 
//			for( int j = 0 ; i<�л����.length ; i++ ) {
//				
//				�л� temp = �л����[i];
//				if( temp != null ) {
//					System.out.println( (j)+"\t"+temp.�̸�+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.���+"\t1");
//				}
//			}
			// �� for ���׷��̵� ���� 
			int j = 0; // �ε����� ���� 
			for( �л� temp : �л����  ) { 
				// �迭�� �л��� �����Ҷ��� �������
				if( temp != null ) {
					System.out.println( (j)+"\t"+temp.�̸�+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.����+"\t"+temp.���+"\t1");
				}
				j++; //�ε��� ����
			}
		
		System.out.println("--------------------------");
		System.out.println("1.�л��߰� 2.�л����� 3.�л����� 4.�л��ҷ�����  :");
		int �޴����� = scanner.nextInt();
		if( �޴����� == 1 ) {
			System.out.print("�̸� : ");	String �̸� = scanner.next();
			// �ڷ��� ������ = ��
		// ���ڿ��ڷ��� �̸� = �Է°� ��������
			System.out.print("���� : ");	int ���� = scanner.nextInt();
			System.out.print("���� : ");	int ���� = scanner.nextInt();
			System.out.print("���� : ");	int ���� = scanner.nextInt();
			int ���� = ���� + ���� + ����;	
			double ��� = ���� / 3.0;
			
			// 1. ��ü���� ��� : Ŭ������ ��ü��(�ƹ��ų�) = new ������();
			�л� s1 = new �л�(�̸�, ����, ����, ����, ����, ���);
		
				
			// 2. �迭�� ���� 
			for( int i = 0 ; i<100 ; i++ ) { // i�� 0~99���� �ݺ� [ ��? 0���� ����?? �迭�� �ε��������� ����ҷ��� [ �ε��� 0���� ~ ]
		//  �ݺ���( ���۰�     ;   ����(�����°�) ; ����
				if( �л���� [i] == null  ) {
					// ���࿡ i��° �ε��� ���� null(��ü�� ����=�л��̾���) 
					�л���� [i] = s1; // �л� ��ü�� �迭�� ����������
					System.out.println("*�л�����");
					break; // ����
				}
			}
			
		}else if(�޴����� == 2 ) {
			System.out.println("������ �л���ȣ(�ε���) : "); int ������ȣ = scanner.nextInt();
			�л���� [������ȣ] = null;
			
		}
		else if( �޴����� == 3 ) {
			// 1. ��Ʈ��:��� Output:�������� file : ���� 
			try {
				// 1. ������� ��Ʈ�� ��ü ����� 
				FileOutputStream outputStream = new FileOutputStream("D:/java/����.txt"); // ������ �Ϲݿ��� [ ����ó�� ]
				// 2. ��� �л���Ͽ��� �л� �������� 
				for( int i = 0 ; i<�л����.length ; i++ ) {
					String ���� = 
					�л����[i].�̸� + "\t" +
					�л����[i].���� + "\t" +
					�л����[i].���� + "\t" +
					�л����[i].���� + "\t" +
					�л����[i].���� + "\t" +
					�л����[i].��� + "\n";
					// �� �ʵ� ���� : \t	�� �л����� ���� : \n
					outputStream.write( ����.getBytes() );
				}
			}
			catch( Exception e ) {
				System.out.println(" �������� ���� ");
			}
		}
		else if( �޴����� == 4 ) {
			
			// ���� �ҷ����� 
			// file input stream
			
			try {
				// 1. ���� �Է� ��ü 
				FileInputStream inputStream = new FileInputStream("d:/java/����.txt");
				// 2. ����Ʈ �迭 ���� 
				byte[] bytes = new byte[1000];
				// 3. ����Ʈ�� �о�� ������ ����Ʈ �迭 ���� 
				inputStream.read(bytes);
				
				// 4. ����Ʈ�迭 -> ���ڿ� ��ȯ 
				String ���ϳ��� = new String( bytes );
				System.out.println( ���ϳ��� );
				// 5. �л��� �и� = �ٸ��� �и� 
				String[] ȸ���� = ���ϳ���.split("\n"); // ���� 
				// 6. ȸ���� �ʵ� �и� 
				for( int i = 0 ; i<ȸ����.length ; i++ ) { // �ݺ���
					String[] �ʵ� =  ȸ����[i].split("\t");
					// ��üȭ
					�л� �л� = new �л�(�ʵ�[0], 
							Integer.parseInt(  �ʵ�[1] ) , 
							Integer.parseInt(  �ʵ�[2] ),
							Integer.parseInt(  �ʵ�[3] ),
							Integer.parseInt(  �ʵ�[4] ),
							Double.parseDouble(  �ʵ�[5] ) ) ;
					// ��ü ����
					for( int x = 0 ; x<�л����.length ; x++ ) {
						if( �л����[x] == null ) { // �迭�� �����ã�Ƽ� �ֱ� 
							
							�л����[x] = �л�; break;
						}
					}
					
				}
			}
			catch( Exception e ) {}
			
			
		}
		
	}
} // 

}