package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Board implements Initializable {

    @FXML
    private TableView<dto.Board> boardtable;

    @FXML
    private Button btnwrite;

    @FXML
    void accwrite(ActionEvent event) {
    	Main.main.loadpage("/view/boardwrite.fxml");
    }
    
    public static dto.Board board;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
		
		TableColumn tc = boardtable.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("nnum"));
		
		tc = boardtable.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("ntitle"));
		
		tc = boardtable.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("nwrite"));
		
		tc = boardtable.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("ndate"));	
	
		boardtable.setItems(boardlist);
		
		boardtable.setOnMouseClicked(e -> {
			
			board = boardtable.getSelectionModel().getSelectedItem(); // 클릭된 board 객체 호출
			
			Main.main.loadpage("/view/boardview.fxml");
			
		});
	
	}
}








