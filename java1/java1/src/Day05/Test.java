package Day05;

import java.util.Scanner;

public class Test { // c s

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
 			1. �����˻��� �������� ��ġ�ϸ� �������� �����뿩���� ���
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
	// 9. �����˻��� �������� ��ġ�ϸ� �������� �����뿩���� ���, �ϴ� ������� v
	// 10. ������Ͻ� ��� ������ ��� ?
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
							System.out.println("������ : "); // ������ �Է�
							String ������ = scanner.next(); // ��ĳ�� ��ü ����
							for (int j = 0; j < book.length; j++) { // �迭�� ������
								if (book[j][0] == null) { // book j�� ���� null�̸�
									book[j][0] = ������; // book j�� ���� �Է¹��� �������� ����
									break; // break�� ���ؼ� for�� Ż��
								}
							}
						} else if (ch2 == 2) { // 2�� �������
							for (int j = 0; j < book.length; j++) { // �迭�� ������
								if (book[j][0] != null) { // book�� j��° �ε����� null�� �ƴ϶��
									System.out.println(book[j][0]); // j��° �ε����ȿ� ����� ������ ���
								}
							}
						} else if (ch2 == 3) { // 3�� ��������
							System.out.println("������ ������ : "); // ������ ������ ���
							String �������� = scanner.next(); // ��ü ����

							for (int j = 0; j < book.length; j++) { // �迭�� ������
								if (book[j][0] != null && book[j][0].equals(��������)) { // book�� j��° �ε����� null�� �ƴϰ� book��
																						// j��° �ε����� ���������� ���� ���ٸ�
									book[j][0] = null; // j��° �ε����� null�� ����
									break; // break�� ���ؼ� �ݺ��� Ż��
								}
							}
						} else if (ch2 == 4) { // 4�� �α׾ƿ�
							System.out.println("�α׾ƿ� �Ǿ����ϴ�."); // �α׾ƿ� ���
							break; // break�� ����� else ifŻ��
						} else { // 1~4�� �ܿ� �ٸ� ��ȣ ����������
							System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]"); // �� �� ���� ��ȣ�Դϴ�. ���
						}
					} // w e
				} // if e
			} else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�. [���Է�]");
			}

		} // w e

	} // m e

} // c e