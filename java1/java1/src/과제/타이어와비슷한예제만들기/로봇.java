package 과제.타이어와비슷한예제만들기;

public class 로봇 {

	팔다리 왼쪽팔 = new 팔다리("왼쪽팔", 6);
	팔다리 오른쪽팔 = new 팔다리("오른쪽팔", 2);
	팔다리 왼쪽다리 = new 팔다리("왼쪽다리", 3);
	팔다리 오른쪽다리 = new 팔다리("오른쪽다리", 4);
	
	int run() {
		System.out.println("로봇이 움직입니다.");
		if(왼쪽팔.팔() == false) {stop(); return 1;}
		if(오른쪽팔.팔() == false) {stop(); return 2;}
		if(왼쪽다리.다리() == false) {stop(); return 3;}
		if(오른쪽다리.다리() == false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("로봇이 멈춥니다.");
	}
}
