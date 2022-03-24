package Day17;

public class Product <제네릭타입1, 제네릭타입2>{
				// < 외부로부터 받을 자료형 : 아무거나 >
	// 필드
	private 제네릭타입1 kind;
	private 제네릭타입2 mocel;

	// get
	public 제네릭타입1 getKind() {
		return kind;
	}
	
	public 제네릭타입2 getMocel() {
		return mocel;
	}
	
	// set
	public void setMocel(제네릭타입2 mocel) {
		this.mocel = mocel;
	}
	public void setKind(제네릭타입1 kind) {
		this.kind = kind;
	}
	
	
}
