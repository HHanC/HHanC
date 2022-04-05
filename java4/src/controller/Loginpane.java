package controller;

import java.net.URL;
import java.util.ResourceBundle;

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
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("패스워드 찾기 페이지로 이동");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("회원가입 페이지로 이동");
    	Login.instance.loadpage("/view/signuppane.fxml"); 
    	
    	
    	
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println("로그인 처리");
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
