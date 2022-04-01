package 과제.타이어와비슷한예제만들기;

public class 왼쪽다리 extends 근육 {

	public 왼쪽다리() {}
	
	public 왼쪽다리(int 최대근육, int 누적근육) {
		 super(최대근육);
	}
	
	@Override
	public boolean make() {
		누적근육++;	
		if(누적근육 < 최대근육) {
			System.out.println("왼쪽다리 근육수명 : " + (최대근육 - 누적근육));
			return true;
		}else {
			System.out.println("왼쪽다리 근육파괴");
			return false;
		}
	}	
}
