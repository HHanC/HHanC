package test;

public class test {
	
	public static void main(String[] args) {
		
		// 1. static ������ new ������ ���� �ٷ� ���
		System.out.println( Car.���� );
		
		System.out.println( Car.���� );
		
		// 2. static ������ �ƴϸ� new �����ڷ� ��ü ����
		Car car = new Car();
		System.out.println( car.����Ÿ� );
		
		Car car2 = new Car();
		System.out.println( car2.����Ÿ�);	
	}
}
