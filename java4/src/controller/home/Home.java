package controller.home;

import java.awt.Label;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class Home implements Initializable {

	@FXML
	private Label lblloginid;
	
	@FXML
	private Label lblpoint;
	
	@FXML
	private Label lbllogout;
	
	@FXML
	private Label lbldelete;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText(Login.member.getMid() + "��");
		lblpoint.setText("����Ʈ : " + Login.member.getMpoint()+"��");
	}
	
	@FXML
	public void logout(MouseEvent e) {
		// 1. Login ���� �����
		Login.member = null;
		// 2. ������ ��ȯ
		Main.instance.loadpage("/view/login/login.fxml");
	}
	
	@FXML
	public void delete(MouseEvent e) {
		
		// 1. �޽���
		Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ��,��� ��ư Ÿ��
			alert.setHeaderText("���� Ż�� �Ͻðڽ��ϱ�?");
		// 2. ��ư Ȯ��
		Optional<ButtonType> optional = alert.showAndWait(); // ����
		if(optional.get() == ButtonType.OK) { // Ȯ�� ��ư�� ��������
			// ȸ��Ż�� ����
			boolean result = MemberDao.memberDao.delete(Login.member.getMnum());
							// ���� �α������� ȸ���� ��ȣ ȣ��
			if(result) { // Ż�� ����
				
				// �α׾ƿ� [Login Ŭ������ Member��ü null ���� ȣ��]
				Login.member = null;
				// ������ ��ȯ
				Main.instance.loadpage("/view/login/login.fxml");
			}else { // Ż�� ����
				
			}
		}
		
	}	
}









