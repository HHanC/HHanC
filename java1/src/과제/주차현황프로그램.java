package 과제;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 주차현황프로그램 {

//	1. 주차 현황표는 항상 출력이 되어 있도록 합니다. [10점]
//			* 입차시 출차시간은 주차중이며 출차시 시간을 대입합니다.
//			* 출차가 아닌 차는 주차중으로 표시하고 출하를 진행한 차량은 출차시간을 표시합니다.
//			* 금액은 주차중이면 정산전 으로 표시하고 출차시간이 존재할 경우 금액을 표시합니다.
//
//			2. 메뉴에서 1번 선택시 입차를 합니다. [10점]
//			* 입차시 : 차량번호만 입력받습니다.[날짜, 입차시간, 출차시간, 금액은 입력받지 않습니다.]
//			* 임의로 5개의 차량을 등록하여 표시하시오.
//
//			3. 메뉴에서 2번 선택시 출차를 합니다. [10점]
//			* 출차시 : 차량번호만 입력받습니다.
//			* 출차시 주차 현황표에서 출차시간을 대입하고 금액을 계산하여 표시합니다.
//
//			4. 데이터는 키보드로 입력받아 차량 객체를 배열 및 리스트에 저장합니다.[5점]
//
//			5. 입차시간과 출차시간을 계산하여 금액을 구하시오. [10점]
//			* 최초 30분 무료 [10분당 1,000원]
//
//			6. 파일처리는 하지 않습니다.
//
//			7. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다.[5점]
	
	
	// 1. 주차현황표 v
	// 2. 메뉴 1번 // 차량 번호만 입력받기 나머지는 입력받지 않음 임의로 5개의 차량 등록
	// 2-1 입차 입력하고 데이터 현황표로 옮기기
	// 3. 메뉴 2번
	public static void main(String[] args) {
		
		while(true) {
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date time = new Date();			
			String time1 = format1.format(time);
			Scanner scanner = new Scanner(System.in);
			String[] car = new String[5];
			
			try {
				System.out.println("------------------주차현황표------------------");
				System.out.println("\t현재 시간 : " + time1);	
				System.out.println("날짜\t차량번호\t입차시간\t출차시간\t금액");
				for(int i=0; i<car.length; i++) {
					if(car[i] != null) {
						System.out.println(time1+"\t"+car[i]+"\t"+);
					}
				}
				System.out.println("--------------------------------------------");
				System.out.println("\t1. 입차\t\t2. 출차"); int ch = scanner.nextInt();
				
				if(ch == 1) {
					
					System.out.println("차량번호 : "); String carnum = scanner.next();
					for(int i=0; i<car.length; i++) {
						if(car[i] != null && car[i].equals(carnum)) {
							car[i] = carnum;
						}
					}
					
				}else if(ch == 2) {
					
				}else {
					System.out.println("알 수 없는 행동입니다.");
				}
				
			}catch (Exception e) {}
		}
		
	}
}
