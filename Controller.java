package ����.������;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

	// 1. �迭 ���
	// public static Car[] carlist = new Car[100];
	// 2. ����Ʈ ���
	public static ArrayList<Car> car = new ArrayList<>();
	
	// ���� �޼ҵ�
	public static boolean ����(String ������ȣ) {
		
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�		
			// * ������ȣ �ߺ�ü��
		for(Car temp : car) {
			if(temp != null && temp.get������ȣ().equals(������ȣ)) {				
				return false;
			}
		}
			// 2. ������¥(���糯¥)�� ���Ѵ� (???? : )
		LocalDate ������¥ = LocalDate.now();
			// 3. �����ð�(����ð�)�� ���Ѵ� (???? : )
		LocalTime �����ð� = LocalTime.now();
			// * �����ð�, �ݾ��� ������ x
			// 4. ������ȣ, ������¥, �����ð� => 3������=> 1��üȭ
		Car a = new Car(������ȣ, ������¥, �����ð�);
			// 5. ������ü�� �迭�̳� ����Ʈ�� ����	
		car.add(a);
		
		return true;
	}
	// ���� �޼ҵ�
	public static boolean ���� (String ������ȣ) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ�
			// 3. �����ð�(����ð�) �� ���Ѵ�. (???? : )
			// 4. ��� [�����ð� - �����ð� => (�� - 30)/10 * 1000
			// 5. (����)ã�� ��ü�� �����ð��� �ݾ��� �����Ѵ�.
			
		return false;
		
	}
	
}
