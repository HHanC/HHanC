package controller;

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
    	System.out.println("�ڷΰ��� ��ư�� �������ϴ�.");
    	Login.instance.loadpage("/view/loginpane.fxml");
    	
    }

    @FXML
    void signup(ActionEvent event) {
    	// ��Ʈ�ѿ� �Էµ� ������ ��������
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	String passwordcinfirm = txtpasswordconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	String sine = format.format(new Date()); // ���糯¥�� ���� ��ȯ
    	
    	// ��ȿ���˻�
    		// 1. id �ߺ� üũ
    		// 2. id ���� üũ
    	if(id.length() < 4 || id.length() > 10) {
    		lblconfirm.setText("4~10 ���̷� �Է����ּ���.");
    		return;
    	}
    		// 3. ��й�ȣ ���� üũ
    	if(password.length() < 4 || password.length() > 10 || passwordcinfirm.length() < 4 || passwordcinfirm.length() > 10) {
    		lblconfirm.setText("�н������ 4~10 ���̷� �Է����ּ���.");
    		return;
    	}
    		// 4. ��й�ȣ ��ġ üũ
    	if(!password.equals(passwordcinfirm)) {
    		lblconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
    		return;
    	}
    		// 5. �̸��� üũ
    	if(email.indexOf("@") == -1) {
    		lblconfirm.setText("�̸��� �������� �Է����ּ���");
    		return;
    	}
    		// 6. �ּ�üũ
    	if(address.contains("��") && address.contains("��") && address.contains("��")) {
    		lblconfirm.setText("��, ��, �� ����!!");
    		return;
    	}
    	// ��� ��ȿ���˻� ����� DB�� ����
    		// 1. ��üȭ
    	Member member = new Member(0, id, passwordcinfirm, email, address, 0, sine);   			
    		// 2. DB�� ����
    	boolean result = MemberDao.memberDao.signup(member);
    	
    	if(result) {
    		System.out.println("���Լ���");
    	}else {
    		System.out.println("���Խ���");
    	}
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}






