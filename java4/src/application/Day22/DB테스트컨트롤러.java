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

public class DB�׽�Ʈ��Ʈ�ѷ� implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Day22_2 DB���� = new Day22_2();
	}

    @FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnget;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontentlist;

    

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB�� �����͸� �����մϴ�.");
    	
    	// fxid��.getText() : �ش� ��Ʈ�ѿ� �Էµ� ���� ��������
    	String �ۼ��� = txtwriter.getText();
    	String ���� = txtcontent.getText();
    	
    	// db���� ��ü �����
    	Day22_2 db���� = new Day22_2();
    	// db���� ��ü ������ ���� �޼ҵ� ȣ��
    	boolean result = db����.write(�ۼ���, ����);
    	
    	if(result) {
    		System.out.println("db�� ������ ���� ����");
    		
    		txtwriter.setText(""); // ������ �Է�â �������� ����
    		txtcontent.setText("");
    		
    	}else {
    		System.out.println("db�� ������ ���� ����");
    	}   	
    }
    
    @FXML
    void get(ActionEvent event) {
    	System.out.println("DB�� �����͸� ȣ���մϴ�.");
    	
    	// db���� ��ü �����
    	Day22_2 db���� = new Day22_2();
    	// db��ü �� �޼ҵ� ȣ��
    	ArrayList<������> �����͸�� = db����.get();
    	// ����Ʈ�� ��Ʈ�ѿ� �־��ֱ�
    	for(������ temp : �����͸��) {
    		// txtcontentlist.appendText : �ش� ��Ʈ�ѿ� ���� �߰�
    		txtcontentlist.appendText(
    				temp.get��ȣ() +". "+
    				temp.get�ۼ���() +":"+
    				temp.get����() + "\n"
    				);
    	}
    }
}








