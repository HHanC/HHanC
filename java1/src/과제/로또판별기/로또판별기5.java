package ����.�ζ��Ǻ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ��Ǻ���5 {

	/* �ζ� �Ǻ��� 
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */
	
	public static void main(String[] args) {
		
		int[] ����ڹ�ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.print("1~45 �Է� : ");
			int ��ȣ = scanner.nextInt();
			
			boolean ��� = true;
			
			if(��ȣ < 1 || ��ȣ > 45) {
				System.out.println("�� �� ���� ��ȣ�Դϴ�. (���Է�)");
				i--;
				��� = false;
			}
			for(int j = 0; j<6; j++) {
				for(int temp : ����ڹ�ȣ) {
					if(temp == ����ڹ�ȣ[i]) {
						System.out.println("�ߺ��� ��ȣ �Դϴ�.(���Է�)");
						i--;
						��� = false;
					}
				}
			}
			if(��� == true) {
				����ڹ�ȣ[i] = ��ȣ;
			}
			
			for(int temp : ����ڹ�ȣ) {
				System.out.print("����ڰ� ������ ��ȣ : ");
				System.out.println(temp);
			}									
		}
		for(int i=0; i<6; i++) {
			Random random = new Random();
			int ��÷ = scanner.nextInt(45)+1;
			
			boolean ��� = true;
			for(int temp : ��÷��ȣ) {
				if(temp == ��÷��ȣ[i]) {
					i--;
					��� = false;
				}
			}	
			if(��� == true) {
				��÷��ȣ[i] = ��÷;
			}
		}
		System.out.println("��÷��ȣ");
		for(int temp : ��÷��ȣ) {
			System.out.println(temp);
		}
		int �����Ѽ� = 0;
		for(int �񱳱��� : ����ڹ�ȣ) {
			for(int �񱳴�� : ��÷��ȣ) {
				if(�񱳱��� == �񱳴��) {
					�����Ѽ�++;
				}
			}
		}
		System.out.println("������ �� : " + �����Ѽ�);
	}
	
}
