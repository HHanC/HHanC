package Day08; // A,B 클래스와 패키지 다름

import Day08_2.B;

public class C {

	//A a; // A클래스는 default 이기때문에
	// 다른 클래스에서 호출 불가능***
	B b; // B클래스는  public 이기 때문에
	// 다른 패키지에서 호출 가능***
	
}
