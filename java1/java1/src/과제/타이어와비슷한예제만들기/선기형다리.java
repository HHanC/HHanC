package 과제.타이어와비슷한예제만들기;

public class 선기형다리 extends 팔다리 {

	public 선기형다리(int 최대회전수, String 다리위치) {
		super(최대회전수, 다리위치);
	}
	
	@Override
	public boolean 다리() {
		누적회전수++;
		if(누적회전수 < 최대회전수) {
			System.out.println(다리위치 +"선기형 다리 교체까지 : " + (최대회전수 - 누적회전수));
			return true;
		}else {
			System.out.println(다리위치 + "걸을 수 없습니다.");
			return false;
		}
	}
}
