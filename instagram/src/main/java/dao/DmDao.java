package dao;

public class DmDao extends Dao{

	public DmDao() {
		super();
	}
	
	public static DmDao dmDao = new DmDao();
	public static DmDao getDmDao() {return dmDao;}
	
	
	
}
