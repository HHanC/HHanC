package TowerParking;
	
import java.util.Scanner;
import java.util.Date;

public class Out { 
	 
	public Out(){}
	
	void out(State state, Scanner s){
		int num = 0;   
		System.out.println("==============================================\n 주차 했던 곳의 번호를 고르시오.");
	    num = s.nextInt();
	     
	  try {
		   if(state.box[num].getNum() == " ■ "){
			   Date date = new Date();
			   state.box[num].setOut(date.toString());
			   state.box[num].out_time = System.currentTimeMillis ();
	    
			   System.out.println(" ("+num+")번 공간의 차량이 출차되었습니다.");

			   state.charge_inform(num);
			   state.init(num);
		   }
	   
		   	else{System.out.println("이미 출차가 되어있거나, 잘못된 번호를 누르셨습니다.");}
	  }
	  catch (Exception e) {}
	 state.print_state();
	}
}