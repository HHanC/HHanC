package Dto;

public class VoteDto {

	private String V_JUMIN;
	private String V_NAME;
	private String M_NO;
	private String V_TIME;
	private String V_AREA;
	private String V_CONFIRM;
	
	public VoteDto() {}

	public VoteDto(String v_JUMIN, String v_NAME, String m_NO, String v_TIME, String v_AREA, String v_CONFIRM) {
		super();
		V_JUMIN = v_JUMIN;
		V_NAME = v_NAME;
		M_NO = m_NO;
		V_TIME = v_TIME;
		V_AREA = v_AREA;
		V_CONFIRM = v_CONFIRM;
	}

	public String getV_JUMIN() {
		return V_JUMIN;
	}

	public void setV_JUMIN(String v_JUMIN) {
		V_JUMIN = v_JUMIN;
	}

	public String getV_NAME() {
		return V_NAME;
	}

	public void setV_NAME(String v_NAME) {
		V_NAME = v_NAME;
	}

	public String getM_NO() {
		return M_NO;
	}

	public void setM_NO(String m_NO) {
		M_NO = m_NO;
	}

	public String getV_TIME() {
		return V_TIME;
	}

	public void setV_TIME(String v_TIME) {
		V_TIME = v_TIME;
	}

	public String getV_AREA() {
		return V_AREA;
	}

	public void setV_AREA(String v_AREA) {
		V_AREA = v_AREA;
	}

	public String getV_CONFIRM() {
		return V_CONFIRM;
	}

	public void setV_CONFIRM(String v_CONFIRM) {
		V_CONFIRM = v_CONFIRM;
	}
	
	
	
}
