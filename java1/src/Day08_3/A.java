package Day08_3;

public class A { // 동일한 클래스내 접근제한자 사용의미x
// 전범위 클래스 선언A
	// 1. 필드
	A a1 = new A(true); // 현 클래스에서 public 호출 가능
	A a2 = new A(1);	// 현 클래스에서 default 호출가능
	A a3 = new A("문자열");	// 현 클래스에서 private 호출가능
	
	public int field1;
	int field2;
	private int field3;
	
	// 2. 생성자
	public A(boolean b) {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	} // 전범위
	A(int b) {}			   // 현 패키지내
	private A(String s) {} // 현 클래스내
	// 3. 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
