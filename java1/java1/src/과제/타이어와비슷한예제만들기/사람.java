package 과제.타이어와비슷한예제만들기;

public class 사람 {
	// 다향성 , 부모 = new자식허용
	근육 왼팔 = new 근육(2); // 왼팔 근육의 수명은 2
	근육 오른팔 = new 근육(3); // 오른팔 근육의 수명은 3
	근육 왼다리 = new 근육(4); // 왼다리 근육의 수명은 4
	근육 오른다리 = new 근육(5); // 오른다리 근육의 수명은 5
	
	int start() {
		System.out.println("근육을 만듭니다.");
		if(왼팔.make() == false) {stop(); return 1;} // 리턴이 1이면 파괴
		if(오른팔.make() == false) {stop(); return 2;} // 리턴이 2이면 파괴
		if(왼다리.make() == false) {stop(); return 3;} // 리턴이 3이면 파괴
		if(오른다리.make() == false) {stop(); return 4;} // 리턴이 4이면 파괴
		return 0;
	}
	void stop() {
		System.out.println("근육이 파괴되었습니다.");
	}
}
