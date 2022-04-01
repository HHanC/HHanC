package 과제.타이어와비슷한예제만들기;

public class 팔다리 {

//	만약 로봇의 팔이 10번 움직이면 다른 팔로 교체
//	만약 로봇의 다리가 10번 움직이면 다른 다리로 교체
//
//	///////////////////////////
//	로봇
//
//	팔, 다리, 몸통
//
//	팔, 다리, 몸통으로 로봇을 만든다
//
//	로봇1, 로봇2, 로봇3
	public int 최대회전수;
	public int 누적회전수;
	public String 팔위치;
	public String 다리위치;
	
	public 팔다리() {}
		
	public 팔다리(String 다리위치, int 최대회전수) {
		this.다리위치 = 다리위치;
		this.최대회전수 = 최대회전수;		
	}
	
	public 팔다리(int 최대회전수, String 다리위치) {
		this.최대회전수 = 최대회전수;
		this.다리위치 = 다리위치;
	}

	public 팔다리(int 최대회전수, int 누적회전수, String 팔위치, String 다리위치) {
		this.최대회전수 = 최대회전수;
		this.누적회전수 = 누적회전수;
		this.팔위치 = 팔위치;
		this.다리위치 = 다리위치;
	}

	public boolean 팔() {
		누적회전수++;
		if(누적회전수 < 최대회전수) {
			System.out.println(팔위치 + "팔 남은 횟수 : " + (최대회전수 - 누적회전수));
			return true;
		}else {
			System.out.println(팔위치 + "팔 고장");
			return false;
		}
	}
	
	public boolean 다리() {
		누적회전수++;
		if(누적회전수 < 최대회전수) {
			System.out.println(다리위치 + "다리 남은 횟수 : " + (최대회전수 - 누적회전수));
			return true;
		}else {
			System.out.println(다리위치 + "다리 고장");
			return false;
		}
	}
	
}
















