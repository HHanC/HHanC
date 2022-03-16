package 과제;

import java.util.Scanner;

import Day11.학생;

public class 평가 {

	//
	
	public static void main(String[] args) {
		// 배열
		// String[] 학생배열 = new String[100];
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("--------------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표");
				System.out.println("--------------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("--------------------------------------------------------------------");
				// 학생 점수 출력 [모든 배열 출력]
				
				System.out.println("1. 학생점수 등록 2. 학생점수 삭제");
				int 번호 = scanner.nextInt();
				
				if(번호 == 1) { // 학생 목록
					System.out.println("");
				}else if(번호 == 2) { // 학생 삭제
					
				}else {
				
				}
			}catch(Exception e) {
				
			}
		}
	}
	
}
