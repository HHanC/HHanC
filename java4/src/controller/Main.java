package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application.Parameters;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class Main implements Initializable {
					// Initializable �������̽� : �� ����� �ʱⰪ �޼ҵ� ����  
	@FXML
    private BorderPane boarderPane; // �� �������� ���� �����̳� ��ü
	
	@Override // �ʱⰪ �޼ҵ� ����
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadpage("/view/login/login"); // �帧�� �򰥸�
	}
	
	public void loadpage(String page) { // page = "/view/login" 
		try {
			// ������(fxml) ��üȭ
			Parent parent = FXMLLoader.load(getClass().getResource(page + ".fxml"));
																//   /view/login.fxml
			boarderPane.setCenter(parent); // ���������� �������� �����Ͱ��� �ش� �������������� ��ȯ 
		}catch (Exception e) {System.out.println("������ ���� ����" + e);}
	}	
}
