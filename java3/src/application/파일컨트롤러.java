package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class 파일컨트롤러 {


    // fxid<----> 객체명[필드 - 속성 ]
    // fx이벤트(액션) <----> 메소드[행동]
    
    @FXML
    private Button 회원가입버튼;
    

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtname;  // fxid 가져오기

    @FXML
    void 회원가입(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String password = txtid.getText();
    	String txtname = txtid.getText();
    	
    	System.out.println("버튼 눌림");
    	System.out.println(id);
    	System.out.println(password);
    	System.out.println(txtname);
    }

}











