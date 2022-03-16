package 과제;

import java.util.Arrays;
import java.util.Scanner;

import Day09.Student;

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
				
				for(int i=0; i<학생배열.length; i++) {
					if(학생배열[i] != null) {
						학생배열[i] = 학생;
					}
				}
				
				System.out.println("1. 학생점수 등록 2. 학생점수 삭제");
				int ch = scanner.nextInt();
				
				if(ch == 1) { // 학생 목록
					System.out.println("번호 : ");
					int 번호 = scanner.nextInt();
					System.out.println("이름 : ");
					String 이름 = scanner.next();
					System.out.println("국어 : ");
					int 국어 = scanner.nextInt();
					System.out.println("영어 : ");
					int 영어 = scanner.nextInt();
					System.out.println("수학 : ");
					int 수학 = scanner.nextInt();
					
					학생 학생 = new 학생(번호, 이름, 국어, 영어, 수학);
					for(int i=0; i<학생배열.length; i++) {
						if(학생배열[i]== null) {
							학생배열[i] = 학생;
							break;
						}
					}
					
				}else if(ch == 2) { // 학생 삭제
					
				}else {
					System.out.println("알 수 없는 행동입니다.");
				}
			}catch(Exception e) {}
		}
	}
	
}
