package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class Board implements Initializable {

    @FXML
    private Button btnwrite;
    
    @FXML
    private TableView<dto.Board> boardtable; // ���̺� ���� �ڷ��� ���� [ ���̺� �Խù� ǥ���ϱ����� ]
    
    public static dto.Board board;

    @FXML
    void accwrite(ActionEvent event) {
    	
    	Home.home.loadpage("/view/board/boardwrite.fxml");
    	
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	// 1. db���� ��� �Խù� ��������
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	// 2. tableview �� �߰�
    	TableColumn tc = boardtable.getColumns().get( 0 );
    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));  
    		// TableColumn : ���̺� // boardtable.getColumns().get(0); : 0��° �� ȣ��
    	
    	
    	
    	// 1.
    	tc = boardtable.getColumns().get(1); // ���� : ���� �ش� �� �� �����´� . 
    	// 2.
    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));   // �ش� ���� �ʵ尪�� �����Ѵ�..
    	   	    	    	
    	tc = boardtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));   	
    	
    	tc = boardtable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate")); 
    	
    	tc = boardtable.getColumns().get(4);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));  
    	
    	// 3. tableview �� list����
    	boardtable.setItems(boardlist);
    		
    	// tableview���� �ش� ���� Ŭ�������� �̺�Ʈ
    		// boardtable.setOnMouseClicked(); : ���̺��� Ŭ��������
    	boardtable.setOnMouseClicked( e -> {
    	// 1. ���̺��� Ŭ���� ��ü�� �ӽð�ü�� ����
    	board = boardtable.getSelectionModel().getSelectedItem(); 
    	// 2. ��ȸ�� ����
    	// 3. ������ ��ȯ
    	Home.home.loadpage("/view/board/boardview.fxml");
    	
    	});
    }
	
}














