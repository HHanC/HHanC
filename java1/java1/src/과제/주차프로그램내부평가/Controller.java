package ����.�������α׷�������;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

	public static ArrayList<Car> carlist = new ArrayList<>(); // Array�迭�� �����ڸ� �ҷ��� �޸� �Ҵ��� �ϰ� carlist�迭 ��ü�� ���� ������ �޸𸮿� ������ �� �ְ� ���ش�.
	
	public static boolean ����(String ������ȣ) { // boolean �ڷ������� ���� �޼ҵ带 ����, ���� �޼ҵ忡�� �Է¹��� ������ȣ�� ����
		
		for(Car temp : carlist) { // Car Ŭ������ ���� temp�� �����ϰ� carlist�迭 ��ü�� ���Ͽ� �ߺ�üũ�� �Ѵ�.	
			if(temp.get������ȣ().equals(������ȣ)) { // Car��ü�� �ִ� ������ȣ�� �Է¹��� ������ȣ�� ���ٸ� return������ false;
				return false;
			}
		}
		LocalDate ��¥ =  LocalDate.now(); // LocalDateŬ���� �ȿ� ���������ڸ� ���ؼ� now�޼ҵ带 �ҷ��´�. ��¥��� ������ ���� ��¥�� ���� ���ش�.
		LocalTime �����ð� =  LocalTime.now(); // LocalTimeŬ���� �ȿ� ���������ڸ� ���ؼ� now�޼ҵ带 �ҷ��´�. �����ð��̶�� ������ ���� �ð��� ���� ���ش�.
		
		Car car = new Car(��¥, ������ȣ, �����ð�, null, 0); // CarŬ�����ȿ� Car�������� ��¥, ������ȣ, �����ð�, �����ð�, �ݾ� ������ �Է°��� �������ش�.
		carlist.add(car); // ���������ڸ� ���ؼ� add�޼ҵ忡 �����Ͽ� car������ carlist�迭�� �����Ѵ�.
		return true;
		
	}
	public static boolean ����(String ������ȣ) {
		
		
		for(Car temp : carlist) { // temp�� ���� carlist�迭�� ���� ���Ͽ� 
			if(temp.get������ȣ().equals(������ȣ)) { // Car Ŭ������ ����� ������ȣ�� �Է¹��� ������ȣ�� ���ٸ�
				return false; // return false�� ��ȯ�Ѵ�.
			}			
		}
		
		LocalDate ��¥ = LocalDate.now(); // ���� ������ ��¥ ���
		LocalTime �����ð� = LocalTime.now(); // ���� ������ �ð��� ���
		
		Car car = new Car(��¥, ������ȣ, null, �����ð�, 0); // �Է¹��� ������ȣ�� car��ü�� �����Ѵ�.
		carlist.add(car); // carlist�迭�� car��ü�� ����Ǿ��ִ� ������ȣ�� �����Ѵ�.
		
		return true; // return true�� ��ȯ�Ѵ�.
	}
}











