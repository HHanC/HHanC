package Day07;

import java.util.Scanner;

public class Elevatorrecipe {

	public static void main(String[] args) {
		
		int[] ����ڹ�ȣ = new int[10];
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 10; i++) {
				System.out.print("1~10 ���� �Է� : ");
				int ��ȣ = scanner.nextInt();
				
				boolean ��� = true;
				
				if(��ȣ < 1 || ��ȣ >10) {
					System.err.println("������ �� ���� ��ȣ�Դϴ�. [���Է�]");
					��� = false;
				}
				
				for(int j = 0; j < 10; j++) {
					if(��ȣ == ����ڹ�ȣ[j]) {
						System.err.println("�̹� ������ ��ȣ �Դϴ�. [���Է�]");
						��� = false;
						break;
					}
				}
				if(��� == true) {
					����ڹ�ȣ[i] = ��ȣ;
					System.err.println(����ڹ�ȣ[i] + "���������߽��ϴ�. ");
				}
			}
			
		}
	}	
	
}
