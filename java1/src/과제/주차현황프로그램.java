package ����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ������Ȳ���α׷� {

//	1. ���� ��Ȳǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [10��]
//			* ������ �����ð��� �������̸� ������ �ð��� �����մϴ�.
//			* ������ �ƴ� ���� ���������� ǥ���ϰ� ���ϸ� ������ ������ �����ð��� ǥ���մϴ�.
//			* �ݾ��� �������̸� ������ ���� ǥ���ϰ� �����ð��� ������ ��� �ݾ��� ǥ���մϴ�.
//
//			2. �޴����� 1�� ���ý� ������ �մϴ�. [10��]
//			* ������ : ������ȣ�� �Է¹޽��ϴ�.[��¥, �����ð�, �����ð�, �ݾ��� �Է¹��� �ʽ��ϴ�.]
//			* ���Ƿ� 5���� ������ ����Ͽ� ǥ���Ͻÿ�.
//
//			3. �޴����� 2�� ���ý� ������ �մϴ�. [10��]
//			* ������ : ������ȣ�� �Է¹޽��ϴ�.
//			* ������ ���� ��Ȳǥ���� �����ð��� �����ϰ� �ݾ��� ����Ͽ� ǥ���մϴ�.
//
//			4. �����ʹ� Ű����� �Է¹޾� ���� ��ü�� �迭 �� ����Ʈ�� �����մϴ�.[5��]
//
//			5. �����ð��� �����ð��� ����Ͽ� �ݾ��� ���Ͻÿ�. [10��]
//			* ���� 30�� ���� [10�д� 1,000��]
//
//			6. ����ó���� ���� �ʽ��ϴ�.
//
//			7. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�.[5��]
	
	
	// 1. ������Ȳǥ v
	// 2. �޴� 1�� // ���� ��ȣ�� �Է¹ޱ� �������� �Է¹��� ���� ���Ƿ� 5���� ���� ���
	// 2-1 ���� �Է��ϰ� ������ ��Ȳǥ�� �ű��
	// 3. �޴� 2��
	public static void main(String[] args) {
		
		while(true) {
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date time = new Date();			
			String time1 = format1.format(time);
			Scanner scanner = new Scanner(System.in);
			String[] car = new String[5];
			
			try {
				System.out.println("------------------������Ȳǥ------------------");
				System.out.println("\t���� �ð� : " + time1);	
				System.out.println("��¥\t������ȣ\t�����ð�\t�����ð�\t�ݾ�");
				for(int i=0; i<car.length; i++) {
					if(car[i] != null) {
						System.out.println(time1+"\t"+car[i]+"\t"+);
					}
				}
				System.out.println("--------------------------------------------");
				System.out.println("\t1. ����\t\t2. ����"); int ch = scanner.nextInt();
				
				if(ch == 1) {
					
					System.out.println("������ȣ : "); String carnum = scanner.next();
					for(int i=0; i<car.length; i++) {
						if(car[i] != null && car[i].equals(carnum)) {
							car[i] = carnum;
						}
					}
					
				}else if(ch == 2) {
					
				}else {
					System.out.println("�� �� ���� �ൿ�Դϴ�.");
				}
				
			}catch (Exception e) {}
		}
		
	}
}
