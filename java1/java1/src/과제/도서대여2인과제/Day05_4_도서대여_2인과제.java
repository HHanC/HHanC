package ����.�����뿩2�ΰ���;

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

	public static void main(String[] args) { // main�޼ҵ带 ����Ͽ� �Ʒ� ��� �ڵ带 �Է��Ѵ�.
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü�� �����Ͽ� ���� �����Ҷ� ȣ���� �� �ֵ��� ���ش�.
		String[][] member = new String[10][2]; // ���̵�� ��й�ȣ�� ��� �迭�� �������ش�.
		String[][] book = new String[10][3]; // ������� �����뿩���ο� �뿩���� ���� �迭�� �������ش�.
		
		while(true) { // �ݺ����� ����Ͽ� �Ʒ� �ڵ带 �ݺ������� ����� �� �ֵ��� ���ش�.
			
			System.out.println("-------------�ʱ�Ŵ�------------");
			System.out.print("1. ȸ������ 2. �α��� ���� : "); int ch = scanner.nextInt(); // ����°��� ����� ��ĳ�� ��ü�� ȣ���Ͽ� ��ȣ�� ������ �� �ֵ��� ���ش�.
			
			if(ch == 1) { // ���ǹ��� 1���� �Է��ϸ� ȸ������ �������� �Ѿ �� �ְ� ���ش�.
								
				System.out.println("id : "); String id = scanner.next(); // ��ĳ�� ��ü�� ȣ���Ͽ� id�� ���� �������ش�.			
				System.out.println("pw : "); String pw = scanner.next(); // ��ĳ�� ��ü�� ȣ���Ͽ� pw�� ���� �������ش�.
				
				for(int i=0; i<member.length; i++) { // for���� ����Ͽ� 0~9���� ���ǿ� �����ϸ� �ݺ����ش�.
					
					boolean idcheck = true; // boolean�� ����Ͽ� ������ ���̶�� true �����̸� false�� ���� �ش�. 
					if(member[i][0] != null && member[i][0].equals(id)) { // member�迭�� i��° �ε����� null�� �ƴϰ� id�� �����ϴٸ� false���� �༭ ������ id�� �����մϴ�. �� ����Ѵ�.
						System.out.println("������ id�� �����մϴ�.");
						idcheck = false;
						break; // break�� ���� false�̸� �ݺ����� ����������.
					}
					if(idcheck) { // true�� ��� member�迭�� id�� pw�� �������ش�.
						if(member[i][0] == null){
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("ȸ������ ����");
							break; // ������ true�� ��� �극��ũ�� ���� �ݺ����� ����������.
						}						
					}					
				}				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next(); 
				System.out.println("pw : "); String pw = scanner.next();				
				
				for(int i=0; i<member.length; i++) {	
					
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1] != null && member[i][1].equals(pw)) { // �ݺ����� ����Ͽ� member�迭�� i�� ���� null�� �ƴϰ� id�� pw�� ���ٸ� if���� ����������.
						System.out.println("�α��� ����");											
					}else { // �׷��� �ʴٸ�, id �Ǵ� pw�� Ʋ�ȴٸ� �α��ν��и� ����Ѵ�.
						System.out.println("�α��� ����");							
					}	
					
					while(true) { // �ݺ����� ����Ͽ� �Ʒ� �ڵ带 �ݺ��� �ش�.
						
						System.out.print("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
						
						if(ch2 == 1) { // 1���� �����ϸ� �����˻�â�� ����ش�.
							System.out.println("----------------�����˻�--------------");
							System.out.println("������ : "); String ������ = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								if(book[j][0] != null && book[j][0].equals(������)) { // j��° �ε����� null�� �ƴϰ� ������� �̸��� ���ٸ� 
									System.out.println(book[j][0] + book[j][1]); // ������� �����뿩���θ� ����Ѵ�.
									break; // break�� ����Ͽ� �ݺ����� ����������.
								}else { // �׷��� �ʴٸ� 
									System.out.println("�Է��Ͻ� �������� �������� �ʽ��ϴ�.");
									break; // break�� ����Ͽ� �ݺ����� ����������.
								}
							}							
						}else if(ch2 == 2) { // 2���� �Է��ϸ� �������â�� ����ش�.
							System.out.println("-----------------�������----------------");
							System.out.print("��ȣ\t������\n");
							for(int j=0; j<book.length; j++) { // �ݺ����� ����Ѵ�.
								if(book[j][0] != null) { // j��° �ε����� null�� �ƴ϶�� 
									System.out.println(j+"\t"+ book[j][0]); // j�� ��ȣ�� j��° �ε��� �ȿ� ����Ǿ��ִ� �������� ����Ѵ�.
								}
							}
						}else if(ch2 == 3) { // 3���� �Է��ϸ� �����뿩â�� ����ش�.
							
							System.out.println("--------------�����뿩--------------");
							System.out.println("�뿩�� ������ : "); String �����뿩 = scanner.next();
							
							for(int j=0; j<book.length; j++) { // �ݺ����� ����Ѵ�.
								if(book[j][1] != null && book[j][1].equals(�����뿩)) { // �����뿩�� null�� �ƴϰ� �����뿩��� ���ٸ� if���� �����Ų��.
									System.out.println("������ �뿩�Ͻðڽ��ϱ�?");
									System.out.println(" 1. �뿩 2. ��� "); int ch3 = scanner.nextInt();
									
									if(ch3 == 1) { // 1���� �Է��ϸ� �뿩
										System.out.println("������ �뿩�Ͽ����ϴ�.");
									}else if(ch3 == 2) { // 2���� �Է��ϸ� ���
										System.out.println("���� �뿩�� ����Ͽ����ϴ�.");
									}else { // �� �� �ٸ� ��ȣ�� �Է��ϸ� �� �� ���� �ൿ�Դϴٸ� ����Ѵ�.
										System.out.println("�� �� ���� �ൿ�Դϴ�.");
									}									
								}
							}														
						}else if(ch2 == 4) { // 4���� �Է½� �ݳ�â�� ����ش�.
							
							System.out.println("�ݳ��� ������ : "); String �ݳ� = scanner.next();
							
							for(int j=0; j<book.length; j++) {
								
								
								
							}
							
							
						}else if(ch2 == 5) {
							
						}else { // 1~5�� �ܿ� �ٸ� ��ȣ�� �Է��ϸ� �� �� ���� �ൿ�Դϴ�.�� ����Ѵ�.
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























