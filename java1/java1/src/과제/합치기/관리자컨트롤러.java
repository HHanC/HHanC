package 과제.합치기;

import java.time.LocalTime;
import java.util.ArrayList;



public class 관리자컨트롤러 {

	static ArrayList<관리자_클래스> 영화리스트 = new ArrayList<>(); // Array 객체명은 영화리스트 // static 전역변수(해당 패키지에서만)

	boolean 영화등록(String 영화이름, String 영화시간) { // 영화등록 변수에 String 영화이름과 영화시간 인자값 받음
		
		for(관리자_클래스 temp : 영화리스트) { // 관리자_클래스 필드를 temp에 영화리스트 배열을 넣는다.
			if(temp.get영화시간().equals(영화시간)) { // 관리자_클래스 필드이 영화시간을 get을 통해서 템프에 넣고 입력받은 영화시간이랑 같다면
				return false; // false;
			}
			
		}		
		관리자_클래스 관리자 = new 관리자_클래스(영화이름, 영화시간); // 필드에 저장된 영화이름과 영화시간이 관리자 변수에 저장됨
		영화리스트.add(관리자); // Array배열에 관리자변수에 저장되어있는 영화 이름과 영화 시간을 저장
		return true; // true값을 반환
	}
	
	
	void 매출확인() {
	}

}