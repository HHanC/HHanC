package ����.ȸ�����湮��;

import java.util.Scanner;

import javax.swing.border.Border;

import Day06.Board;

public class ȸ�����湮��1 {

	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
			// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
				// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
				// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
			// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
				// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
				// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		
		
		while(true) {
			
			System.out.println("1. ȸ������ 2. �α��� ���� : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {										
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("�ߺ��� id�Դϴ�.");
						idcheck = false;
						break;
					}
				}
				if( idcheck ) {
					for(int i=0; i<memberlist.length; i++) {
						if( memberlist[i][0] == null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							memberlist[i][2] = name;
							System.out.println("ȸ������ ����");								
							break;						
						}
					}
				}
								
				
			}else if(ch == 2) {
				
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][0].equals(pw)) {
						System.out.println("�α��� ����");
						logincheck = true;
						break;
						
						while(true) {
							System.out.println("------------------------");
							System.out.println("--------- �湮�� ---------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
								// ��� �湮�� ��� 
								for( int j = 0 ; j<boardlist.length ; j++  ) {
									if( boardlist[j][0] != null ) { // �Խù��� ���� �ε����� ���� 
										System.out.printf("%d\t%s\t%s\t%s \n" , 
												j , 
												boardlist[j][2] , // id
												boardlist[j][0] ,  // ����
												boardlist[j][1] ); // ����
									}
								}
								
							System.out.print("1. �湮�ϳ���� 2. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								
								System.out.println("���� : "); String ���� = scanner.next();
								System.out.println("���� : "); String ���� = scanner.next();
								
								for(int j=0; j<boardlist.length; j++) {
									
									if(boardlist[i][0] == null) {
										boardlist[i][0] = ����;
										boardlist[i][1] = ����;
										boardlist[i][2] = id;
										System.out.println("�湮�� ���Ⱑ �Ϸ�Ǿ����ϴ�.");
										break;
									}									
								}								
							}else if(ch2 == 2) {
								System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
								break;
							}else {
								System.out.println("�� �� ���� �ൿ�Դϴ�.");
							}							
						}						
					}
				}
				if(logincheck == false) System.out.println("�α��� ����");
			}else {
				System.out.println("�� �� ���� �ൿ�Դϴ�.");
			}			
		}		
	}
}
