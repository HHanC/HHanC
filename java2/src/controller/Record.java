package controller;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import dao.MemberDao;
import dao.ProductDao;
import dto.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Record implements Initializable {

	@FXML
	private Label lblmtotal;
	
	@FXML
	private Label lblptotal;
	
	@FXML
	private Label lblbtotal;
	
    @FXML
    private BarChart mbc;

    @FXML
    private BarChart pbc;

    @FXML
    private BarChart bbc;

    @FXML
    private PieChart ppc;
    
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// ��ü ȸ����
		int mtotal = MemberDao.memberDao.membertotal("member");
		lblmtotal.setText(mtotal + "��");
		// ��ü ��ǰ��
		int ptotal = MemberDao.memberDao.membertotal("product");
		lblptotal.setText(ptotal + "��");
		// ��ü �Խù���
		int btotal = MemberDao.memberDao.membertotal("board");
		lblbtotal.setText(btotal + "��");
		
		// ��¥���� ȸ�� ���� ��
		// 1. xy�� �迭 ����
		XYChart.Series series = new XYChart.Series<>(); // 1. xy�� �迭 ����
			// XYChart.Series : �迭 Ŭ����
				// XYChart.Data : �迭 ������ Ŭ���� [x���ǰ�, y���ǰ�]
			// ��¥���� ȸ������ �� üũ [2022.04.11 , 3]
			// Map �÷��� => Ű(��¥), ��(���Լ�) ���� �ϳ��� ��Ʈ�� ����
			// 2. DB���� ������ ��������
			Map<String, Integer> map = MemberDao.memberDao.datetotal("member", "msince");
			System.out.println(map);
			// �ݺ���
			// 3. �����͸� �迭�� �߰�
			for(String key : map.keySet()) {
				// 3-1 : ������ �迭 ����(������ : key=��¥, value = �����ڼ�)
				XYChart.Data data = new XYChart.Data<>(key,map.get(key));
				// 3-2 : �ش� ������ ��ü�� �迭�� �߰�
				series.getData().add(data);
			}
			// ������Ʈ
			// 4. �ش� �迭�� ������Ʈ�� �߰�
			mbc.getData().add(series);
		
			// 1. �迭 ����
			XYChart.Series series2 = new XYChart.Series<>();
			Map<String, Integer> map2 = MemberDao.memberDao.datetotal("board", "bdate");
			System.err.println(map2);
			// 2. ������ ����
			for(String key : map2.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
				// 3. �迭�� ������ �߰�
				series2.getData().add(data);
			}
			// 4. ��Ʈ�� �迭 �߰�
			bbc.getData().add(series2);
			
			// 1. �迭
			XYChart.Series series3 = new XYChart.Series<>();
			series3.setName("��������"); // �迭��
				// 2. ������ ����
				XYChart.Data data = new XYChart.Data<>("�ŵ���", 10);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data);
				
				// 2. ������ ����
				XYChart.Data data2 = new XYChart.Data<>("��ȣ��", 20);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data2);
				
				// 2. ������ ����
				XYChart.Data data3 = new XYChart.Data<>("���缮", 30);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data3);				
				pbc.getData().add(series3);
				
			XYChart.Series series4 = new XYChart.Series<>();
				series4.setName("��������");
				// 2. ������ ����
				XYChart.Data data4 = new XYChart.Data<>("�ŵ���", 30);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data4);
				
				// 2. ������ ����
				XYChart.Data data5 = new XYChart.Data<>("��ȣ��", 20);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data5);
				
				// 2. ������ ����
				XYChart.Data data6 = new XYChart.Data<>("���缮", 10);
				// 3. �迭�� ������ �߰�
				series3.getData().add(data6);
				
			// 2. ��Ʈ�� �迭 �߰�
			pbc.getData().add(series4);
			// ������Ʈ : ī�װ��� ����
				// 1. ObservableList <������Ʈ ������ �ڷ���> ����Ʈ�� ����
			ObservableList<PieChart.Data> list
				= FXCollections.observableArrayList();
			Map<String, Integer> map3 = MemberDao.memberDao.countcategory();
				// 2. PieChart.Data ��ü ����
			for(String key : map3.keySet()) {
				// 3. ������Ʈ ������ �߰�
				PieChart.Data temp = new PieChart.Data(key, map3.get(key));
				// �����͸� ����Ʈ�� �߰�
				list.add(temp);
			}
			ppc.setData(list);
			
				
			
			
			
			
			
			
	}	
			
}















