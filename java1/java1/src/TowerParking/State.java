package TowerParking;

import java.util.Date;

public class State { 
	
	final static int MAX = 12;
	Date date = new Date();
	 
	public Box box[] = new Box[MAX];
	 
	public State(){
		this.create(MAX);
	}

	public void create(int a){
		for(int i=0; i<a; i++){
			box[i] = new Box();
		}
	  
		for(int i=0; i<a; i++){
			box[i].setNum("("+i+")");
	   //나머지 것들 초기값?
		}
	}
	 
	public void print_state(){
		System.out.println("==============================================\n << 현재 주차장 상태 >>");
		for(int i=0; i<MAX/3; i++){
			System.out.print("["+box[i].getNum()+"]");
		}
		System.out.println();
		for(int i=MAX/3; i<MAX/3*2; i++){
			System.out.print("["+box[i].getNum()+"]");
		}
		System.out.println();
		
		for(int i=MAX/3*2; i<MAX; i++){
			System.out.print("["+box[i].getNum()+"]");
		}
		System.out.println();
	 	}
	 
	public void init(int a){
		box[a].setNum("("+a+")");
		box[a].setName("");
		box[a].setCar_num("");
		box[a].setIn("");
		box[a].setOut("");
		box[a].setCharge(0);
	}
	 
	public void charges(int a){
		if(box[a].getNum() == " ■ "){			
			if((int)(box[a].out_time - box[a].in_time)>=(int)((box[a].out_time - box[a].in_time)/1000)*3000) {
				box[a].charge = ((int)((box[a].out_time - box[a].in_time)/1000))*1000;
			}
		}
	}
	 
	public void charge_inform(int i){
		System.out.println("==============================================\n [ "+i+" ]");
		System.out.println("주차시간 : "+box[i].getIn());
		System.out.println("출차시간 : "+box[i].getOut());
		
		if(box[i].getNum() == " ■ "){
			box[i].out_time = System.currentTimeMillis ();
		}
		charges(i);
		System.out.println("주차요금 : "+box[i].getCharge()+"원");
	 }
}