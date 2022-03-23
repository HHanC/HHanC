package TowerParking;
	
import java.util.Scanner;;

public class Menu {
	 
	State state = new State();
	 In in = new In();
	 Out out = new Out();
	 Manage manage = new Manage();

	 public Menu(){}
	 
	 public void play(Scanner s){
		 System.out.println("   << 주차 예약 프로그램 >>");
		 state.print_state();
		 select(state, s);
	 }
	 
	 public void select(State state, Scanner s){
	    
		 int l = 1;
		 try {
			 while(l != 4){ 
			
				 System.out.println("==============================================\n 1) 주차\n 2) 출차\n 3) 매출관리3\n 4) 종료");
				 l = s.nextInt();
	      
				 if(l==1){
					 System.out.println("==============================================\n * 주차를 선택하셨습니다. * ");
					 state.print_state();
					 in.in(state, s);
				 }  
				 else if(l==2){
					 System.out.println("==============================================\n * 출차를 선택하셨습니다. * ");
					 state.print_state();
					 out.out(state, s);
				 }
				 else if(l==3){
					 System.out.println("==============================================\n * 매출 관리를 선택하셨습니다. * ");
					 state.print_state();
					 manage.inform(state);
				 }
				 else if(l==4){
					 System.out.println("==============================================\n * 프로그램을 종료합니다. * ");
					 break;
				 }
				 else{
					 System.out.println("==============================================\n * 1, 2, 3, 4의 숫자 중에서 고르시오. * ");
				 }
			 }
	    }
	    catch (Exception e) {}
	 }
}