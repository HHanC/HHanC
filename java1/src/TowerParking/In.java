package TowerParking;
	import java.util.Scanner;
	import java.util.Date;

	public class In {
	 Date date = new Date();
	 
	 public In(){
	 }
	 void in(State state, Scanner s){
	  int num = 0;
	  String name = "";
	  String car_num = "";   
	  
	  System.out.println("==============================================\n 주차 할 곳의 번호를 고르시오.");
	     num = s.nextInt();
	     
	  if(state.box[num].getNum() != " ■ "){
	   System.out.print("이름 : ");
	   name = s.next();
	   
	   System.out.print("차량번호 : ");
	   car_num = s.next();
	   
	   state.box[num].setName(name);
	   state.box[num].setCar_num(car_num);
	   state.box[num].setNum(" ■ ");
	   state.box[num].setIn(date.toString());
	   state.box[num].in_time = System.currentTimeMillis ();
	   state.box[num].out_time = System.currentTimeMillis ();
	   
	   System.out.println(" ("+num+")번 공간에 차량이 주차되었습니다.");
	  }
	  else{
	   System.out.println("이미 주차가 되어있거나, 잘못된 번호를 누르셨습니다.");
	  }
	  state.print_state();
	 }
	}