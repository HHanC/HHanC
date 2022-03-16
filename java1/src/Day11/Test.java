package Day11;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("----------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표");
				System.out.println("----------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("----------------------------------------------------------------");
				double 평균 = 0;
				for(int i=0; i<학생배열.length; i++) {
					if(학생배열[i] != null) {
						평균 = 학생배열[i].총점/3;
						System.out.println(학생배열[i].번호+ "\t" + 학생배열[i].이름+ "\t" + 학생배열[i].국어+ "\t" + 학생배열[i].영어+ "\t" + 학생배열[i].수학+ "\t" + 학생배열[i].총점+ "\t" + 평균 );
					}
				}
				
				System.out.println("----------------------------------------------------------------");
				System.out.println("1. 학생점수 등록 2. 학생점수 삭제");
				int ch = scanner.nextInt();
				
				
				if(ch == 1) {			
					System.out.print("번호 : ");
					int 번호 = scanner.nextInt();			
					System.out.print("이름 : ");
					String 이름 = scanner.next();			
					System.out.print("국어 : ");
					int 국어 = scanner.nextInt();			
					System.out.print("영어 : ");
					int 영어 = scanner.nextInt();		
					System.out.print("수학 : ");
					int 수학 = scanner.nextInt();
					int 총점 = 0;
					총점 = (국어 + 영어 + 수학);
					학생 학생 = new 학생(번호, 이름, 국어, 영어, 수학, 총점);
					for(int i=0; i<학생배열.length; i++){						
						if(학생배열[i] == null) {
							학생배열[i] = 학생;
							break;
						}						
					}															
				}else if(ch == 2) {
					
				}else {
					System.out.println("알 수 없는 행동입니다.");
				}
			}catch(Exception e) {}
		}
	}
	
}
