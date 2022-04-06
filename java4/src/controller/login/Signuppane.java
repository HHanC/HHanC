package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Signuppane implements Initializable {

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("뒤로가기 버튼을 눌렀습니다.");
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    	
    }

    @FXML
    void signup(ActionEvent event) {
    	// 컨트롤에 입력된 데이터 가져오기
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	String passwordcinfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String sine = format.format(new Date()); // 현재날짜를 형식 변환
    	
    	// 유효성검사
    		// 1. id 중복 체크
    	boolean result2 = MemberDao.memberDao.idcheck(id);
    	if(result2) {
    		lblconfirm.setText("사용중인 아이디 입니다.");
    		return;
    	}
    		// 2. id 길이 체크
    	if(id.length() < 4 || id.length() > 10) {
    		lblconfirm.setText("4~10 사이로 입력해주세요.");
    		return;
    	}
    		// 3. 비밀번호 길이 체크
    	if(password.length() < 4 || password.length() > 10 || passwordcinfirm.length() < 4 || passwordcinfirm.length() > 10) {
    		lblconfirm.setText("패스워드는 4~10 사이로 입력해주세요.");
    		return;
    	}
    		// 4. 비밀번호 일치 체크
    	if(!password.equals(passwordcinfirm)) {
    		lblconfirm.setText("비밀번호가 일치하지 않습니다.");
    		return;
    	}
    		// 5. 이메일 체크
    	if(email.indexOf("@") == -1) {
    		lblconfirm.setText("이메일 형식으로 입력해주세요");
    		return;
    	}
    		// 6. 주소체크
    	if(!(address.contains("시") && address.contains("구") && address.contains("동"))) {
    		lblconfirm.setText("시, 구, 동 포함!!");
    		return;
    	}
    	// 모든 유효성검사 통과시 DB에 저장
    		// 1. 객체화
    	Member member = new Member(0, id, passwordcinfirm, email, address, 0, sine);   			
    		// 2. DB에 저장
    	boolean result = MemberDao.memberDao.signup(member);
    	
    	if(result) {
    		// 1. 메시지창 출력
    		// 2. 화면 전환
    		Login.instance.loadpage("/view/login/loginpane.fxml");
    	}else {
    		lblconfirm.setText("DB오류");
    		return;
    	}
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // 처음 실행시 문구 없애기
	}
	
}






