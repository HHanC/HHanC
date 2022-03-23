package TowerParking;

import java.util.Date;

public class Box {
 
	Date date = new Date();
	 
	private String num = "";
	private String name = "";
	private String car_num = "";
	private String in = "";
	private String out = "";
	 
	public long in_time = System.currentTimeMillis();
	public long out_time = System.currentTimeMillis ();
	
	int charge = 0;
	 
	 public String getNum() {
	  return num;
	 }
	 public void setNum(String num) {
	  this.num = num;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getCar_num() {
	  return car_num;
	 }
	 public void setCar_num(String car_num) {
	  this.car_num = car_num;
	 }
	 public String getIn() {
	  return in;
	 }
	 public void setIn(String in) {
	  this.in = in;
	 }
	 public String getOut() {
	  return out;
	 }
	 public void setOut(String out) {
	  this.out = out;
	 }
	 public int getCharge() {
	  return charge;
	 }
	 public void setCharge(int charge) {
	  this.charge = charge;
	 }
	}