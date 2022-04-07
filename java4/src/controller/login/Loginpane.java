package controller.login;

import java.net.URL;
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

public class Loginpane implements Initializable {


    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println("아이디 찾기 페이지로 이동");
    	Login.instance.loadpage("/view/login/findid.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("패스워드 찾기 페이지로 이동");
    	Login.instance.loadpage("/view/login/password.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("회원가입 페이지로 이동");
    	Login.instance.loadpage("/view/login/signuppane.fxml"); 
    	
    	
    	
    }

    @FXML
    void login(ActionEvent event) {
    	
    	// 1. 컨트롤에 입력된 값 가져오기
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	// 2. db객체내 메소드 호출
    	boolean result = MemberDao.memberDao.login(id, password);
    	// 3. 결과 확인
    	if(result) {
    		// 페이지 전환
    		// 테스트
    		lblconfirm.setText("로그인 성공");
    	}else {
    		lblconfirm.setText("동일한 회원 정보가 없습니다.");
    	}
    	
    }
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lblconfirm.setText(""); // 처음 실행시 문구 숨기기
		
	}
	
}










