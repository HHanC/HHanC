package Day06;

public class Day06_4 {

	public static void main(String[] args) {
		
		// ������ڷ� ��ü ����
		Car2 youCar = new Car2();
		
		// ������ �ִ� ��ü ����
		Car2 myCar = new Car2("����", 3000);
				// new �����ڸ� ( �μ�1, �μ�2 )
					// ���� -> color ���� ����
					// 3000 -> cc���� ����
		
		System.out.printf("%s\t%d", myCar.color, myCar.cc);
	}
	
}
