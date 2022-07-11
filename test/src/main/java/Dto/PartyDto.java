package Dto;

public class PartyDto {

	private String P_CODE;
	private String P_NAME;
	private String P_INDATE;
	private String P_READER;
	private String P_TEL1;
	private String P_TEL2;
	private String P_TEL3;
	
	public PartyDto() {}

	public PartyDto(String p_CODE, String p_NAME, String p_INDATE, String p_READER, String p_TEL1, String p_TEL2,
			String p_TEL3) {
		super();
		P_CODE = p_CODE;
		P_NAME = p_NAME;
		P_INDATE = p_INDATE;
		P_READER = p_READER;
		P_TEL1 = p_TEL1;
		P_TEL2 = p_TEL2;
		P_TEL3 = p_TEL3;
	}

	public String getP_CODE() {
		return P_CODE;
	}

	public void setP_CODE(String p_CODE) {
		P_CODE = p_CODE;
	}

	public String getP_NAME() {
		return P_NAME;
	}

	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}

	public String getP_INDATE() {
		return P_INDATE;
	}

	public void setP_INDATE(String p_INDATE) {
		P_INDATE = p_INDATE;
	}

	public String getP_READER() {
		return P_READER;
	}

	public void setP_READER(String p_READER) {
		P_READER = p_READER;
	}

	public String getP_TEL1() {
		return P_TEL1;
	}

	public void setP_TEL1(String p_TEL1) {
		P_TEL1 = p_TEL1;
	}

	public String getP_TEL2() {
		return P_TEL2;
	}

	public void setP_TEL2(String p_TEL2) {
		P_TEL2 = p_TEL2;
	}

	public String getP_TEL3() {
		return P_TEL3;
	}

	public void setP_TEL3(String p_TEL3) {
		P_TEL3 = p_TEL3;
	}
	
	
	
}
