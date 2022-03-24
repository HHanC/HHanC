package Day17;

public class Day17_1 {

	public static void main(String[] args) {
	
		// 제네릭 : 
			// 선언 : public class 클래스명 < 제네릭이름 >
			// 목적 : 외부로부터 받은 자료형으로 내부에 해당 자료형 사용
		// p.658
		// 1. 객체 생성
		Box<String> box1 = new Box<String>();
		// 클래스에 String 타입 넣기
		box1.set("홍길동");
		String str= box1.get();
		
		// 2. 객체 생성
		Box<Integer> box2 = new Box<>();
	// 클래스에 Integer타입 넣기 // <생략가능>
		box2.set(6);
		int value = box2.get();
		
		// p. 659
		// 1. 객체 생성 하는데 제네릭타입 넣기
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setMocel("스마트tv");
		Tv tv = product1.getKind();
		String tvmodel = product1.getMocel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setMocel("데질");
		Car car = product2.getKind();
		String carmodel = product2.getMocel();
		
		//
		Product<Integer, Double> product3 = new Product<>();
		
		
	}
	
}
