package ����.ȸ�����湮��;

import java.util.Scanner;

public class ȸ�����湮��1 {

	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü�� ����
		String[][] memberlist = new String[100][3]; // id pw name �� ���� �ɹ� ���� ����
		String[][] boardlist = new String[100][3]; // ���� ���� id�� ���� �ɹ� ���� ����
		
		while(true) { // �ݺ����� ����Ͽ� ȸ�����԰� �α��� ������ �ݺ������� �� �� �ֵ��� ���ش�.
			
			System.out.print("1. ȸ������ 2. �α��� ���� : "); int ch = scanner.nextInt(); // ch�� �Է� ��ü�� ����
			
			if(ch == 1) { // 1. ȸ�������� ���
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true; // ���� ������ ��Ÿ�״� boolean�� ����
				for(int i=0; i<memberlist.length; i++) { // for�ݺ���
					if(memberlist[i][0] != null && memberlist.equals(id)) { // �������Ʈ i�� ���� null�� �ƴϰ� id�� ���ٸ� false
						System.out.println("�ߺ��� id �Դϴ�.");
						idcheck = false;
						break; // �ߺ��� ��� �극��ũ�� ����Ͽ� �Ʒ��� ��������.
					}					
				}	
				if(idcheck) { // ������ ���ϰ��
					for(int i=0; i<memberlist.length; i++) { // �ݺ���
						if(memberlist[i][0] == null) { // i�� ���� null�̶��
							memberlist[i][0] = id; // id�� ��������� �ִ´�.
							memberlist[i][1] = pw; // pw�� ������� �ִ´�.
							memberlist[i][2] = name; // name�� ��������� �ִ´�.
							System.out.println("ȸ������ ����"); 
							break; // �극��ũ�� ����Ͽ� ȸ�����Կ� ����������� �Ʒ��� ��������.
						}
					}
				}
			}else if(ch == 2) { // �α���
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i=0; i<memberlist.length; i++) { // �ݺ��� Ȱ��			
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) { // ������� i�� ���� null�� �ƴϰ� id�� pw�� ���ٸ� �α��� ����
						System.out.println("�α��� ����");
						logincheck = true; // boolean�� true�� ���� // �������� break�� ������� �ʴ� ������ break�� ����ϸ� ���� ����� �ݺ������� Ż���ϱ� ����
						
						while(true) {
							
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							
							for(int j=0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null) { // boardlist�� null�� �ƴ϶�� printf�� ���Ĺ��ڸ� Ȱ���Ͽ� boardlist��������� ����
									System.out.printf("%d\t%s\t%s\t%s\n", 
											j, 
											boardlist[j][2], 
											boardlist[j][0], 
											boardlist[j][1]);																				
								}
							}						
							System.out.print("1. �湮�Ͼ��� 2. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
							if(ch2 == 1) {								
								System.out.println("���� : "); String ���� = scanner.next();
								System.out.println("���� : "); String ���� = scanner.next();								
								for(int j=0; j<boardlist.length; j++) {								
									if(boardlist[j][0] == null) { // boardlist�� ���� null�̶�� boardlist�� �Է°��� ����
										boardlist[j][0] = ����;
										boardlist[j][1] = ����;
										boardlist[j][2] = id;
										System.out.println("�湮�� �ۼ� �Ϸ�");
										break; // �극��ũ�� ����Ͽ� ���� ��� �ݺ������� Ż��
									}									
								}																				
							}else if(ch2 == 2) {
								System.out.println("�α׾ƿ� ����");
								break;
							}else {
								System.out.println("�� �� ���� �ൿ�Դϴ�.");
							}																																			
						}						
					}					
				}
				if(logincheck == false) System.out.println("�α��� ����"); // boolean�� logincheck�� ������ false�̸� �α��� ����
				
			}else {
				System.out.println("�� �� ���� �ൿ�Դϴ�.");
			}			
		}		
	}	
}
