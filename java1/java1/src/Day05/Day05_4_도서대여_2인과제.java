package Day05;

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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[100][2];
		String[][] book = new String[100][3];

		while (true) {

			System.out.println("1. ȸ������ 2. �α���");
			System.out.print("���� : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.print("id : ");
				String id = scanner.next();
				System.out.print("pw : ");
				String pw = scanner.next();

				for (int i = 0; i < member.length; i++) {

					boolean idcheck = true;
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("�̹� ������� id�Դϴ�.");
						idcheck = false;
						break;
					}
					if (member[i][0] == null) {
						if (idcheck) {
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("ȸ������ ����");
							break;
						}
					}

				}
			} else if (ch == 2) {

				System.out.print("id : ");
				String id = scanner.next();
				System.out.print("pw : ");
				String pw = scanner.next();

				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("�α��� ����");

						boolean idcheck = false;
						if (id.equals("admin")) {
							idcheck = true;
						}

						while (true) {
							System.out.print("1. ������� 2. ������� 3. �������� 4. �α׾ƿ� ���� : ");
							int ch2 = scanner.nextInt();

							if (ch2 == 1) {
								System.out.println("������ : ");
								String ������ = scanner.next();
								for (int j = 0; j < book.length; j++) {
									if (book[j][0] == null) {
										book[j][0] = ������;
										break;
									}
								}
							} else if (ch2 == 2) {
								for (int j = 0; j < book.length; j++) {
									if (book[j][0] != null) {
										System.out.println(book[j][0]);
									}
								}
							} else if (ch2 == 3) {

								System.out.println("������ ������ : ");
								String �������� = scanner.next();

								for (int j = 0; j < book.length; j++) {
									if (book[j][0] != null && book[j][0].equals(��������)) {
										book[j][0] = null;
										break;
									}
								}

							} else if (ch2 == 4) {
								System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
								break;
							} else {
								System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]");
							}
						}
						break;
					} else {
						System.out.println("�α��� ����");
					}
				}
			} else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]");
			}

		}

	}

} // c e
