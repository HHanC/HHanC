package dto;

public class porderdetail {

	private int orderdetailno;
	private int  orderdetailactive;
	private int  sno;
	private int  samount;
	private int  totalprice;
	private int  orderno;
	
	public porderdetail() {}
	
	public porderdetail(int orderdetailno, int orderdetailactive, int sno, int samount, int totalprice, int orderno) {
		super();
		this.orderdetailno = orderdetailno;
		this.orderdetailactive = orderdetailactive;
		this.sno = sno;
		this.samount = samount;
		this.totalprice = totalprice;
		this.orderno = orderno;
	}

	public int getOrderdetailno() {
		return orderdetailno;
	}

	public void setOrderdetailno(int orderdetailno) {
		this.orderdetailno = orderdetailno;
	}

	public int getOrderdetailactive() {
		return orderdetailactive;
	}

	public void setOrderdetailactive(int orderdetailactive) {
		this.orderdetailactive = orderdetailactive;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSamount() {
		return samount;
	}

	public void setSamount(int samount) {
		this.samount = samount;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	@Override
	public String toString() {
		return "porderdetail [orderdetailno=" + orderdetailno + ", orderdetailactive=" + orderdetailactive + ", sno="
				+ sno + ", samount=" + samount + ", totalprice=" + totalprice + ", orderno=" + orderno + "]";
	}
	
	
	
}
