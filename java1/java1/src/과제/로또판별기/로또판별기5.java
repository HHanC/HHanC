package 과제.로또판별기;

import java.util.Random;
import java.util.Scanner;

public class 로또판별기5 {

	/* 로또 판별기 
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	
	public static void main(String[] args) {
		
		int[] 사용자번호 = new int[6];
		int[] 추첨번호 = new int[6];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.print("1~45 입력 : ");
			int 번호 = scanner.nextInt();
			
			boolean 통과 = true;
			
			if(번호 < 1 || 번호 > 45) {
				System.out.println("알 수 없는 번호입니다. (재입력)");
				i--;
				통과 = false;
			}
			for(int j = 0; j<6; j++) {
				for(int temp : 사용자번호) {
					if(temp == 사용자번호[i]) {
						System.out.println("중복된 번호 입니다.(재입력)");
						i--;
						통과 = false;
					}
				}
			}
			if(통과 == true) {
				사용자번호[i] = 번호;
			}
			
			for(int temp : 사용자번호) {
				System.out.print("사용자가 선택한 번호 : ");
				System.out.println(temp);
			}									
		}
		for(int i=0; i<6; i++) {
			Random random = new Random();
			int 추첨 = scanner.nextInt(45)+1;
			
			boolean 통과 = true;
			for(int temp : 추첨번호) {
				if(temp == 추첨번호[i]) {
					i--;
					통과 = false;
				}
			}	
			if(통과 == true) {
				추첨번호[i] = 추첨;
			}
		}
		System.out.println("추첨번호");
		for(int temp : 추첨번호) {
			System.out.println(temp);
		}
		int 동일한수 = 0;
		for(int 비교기준 : 사용자번호) {
			for(int 비교대상 : 추첨번호) {
				if(비교기준 == 비교대상) {
					동일한수++;
				}
			}
		}
		System.out.println("동일한 수 : " + 동일한수);
	}
	
}
