package Day07;

import java.util.Scanner;

public class Ramenrecipe {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); 
	int �� = 1; int �и����� = 1; int ��ä = 1; int ��� = 1; int �ϼ� = 1;
		
	while(true) {	
		System.out.println("--------��鷹����--------");
		System.out.print("1. �� 2. �и����� 3. ��ä 4. ��� 5. �ϼ� 6. ��� ���� : "); int ���� = scanner.nextInt();
		
		if(���� == 1) {
			if(�� == 0) {
				System.err.println("���� �����ϴ�.");
			}else {
				System.err.println("�� 500ml �־����ϴ�");
				��--;
			}
		}else if(���� == 2) {
			if(�и����� == 0) {
				System.err.println("�и������� �����ϴ�.");
			}else {
				System.err.println("�и������� �־����ϴ�.");
				�и�����--;
			}
			
		}else if(���� == 3) {
			if(��ä == 0) {
				System.err.println("��ä�� �����ϴ�.");
			}else {
				System.err.println("��ä�� �־����ϴ�.");
				��ä--;
			}
		}else if(���� == 4) {
			if(��� == 0) {
				System.err.println("����� �����ϴ�.");
			}else {
				System.err.println("����� �־����ϴ�.");
				���--;
			}
		}else if(���� == 5) {
			if(�ϼ� == 0) {
				System.err.println("����� ���� �ϼ����� �ʾҽ��ϴ�.");
			}else{
				System.err.println("����� �ϼ��Ǿ����ϴ�.");
				�ϼ�--;
			}
			
		}else if(���� == 6) {
			System.err.println("��ҵǾ����ϴ�.");
		}else {
			System.err.println("�� �� ���� �ൿ�Դϴ�.");
			break;
		}
	}
	
	}	
	
}
