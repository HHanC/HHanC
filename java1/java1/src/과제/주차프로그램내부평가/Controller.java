package 과제.주차프로그램내부평가;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

	public static ArrayList<Car> carlist = new ArrayList<>(); // Array배열의 생성자를 불러와 메모리 할당을 하고 carlist배열 객체에 값을 넣으면 메모리에 저장할 수 있게 해준다.
	
	public static boolean 입차(String 차량번호) { // boolean 자료형으로 입차 메소드를 생성, 입차 메소드에는 입력받은 차량번호가 들어옴
		
		for(Car temp : carlist) { // Car 클래스의 값을 temp에 저장하고 carlist배열 객체랑 비교하여 중복체크를 한다.	
			if(temp.get차량번호().equals(차량번호)) { // Car객체에 있는 차량번호랑 입력받은 차량번호가 같다면 return값으로 false;
				return false;
			}
		}
		LocalDate 날짜 =  LocalDate.now(); // LocalDate클래스 안에 접근제한자를 통해서 now메소드를 불러온다. 날짜라는 변수에 현재 날짜가 들어가게 해준다.
		LocalTime 입차시간 =  LocalTime.now(); // LocalTime클래스 안에 접근제한자를 통해서 now메소드를 불러온다. 입차시간이라는 변수에 현재 시간을 들어가게 해준다.
		
		Car car = new Car(날짜, 차량번호, 입차시간, null, 0); // Car클래스안에 Car생성자의 날짜, 차량번호, 입차시간, 출차시간, 금액 순으로 입력값을 저장해준다.
		carlist.add(car); // 접근제한자를 통해서 add메소드에 접근하여 car변수를 carlist배열에 저장한다.
		return true;
		
	}
	public static boolean 출차(String 차량번호) {
		
		
		for(Car temp : carlist) { // temp의 값과 carlist배열의 값을 비교하여 
			if(temp.get차량번호().equals(차량번호)) { // Car 클래스에 저장된 차량번호와 입력받은 차량번호가 같다면
				return false; // return false를 반환한다.
			}			
		}
		
		LocalDate 날짜 = LocalDate.now(); // 출차 당일의 날짜 출력
		LocalTime 출차시간 = LocalTime.now(); // 출차 당일의 시간을 출력
		
		Car car = new Car(날짜, 차량번호, null, 출차시간, 0); // 입력받은 차량번호를 car객체에 저장한다.
		carlist.add(car); // carlist배열에 car객체에 저장되어있는 차량번호를 저장한다.
		
		return true; // return true를 반환한다.
	}
}











