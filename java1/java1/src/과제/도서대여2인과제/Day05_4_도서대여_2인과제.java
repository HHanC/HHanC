package ����.�����뿩2�ΰ���;

import java.util.Scanner;

public class Day05_4_�����뿩_2�ΰ��� { // c s

	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
		2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	2. �ʱ�޴�
		1.ȸ������ 2.�α��� 
			1.ȸ�����Խ� ���̵� �ߺ�üũ 
			2.�α��� ������ �α��θ޴� , �α��� ���н� �α��ν��� ��� 
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

	// 1. �ʱ�޴� (ȸ������, �α���) v
	// 2. ȸ�����Խ� ���̵� �ߺ�üũ �迭 v
	// 3. �α��ν� ���̵� ��й�ȣ �Է� �ް� �迭�� ���� v
	// 4. �ϴ� ������ �޴����� v
	// 5. ������Ͻ� �������� �Է¹޾� ���� ���ó�� v
	// 6. ������Ͻ� ��� ������ ��� v..?
	// 7. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ] v
	// 8. �α��ν� ȸ���� �޴� ��� v
	// 9. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���, �ϴ� ������� v
	// 10. ������Ͻ� ��� ������ ���  ?
	// 11. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó�� ?
	// 12. �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		String[][] member = new String[100][2]; // member 2���� �迭 ����
		String[][] book = new String[100][3]; // book 3���� �迭 ����

		while (true) { // w s // �ݺ��� ����

			System.out.println("1. ȸ������ 2. �α���"); // 1���� �Է��ϸ� ȸ������, 2���� �Է��ϸ� �α���
			System.out.print("���� : "); // 1���� 2���� ����
			int ch = scanner.nextInt(); // ��ĳ�� ��ü�� �����Ͽ� �Է°��� ����ǵ��� ��

			if (ch == 1) { // 1�� ����
				System.out.print("id : "); // id �Է�
				String id = scanner.next(); // id ��ü ����
				System.out.print("pw : "); // pw �Է�
				String pw = scanner.next(); // pw ��ü ����

				for (int i = 0; i < member.length; i++) { // f s // �迭�� ������ id �ߺ�üũ

					boolean idcheck = true; // boolean �ڷ��� ����
					if (member[i][0] != null && member[i][0].equals(id)) { // �迭�� ���� �Է¹��� ���� ���ٸ�
						System.out.println("�̹� ������� id�Դϴ�."); // �̹� ������Դϴ� ���
						idcheck = false; // false���� �ְ�
						break; // break�� ���ؼ� �Ʒ��� �������ٰ� �ٽ� �ö�ͼ� ���Է�
					}
					if (member[i][0] == null) { // member�迭 i�� ���� null�̶�� 
						if (idcheck) { // idcheck�� �ʱⰪ, �� true
							member[i][0] = id; // �Է°��� id�� i��° �ε����� ����
							member[i][1] = pw; // �Է°��� pw�� i��° �ε����� ����
							System.out.println("ȸ������ ����"); // true�̹Ƿ� ȸ������ ���� ���
							break; // break�� ���ؼ� �Ʒ��� �������ٰ� �ٽ� �ö�ͼ� �α��� �������� ���ư�
						}
					}

				} // f e
			} else if (ch == 2) {

				System.out.print("id : "); // id�Է�
				String id = scanner.next(); // id��ü�� �����Ͽ� �Է°��� ������
				System.out.print("pw : "); // pw�Է�
				String pw = scanner.next(); // pw��ü�� �����Ͽ� �Է°��� ������

				boolean logincheck = false; // logincheck������ �ʱⰪ�� false

				for (int i = 0; i < book.length; i++) { // book�迭�� ������ 
					if (logincheck = true) { // logincheck�� true�̸�
						break; // break�� ���ؼ� �Ϲ� ȸ�� �������� �̵�
					}
				}

				if (id.equals("admin")) { // i s // �Է°��� �� id�� admin�� ���ٸ�
					logincheck = true; // true���� �ְ� ������ �������� �̵�

					while (true) { // w s // �ݺ��� ����
						System.out.print("1. ������� 2. ������� 3. �������� 4. �α׾ƿ� ���� : "); // 1~4�� ����
						int ch2 = scanner.nextInt(); // ��ĳ�� ��ü ����

						if (ch2 == 1) { // 1�� �������
							System.out.println("----------------------�������----------------------");
							System.out.println("������ : "); // ������ �Է�
							String ������ = scanner.next(); // ��ĳ�� ��ü ����
							for (int j = 0; j < book.length; j++) { // �迭�� ������
								if (book[j][0] == null) { // book j�� ���� null�̸� 
									book[j][0] = ������; // book j�� ���� �Է¹��� �������� ����
									break; // break�� ���ؼ� for�� Ż��
								}
							}
						} else if (ch2 == 2) { // 2�� �������
							System.out.println("----------------------�������----------------------");
							for (int j = 0; j < book.length; j++) { // �迭�� ������
								if (book[j][0] != null) { // book�� j��° �ε����� null�� �ƴ϶��
									System.out.println(book[j][0]); // j��° �ε����ȿ� ����� ������ ���
								}
							}
						} else if (ch2 == 3) { // 3�� ��������
							System.out.println("----------------------��������----------------------");
							System.out.println("������ ������ : "); // ������ ������ ���
							String �������� = scanner.next(); // ��ü ����

							for (int j = 0; j < book.length; j++) { // �迭�� ������ 
								if (book[j][0] != null && book[j][0].equals(��������)) { // book�� j��° �ε����� null�� �ƴϰ� book�� j��° �ε����� ���������� ���� ���ٸ�
									book[j][0] = null; // j��° �ε����� null�� ����
									break; // break�� ���ؼ� �ݺ��� Ż��
								}
							}
						}
						
						else if (ch2 == 4) { // 4�� �α׾ƿ�
							System.out.println("�α׾ƿ� �Ǿ����ϴ�."); // �α׾ƿ� ���
							break; // break�� ����� else ifŻ��
						} else { // 1~4�� �ܿ� �ٸ� ��ȣ ����������
							System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]"); // �� �� ���� ��ȣ�Դϴ�. ���
						}
					} // w e
				} // if e
				
				
				
				if (!id.equals("admin")) { // i s // �Է°��� �� id�� admin�� ���ٸ�
					logincheck = true;
					for (int i = 0; i < member.length; i++) { // f s // �迭�� ������
						if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) { // member�� i��° �ε��� ���� null�� �ƴϰ� id�� pw�� �����ϴٸ�
							System.out.println("�α��� ����"); // �α��� ����

							while(true) { // w s // �ݺ��� ����
								
								System.out.print("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ� ���� : "); int ch3 = scanner.nextInt(); // ��ĳ�� ��ü ����
								
								if(ch3 == 1) {
									System.out.println("----------------------�����˻�----------------------");
									System.out.println("������ : "); String �����˻� = scanner.next();
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for(int j=0; j<book.length; j++) {								
										if(book[j][0] != null && book[j][0].equals(�����˻�)) {												
											book[j][2] = id;
											System.out.println(j +"\t"+book[j][0] +"\t"+ book[j][1] +"\t\t"+ book[j][2]);
										}									
									}								
								}else if(ch3 == 2) {							
									System.out.println("----------------------�������----------------------");
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null) {
											book[j][2] = id;
											System.out.println(j +"\t"+book[j][0] +"\t"+ book[j][1] +"\t\t"+ book[j][2]);
										}
									}																
								}else if(ch3 == 3) {
									System.out.println("----------------------�����뿩----------------------");
									System.out.println("�뿩�� ������ : "); String �����뿩 = scanner.next();
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null && book[j][0].equals(�����뿩)) {
											if(book[j][1] == null) {
												System.out.println("������ �뿩�Ͻðڽ��ϱ�? yes , no"); String ���� = scanner.next();
												if(����.equals("yes")) {
													book[j][1] = "�뿩��";
													book[j][2] = id;
												}else {
													if(����.equals("no")) {
														System.out.println("�뿩 ���");
													}
												}
											}
										}																																																						
									}
										
								}else if(ch3 == 4) { // �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
									System.out.println("----------------------�����ݳ�----------------------");
									System.out.println("�ݳ��� ������ : "); String �ݳ����� = scanner.next();
									for(int j=0; j<book.length; j++) {
										if(book[j][0] != null && book[j][0].equals(�ݳ�����)) {
											book[j][1] = null;
											book[j][2] = null;
											System.out.println("������ �ݳ��Ͽ����ϴ�.");
											break;
										}else if(book[j][1] == null){
											System.out.println("�뿩���� �ʾҽ��ϴ�.");
											break;
										}
										
									}
									
								}else if(ch3 == 5) {
									System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
									break;
								}else {
									System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]");
								}
								
							} // w e
				}
				
				
						
						
					} if(!logincheck) {
						System.out.println("�α��� ����");
						break;
					}
				} // f e

			} else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]");
			}
			
		} // w e
		
	} // m e

} // c e
