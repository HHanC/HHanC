package 과제.타이어와비슷한예제만들기;

public class 명호형팔 extends 팔다리 {

	public 명호형팔(String 팔위치, int 최대회전수) {
		super(팔위치, 최대회전수) ;
	}
	
	@Override
	public boolean 다리() {
		누적회전수++;
		if(누적회전수 < 최대회전수) {
			System.out.println(다리위치 +"명호형 팔 교체까지 : " + (최대회전수 - 누적회전수));
			return true;
		}else {
			System.out.println(다리위치 + "팔을 사용할 수 없습니다.");
			return false;
		}
	}	
	
}
