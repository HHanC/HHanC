package Day05;

import java.util.Scanner;

public class Day05_4_�����뿩_2�ΰ��� { // c s
	
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ] v
		2. ���� [ ������(�ߺ�x) v , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	2. �ʱ�޴�
		1.ȸ������ v 2.�α���  v
			1.ȸ�����Խ� ���̵� �ߺ�üũ v 
	3. �α��ν� �޴� 
		1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� v
 			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
			2. ������Ͻ� ��� ������ ��� 
			3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
			4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
			5. �α׾ƿ� �ʱ�޴���  v
	4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
		1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
			1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
			2. ������Ͻ� ��� ������ ��� 
			3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
			4. �α׾ƿ��� �ʱ�޴��� 
	*/

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		boolean idcheck = true;
		String[][] member = new String[100][2];
		String[][] book = new String[100][3];
		boolean login = true;
		
		while(true) {
		System.out.println("-------------------");
		System.out.println(" 1. ȸ������ 2. �α��� ");
		System.out.println("-------------------");
		int ���� = scanner.nextInt();
		
		if(����==1) {
			System.out.println(" ���̵� �Է����ּ��� : ");
			String id = scanner.next();
			System.out.println(" ��й�ȣ�� �Է����ּ��� :  ");
			String pw = scanner.next();
			  // �ߺ�����
			
			for( int i = 0; i<member.length; i++ ) {
				if(member[i][0] == null) {
					member[i][0] = id;
					member[i][1] = pw;
				} // if end				
			} // for end						
		} // if end
		// book �ߺ�����
		
		
		else if(����==2) {
			System.out.println("---------------------�α���â-------------------");
			System.out.println(" 1. ���̵� : "); String id = scanner.next();
			System.out.println(" 2. ��й�ȣ : "); String pw = scanner.next();
			for(int i = 0; i<member.length; i++) {
				if(member[i][0] != null && member[i][0].equals(id) && member[i][0].equals(pw)) {
					System.out.println(" �α��� ���� ");
					
					for(int j = 0; j<member.length; j++) {					
					
						if(member[j][0] != null && member[j][0].equals("admin")) {
						while(true) {							
							System.out.println("------------------");
							System.out.println("1. ������� 2. ������� 3. �α׾ƿ� ");
							System.out.println("------------------");
							int ����2 = scanner.nextInt();
								if(����2 == 1) {}
									else if(����2 == 2) {}
										else if(����2 == 3){}
											System.out.println(" �α׾ƿ� �ϼ̽��ϴ�. ");
											break;
											
							
							
							}
						}
					}
					
					
					while(true) {
						System.out.println("--------------------------------------------------");
						System.out.println(" 1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
						System.out.println("--------------------------------------------------");
						int ����2 = scanner.nextInt();
						
						if(����2 == 1) {
							System.out.println(" �˻��Ͻ� �������� �Է����ּ���. ");
							String ������ = scanner.next();
							for(int j = 0; j<book.length; j++) {
								if(book[j][0] != null && ������==book[j][0]) {
									System.out.println(" �뿩 �����մϴ�. ");
								} else {
									System.out.println(" �뿩 �Ұ����մϴ�. ");
//									System.out.println(book[j][2]);
									break;
								}
							}
						}
						
							else if(����2 == 2) {
								for(int u = 0; u < book.length; u++) {
									if(book[u][0].equals(book)) {
										System.out.println(" ���� ��� ");
										System.out.println(book[u][0]);
									}
								}
							}
						
								else if(����2 == 3) {}
						
									else if(����2 == 4) {}
						
										else if(����2 == 5) {
											break;
										}
										
										
										
						
					}
		
				}
			}
			}
			
			
			
		
	}// while end
		
		
	} // main end
} // c e

