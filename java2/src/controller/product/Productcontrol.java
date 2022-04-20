package controller.product;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Productcontrol implements Initializable {
						// �������̽�=�����ϴ�
    @FXML
    private Button btnadd;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    private VBox vbox;

    @FXML
    private TextField txtserch;

    @FXML
    private Button btnserch;

    @FXML
    void serch(ActionEvent event) { // �˻� ��ư ��������
    	
//    	String serch = txtserch.getText(); // �˻�â�� �Էµ� ������ ��������
//    	show(serch); // �Է��� �˻�� show �޼ҵ忡 �־��ֱ�
    }
    
    void show() {
		 
    	if(vbox.getChildren().isEmpty() == false) { // .isEmpty() : �ش� ��ü�� ����ִ��� Ȯ��[vbox �� ����ִ��� Ȯ��]
    		// vbox�� ��ü�� ������� ������
    		vbox.getChildren().remove(0); // vbox�� ���� ��ü�� ����;
    		}
    	
    	// 1. ��� ��ǰ ��������
    	ArrayList< Product > mlist = ProductDao.productDao.list(Home.category);
    			System.out.println(mlist);
    			// 2. �׸��� Ŭ���� [ ��/�� ]
    			GridPane gridPane = new GridPane();
    				// * �׸��� ����
    				gridPane.setPadding( new Insets(10) );
    				// * �׸��峻 �� ���� 
    				gridPane.setHgap(20);
    				gridPane.setHgap(20);

    			// 3. �ݺ��� 
    			int i = 0 ; // �ε����� ����
    			for( int row = 0 ; row < mlist.size()/3  ; row++ ) { // ��
    				for( int col = 0 ; col<3 ; col++ ) { // ��
    					
    					// 1. �̹���

    					ImageView imageView = new ImageView( new Image(mlist.get(i).getPimg() ) );
    						System.out.println(mlist.get(i).getPimg());
    						// *�̹��� ������ 
    						imageView.setFitWidth(250);		// �̹��� ���α��� 
    						imageView.setFitHeight(200); 	// �̹��� ���α���
    					// 2. ��ư ���� ( ��ư�� �̹��� �ֱ� )
    					Button button = new Button( null , imageView );
    						// *��ư ������� [ transparent : ����� ]
    						button.setStyle("-fx-background-color:transparent");
    						// *��ư id���ֱ� [ ��ǰ �ĺ� = index ]
    						button.setId( i+"" );
    						System.out.print(i);
    						// *��ư Ŭ���̺�Ʈ
    							//	button.setOnAction( e -> { } ); // ���ٽ� : �μ� -> { �����ڵ� }
    						button.setOnAction( e -> { 
    							// 1. Ŭ���� ��ư�� id ��������
    							
    							int id = Integer.parseInt(  e.toString().split(",")[0].split("=")[2] );
    							
    							// 2. Ŭ���� ��ǰ ��ȣ ���� 
    							select = mlist.get(id);
    							// 3. ȭ�� ��ȯ
//    							Main.main.loadpage("/view/#3time.fxml");
    						} );
    					gridPane.add( button  , col , row); // �׸��峻  �ش� ����ȣ , ���ȣ �� ��ư �߰�
    					
    					i++; //�ε��� ����
    				}
    			}
 }
    
    @FXML
    void accadd(ActionEvent event) {
    	Home.home.loadpage("/view/product/productadd.fxml");
    }
    
    public static Product select ; // ���õ� ��ư�� ��ǰ ����

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		show(null); // ȭ���� ó�� ���������� �˻��� null �־��ֱ�
		show();
	}
}






























