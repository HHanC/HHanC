package Day05;

import java.util.Scanner;
import java.util.stream.DoubleStream.DoubleMapMultiConsumer;

public class Day05_4_�����뿩_2�ΰ��� { // c s
	
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ] v
		2. ���� [ ������(�ߺ�x)  , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ] v
	2. �ʱ�޴�
		1.ȸ������  2.�α���  v
			1.ȸ�����Խ� ���̵� �ߺ�üũ v
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

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[10][2];
		String[][] book = new String[10][3];
		
		while(true) {
			
			System.out.print("1. ȸ������ 2. �α��� ���� : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.println("id : "); String id = scanner.next();				
				System.out.println("pw : "); String pw = scanner.next();
				
				for(int i=0; i<member.length; i++) {
					
					boolean idcheck = true;
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("������ id�� �����մϴ�.");
						idcheck = false;
						break;
					}
					if(idcheck) {
						if(member[i][0] == null){
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("ȸ������ ����");
							break;
						}						
					}					
				}				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();				
				
				for(int i=0; i<member.length; i++) {
					
					
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1] != null && member[i][1].equals(pw)) {
						System.out.println("�α��� ����");											
					}else {
						System.out.println("�α��� ����");							
					}	
					
					while(true) {
						
						System.out.print("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
						
						if(ch2 == 1) { // �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ��� // ���� [ ������(�ߺ�x)  , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
							System.out.println("----------------�����˻�--------------");
							System.out.println("������ : "); String ������ = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null && book[j][0].equals(������)) {
									System.out.println(book[j][0] + book[j][1]);
									break;
								}else {
									System.out.println("�Է��Ͻ� �������� �������� �ʽ��ϴ�.");
									break;
								}
							}							
						}else if(ch2 == 2) { // ������Ͻ� ��� ������ ���
							System.out.println("-----------------�������----------------");
							System.out.print("��ȣ\t������\n");
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null) {
									System.out.println(j+"\t"+ book[j][0]);
								}
							}
						}else if(ch2 == 3) { // �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
							
							System.out.println("--------------�����뿩--------------");
							System.out.println("�뿩�� ������ : "); String �����뿩 = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][1] != null && book[j][1].equals(�����뿩)) {
									System.out.println("������ �뿩�Ͻðڽ��ϱ�?");
									System.out.println(" 1. �뿩 2. ��� "); int ch3 = scanner.nextInt();
									
									if(ch3 == 1) {
										System.out.println("������ �뿩�Ͽ����ϴ�.");
									}else if(ch3 == 2) {
										System.out.println("���� �뿩�� ����Ͽ����ϴ�.");
									}else {
										System.out.println("�� �� ���� �ൿ�Դϴ�.");
									}									
								}else {
									System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");
									break;
								}
							}														
						}else if(ch2 == 4) { // �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
							
							System.out.println("�ݳ��� ������ : "); String �ݳ� = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								
								if(book[i][0] )
								
							}
							
							
						}else if(ch2 == 5) {
							
						}else {
							System.out.println("�� �� ���� �ൿ�Դϴ�.");
						}
						
						
					}
					
				}				
			}else {
				System.out.println("�� �� ���� �ൿ�Դϴ�.");
			}													
		}						
	} // main end
} // c e























