package test;

public class test {
	
	public static void main(String[] args) {
		
		// 1. static 변수는 new 연산자 없이 바로 사용
		System.out.println( Car.연료 );
		
		System.out.println( Car.연료 );
		
		// 2. static 변수가 아니면 new 연산자로 객체 선언
		Car car = new Car();
		System.out.println( car.주행거리 );
		
		Car car2 = new Car();
		System.out.println( car2.주행거리);	
	}
}
