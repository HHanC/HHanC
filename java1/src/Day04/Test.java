package Day04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] 게임판 = { "[ ]" , "[ ]" , "[ ]" ,
							"[ ]","[ ]" , "[ ]" , 
							"[ ]","[ ]" , "[ ]" };
		
		while(true) {
			for( int i = 0 ; i<게임판.length; i++ ) {
				System.out.println( 게임판[i] );
				if(i % 3 == 2 ) System.out.println();
			}
			while( true ) {
				System.out.println();
			}
				
			
		}
		
	}
	
}
