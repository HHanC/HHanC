package ����.�������������α׷��ָ����;

import java.util.Scanner;

public class pc�� {

	// 1. ȸ������ (ȸ�����Խ� �ߺ�üũ �� �α��� id pw�����ؾ���)
	// 2. �α��� ���� ���� �� �ĺҷ�
	// 3. �¼����� pc�� �ϰ� �ִٸ� [x] �ð��� �����ٸ� [o]
	// 4. 
	// 5. 
	// 6. 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] ȸ������ = new String[10][4];
		String[] �¼� = {"[ ]", "[ ]", "[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		while(true) {
			
			System.out.println("1. ȸ������ 2. �α��� 3. �ݾ�����");
			System.out.print("���� : ");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("----------------ȸ������ ������-----------------");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				System.out.println("name : "); String name = scanner.next();
				
				boolean ��� = true;
				for(int i=0; i<ȸ������.length; i++) {					
					if(ȸ������[i][0] != null && ȸ������[i][0].equals(id)) {						
						System.out.println("�ߺ��� id�Դϴ�. �ٽ� �Է��� �ּ���");
						��� = false;
					}
					if(���) {
						if(ȸ������[i][0] == null) {
							ȸ������[i][0] = id;
							ȸ������[i][1] = pw;
							ȸ������[i][2] = name;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						}
					}
				}
													
			}else if(ch == 2) {
				System.out.println("-----------------�α��� ������----------------");
				System.out.println("id : "); String id = scanner.next();
				System.out.println("pw : "); String pw = scanner.next();
				
				boolean ��� = false; // ����
				ȸ������[0][3] = "123";
				for(int i=0; i<ȸ������.length; i++) { //�α��� -> �ð�üũ = ��� true => �α��μ��������� // f s
					if(ȸ������[i][0] != null && ȸ������[i][0].equals(id)) { // if s
						if(ȸ������[i][1].equals(pw)) { // pw if s						
							if(ȸ������[i][3] != null && Integer.parseInt(ȸ������[i][3]) > 0) { // time if s "123" = 123 "123s" = err
								��� = true; // �ʱ�ȭ
							} // time if e							
						} // pw if e						
					} // if e
				} // f e
				if(!���) {
					System.out.println("�α��� �����Ͽ����ϴ�.");
				}
				
				if(���) {
					
					System.out.println("�α��� ����");
					
					
					
					
				}
				
				
				
				
			}else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}						
		}				
	}	
}
