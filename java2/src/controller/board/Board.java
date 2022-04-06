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
    private TableView<dto.Board> boardtable; // 테이블에 넣을 자료형 선택 [ 테이블에 게시물 표시하기위해 ]
    
    public static dto.Board board;

    @FXML
    void accwrite(ActionEvent event) {
    	
    	Home.home.loadpage("/view/board/boardwrite.fxml");
    	
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	// 1. db에서 모든 게시물 가져오기
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	// 2. tableview 에 추가
    	TableColumn tc = boardtable.getColumns().get( 0 );
    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));  
    		// TableColumn : 테이블열 // boardtable.getColumns().get(0); : 0번째 열 호출
    	
    	
    	
    	// 1.
    	tc = boardtable.getColumns().get(1); // 순서 : 먼저 해당 열 을 가져온다 . 
    	// 2.
    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));   // 해당 열에 필드값을 설정한다..
    	   	    	    	
    	tc = boardtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));   	
    	
    	tc = boardtable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate")); 
    	
    	tc = boardtable.getColumns().get(4);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));  
    	
    	// 3. tableview 에 list연결
    	boardtable.setItems(boardlist);
    		
    	// tableview에서 해당 셀을 클릭했을때 이벤트
    		// boardtable.setOnMouseClicked(); : 테이블을 클릭했을때
    	boardtable.setOnMouseClicked( e -> {
    	// 1. 테이블에서 클릭한 객체를 임시객체에 저장
    	board = boardtable.getSelectionModel().getSelectedItem(); 
    	// 2. 조회수 증가
    	// 3. 페이지 전환
    	Home.home.loadpage("/view/board/boardview.fxml");
    	
    	});
    }
	
}














