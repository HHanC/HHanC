package dto;

public class Follow {

	private int fno;
	private int followingmno;
	private int followermno;
	private String fdate;
	
	public Follow() {}

	public Follow(int fno, int followingmno, int followermno, String fdate) {
		super();
		this.fno = fno;
		this.followingmno = followingmno;
		this.followermno = followermno;
		this.fdate = fdate;
	}

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	public int getFollowingmno() {
		return followingmno;
	}

	public void setFollowingmno(int followingmno) {
		this.followingmno = followingmno;
	}

	public int getFollowermno() {
		return followermno;
	}

	public void setFollowermno(int followermno) {
		this.followermno = followermno;
	}

	public String getFdate() {
		return fdate;
	}

	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	@Override
	public String toString() {
		return "Follow [fno=" + fno + ", followingmno=" + followingmno + ", followermno=" + followermno + ", fdate="
				+ fdate + "]";
	}
	
	
}
