package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ������Ʈ�ѷ� {


    // fxid<----> ��ü��[�ʵ� - �Ӽ� ]
    // fx�̺�Ʈ(�׼�) <----> �޼ҵ�[�ൿ]
    
    @FXML
    private Button ȸ�����Թ�ư;
    

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtname;  // fxid ��������

    @FXML
    void ȸ������(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String password = txtid.getText();
    	String txtname = txtid.getText();
    	
    	System.out.println("��ư ����");
    	System.out.println(id);
    	System.out.println(password);
    	System.out.println(txtname);
    }

}











