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
					// Initializable 인터페이스 : 뷰 실행시 초기값 메소드 제공  
	@FXML
    private BorderPane boarderPane; // 씬 빌더에서 만든 컨테이너 객체
	
	@Override // 초기값 메소드 정의
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadpage("/view/login/login"); // 흐름이 헷갈림
	}
	
	public void loadpage(String page) { // page = "/view/login" 
		try {
			// 페이지(fxml) 객체화
			Parent parent = FXMLLoader.load(getClass().getResource(page + ".fxml"));
																//   /view/login.fxml
			boarderPane.setCenter(parent); // 메인페이지 보더팬의 센더터값을 해당 에프엑스엠엘로 변환 
		}catch (Exception e) {System.out.println("페이지 연결 실패" + e);}
	}	
}
