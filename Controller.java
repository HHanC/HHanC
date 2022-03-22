package 과제.주차평가;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

	// 1. 배열 경우
	// public static Car[] carlist = new Car[100];
	// 2. 리스트 경우
	public static ArrayList<Car> car = new ArrayList<>();
	
	// 입차 메소드
	public static boolean 입차(String 차량번호) {
		
		// 입차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다		
			// * 차량번호 중복체스
		for(Car temp : car) {
			if(temp != null && temp.get차량번호().equals(차량번호)) {				
				return false;
			}
		}
			// 2. 입차날짜(현재날짜)를 구한다 (???? : )
		LocalDate 입차날짜 = LocalDate.now();
			// 3. 입차시간(현재시간)을 구한다 (???? : )
		LocalTime 입차시간 = LocalTime.now();
			// * 출차시간, 금액은 출차시 x
			// 4. 차량번호, 입차날짜, 입차시간 => 3개변수=> 1객체화
		Car a = new Car(차량번호, 입차날짜, 입차시간);
			// 5. 차량객체를 배열이나 리스트에 저장	
		car.add(a);
		
		return true;
	}
	// 출차 메소드
	public static boolean 출차 (String 차량번호) {
		// 출차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서
			// 3. 출차시간(현재시간) 을 구한다. (???? : )
			// 4. 계산 [출차시간 - 입차시간 => (분 - 30)/10 * 1000
			// 5. (수정)찾은 객체내 출차시간과 금액을 대입한다.
			
		return false;
		
	}
	
}
