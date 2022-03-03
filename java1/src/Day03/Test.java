package Day03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 별 개수 : "); int s1 = scanner.nextInt();
		for( int i=1 ; i <= s1 ; i++) {
			System.out.print("*");
		}
		System.out.println(" 별 개수 : "); int s2 = scanner.nextInt();
		for( int i=1 ; i <= s2 ; i++) {
			System.out.print("*");
			if( i%5 == 0 ) System.out.println();
		}
		System.out.println(" 줄수 : "); int line3 = scanner.nextInt();
		for( int i = 1 ; i<=line3 ; i++) {
			for( int s = 1 ; s <= i ; s++) {
				
			}
		}
	}
	
}
