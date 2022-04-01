package application.Day22;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DB테스트컨트롤러 implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { 
		Day22_2 DB연동 = new Day22_2();
	}


    @FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnwrite;

    @FXML
    private Button btnget;

    @FXML
    private TextArea txtcontentlist;    

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB를 저장합니다.");
    	// fxid명.getText() : 해당 컨트롤에 입력된 값을 가져오기
    	String 작성자 = txtwriter.getText();
    	String 내용 = txtwriter.getText();
    	
    	// 1. DB 연동 객체 만들기
    	Day22_2 db연동 = new Day22_2();
    	// 2. DB 연동 객체 내에서 삽입[write] 메도스 호출
    	db연동.write(작성자, 내용);
    	boolean result = db연동.write(작성자, 내용);
    	// 3. 결과확인
    	if(result) {
    		System.out.println("[db에 데이터 저장 성공]");
    		// 성공시 컨트롤에 입력된 데이터 지워주기
    			// fxid명.setText() : 해당 컨트롤에 값 넣기
    		txtwriter.setText("");
    		txtcontent.setText("");
    	}else {
    		System.out.println("[db에 데이터 저장 실패]");
    	} 	
    }  
    @FXML
    void get(ActionEvent event) {
    	System.out.println("DB를 호출합니다.");
    	
    	// 1. db 연동 객체 만들기
    	Day22_2 db연동 = new Day22_2();
    	// 2. db 객체내 메소드 호출
    	ArrayList<데이터> 데이터목록 =  db연동.get();
    	
    	// 3. 리스트를 컨트롤에 넣어주기
    	for(데이터 temp : 데이터목록) {
    		// txtcontentlist.appendText : 해당 컨트롤에 내용 추가
    		txtcontentlist.appendText(
    				
    				temp.get번호() + ", " +
    				temp.get작성자() + " : " +
    				temp.get내용() + "\n"
    				
    				);
    	}
    	
    }
}












