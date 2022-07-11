package Dto;

public class MemberDto {

	private String M_NO;
	private String M_NAME;
	private String P_CODE;
	private String P_SCHOOL;
	private String M_JOMIN;
	private String M_CITY;
	private String V_CONFIRM;
	
	public MemberDto() {}

	public MemberDto(String m_NO, String m_NAME, String p_CODE, String p_SCHOOL, String m_JOMIN, String m_CITY) {
		super();
		M_NO = m_NO;
		M_NAME = m_NAME;
		P_CODE = p_CODE;
		P_SCHOOL = p_SCHOOL;
		M_JOMIN = m_JOMIN;
		M_CITY = m_CITY;
	}

	
	
	public String getV_CONFIRM() {
		return V_CONFIRM;
	}

	public void setV_CONFIRM(String v_CONFIRM) {
		V_CONFIRM = v_CONFIRM;
	}

	public String getM_NO() {
		return M_NO;
	}

	public void setM_NO(String m_NO) {
		M_NO = m_NO;
	}

	public String getM_NAME() {
		return M_NAME;
	}

	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}

	public String getP_CODE() {
		return P_CODE;
	}

	public void setP_CODE(String p_CODE) {
		P_CODE = p_CODE;
	}

	public String getP_SCHOOL() {
		return P_SCHOOL;
	}

	public void setP_SCHOOL(String p_SCHOOL) {
		P_SCHOOL = p_SCHOOL;
	}

	public String getM_JOMIN() {
		return M_JOMIN;
	}

	public void setM_JOMIN(String m_JOMIN) {
		M_JOMIN = m_JOMIN;
	}

	public String getM_CITY() {
		return M_CITY;
	}

	public void setM_CITY(String m_CITY) {
		M_CITY = m_CITY;
	}
	
	
	
}
