package ����.ƽ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����1 {

	/*
	 * ��� ���� [ ƽ���� ���� ]
			1. ������ 9ĭ ����
				1. String[] �迭 = new String[9]
		
			2. ����ڿ��� 0~8 �ε�����ȣ �Է¹ޱ�
				1. �ش� �ε����� O ǥ��
				2. �̹� �� �ڸ��� �� �Է� 
		
			3. ��ǻ�ʹ� 0~8 ���� ���� �߻� 
				1. �ش� �ε����� X ǥ��
				2. �̹� �� �ڸ��� �� ���� ����  
		
			4. �¸��Ǵ� 
				���� �ε������� ����� ��� �����ϸ�
				012 345 678
					ù��° �ε����� 0���� 6���� 3������
						�ι�° : ù��°+1
 						����° : ù��°+2
				���� �ε������� ����� ��� �����ϸ� 
				036 147 258
					ù��° �ε����� 0���� 2���� 1������ 
						�ι�° : ù��°+3
						����° : ù��°+6
				�밢�� �ε������� ����� ��� �����ϸ� 
				048 246
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] ������ = {"[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]"};
		String �¸��� = "";
		while(true) {
			
			for(int i=0; i<������.length; i++) {
				System.out.print(������[i]);
				if(i % 3 == 2) System.out.println();
			}
			
			for(int i=0; i<������.length; i++) {
				System.out.println("��ȣ : "); int ��ȣ = scanner.nextInt();
				if(������[��ȣ].equals("[ ]")) {
					������[��ȣ] = "[o]";
					break;
				}else {
					System.out.println("�ߺ��� �ڸ� �Դϴ�.[�缱��]");
				}
			}
			for(int i=0; i<������.length; i++) {
				Random random = new Random();
				int ��ǻ�� = random.nextInt(9);
				if(������[��ǻ��].equals("[ ]")) {
					������[��ǻ��] = "[x]";
					break;
				}
			}
			for(int i=0; i<6; i+=3) {
				if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])){
					�¸��� = ������[i];
					break;
				}
			}
			for(int i=0; i<2; i++) {
				if(������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])){
					�¸��� = ������[i];
					break;
				}
			}
			if(������[0].equals(������[4]) && ������[4].equals(������[8])) {
				�¸��� = ������[0];
			}
			if(������[2].equals(������[4]) && ������[4].equals(������[6])) {
				�¸��� = ������[2];
			}
			if(�¸���.equals("[o]")) {
				System.out.println("�÷��̾� �¸�");
				break;
			}
			if(�¸���.equals("[x]")) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
			
		}
	}
	
}
