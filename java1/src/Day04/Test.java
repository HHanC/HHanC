package Day04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] ������ = { "[ ]" , "[ ]" , "[ ]" ,
							"[ ]","[ ]" , "[ ]" , 
							"[ ]","[ ]" , "[ ]" };
		
		while(true) {
			for( int i = 0 ; i<������.length; i++ ) {
				System.out.println( ������[i] );
				if(i % 3 == 2 ) System.out.println();
			}
			while( true ) {
				System.out.println();
			}
				
			
		}
		
	}
	
}
