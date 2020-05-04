package project.view;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import project.model.HealthDAO;
import project.model.HealthDO;
import project.model.ObserverHealthDO;

public class HealthController2 implements Initializable {
	@FXML
	TextField txtname;
	@FXML
	TextField txtphoneNum;
	@FXML
	TextField txtgender;
	@FXML
	TextField txtdivision;
	@FXML
	TextField txtbirth;
	@FXML
	TextField txtfindname;
	@FXML
	TextField txtgrade;
	@FXML
	TextField txtmonth;
	@FXML
	TextField txtdate;
	@FXML
	TextField txtmoney;
	@FXML
	TextField txtcard;
	@FXML
	TextField txttotal;
	@FXML
	TextField txtname2;
	@FXML
	TextField txtphonenum2;
	@FXML
	TextField txtgender2;
	@FXML
	TextField txtdivision2;
	@FXML
	TextField txtbirth2;
	@FXML
	TextField txtfindname2;
	@FXML
	TextField txtgrade2;
	@FXML
	TextField txtmonth2;
	@FXML
	TextField txtdate2;
	@FXML
	TextField txtmoney2;
	@FXML
	TextField txtcard2;
	@FXML
	TextField txttotal2;
	@FXML
	TableView<HealthDO> tvHealth;
	@FXML
	TableColumn<ObserverHealthDO, String> colname;
	@FXML
	TableColumn<ObserverHealthDO, String> colphoneNum;
	@FXML
	TableColumn<ObserverHealthDO, String> colgender;
	@FXML
	TableColumn<ObserverHealthDO, String> coldivision;
	@FXML
	TableColumn<ObserverHealthDO, String> colbirth;
	@FXML
	TableColumn<ObserverHealthDO, String> colmoney;
	@FXML
	TableColumn<ObserverHealthDO, String> colcard;
	@FXML
	TableColumn<ObserverHealthDO, String> coltotal;

	HealthDO health = new HealthDO();
	HealthDAO dao = new HealthDAO();	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colname.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("name"));
		colphoneNum.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("phoneNum"));
		colgender.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("gender"));
		coldivision.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("division"));
		colbirth.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("birth"));
		colmoney.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("money"));
		colcard.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("card"));
		coltotal.setCellValueFactory(new PropertyValueFactory<ObserverHealthDO, String>("total"));

	}

	@FXML
	public void HealthInsert(ActionEvent actionEvent) {// 입력
		health.setName(txtname.getText());
		health.setPhoneNum(txtphoneNum.getText());
		health.setGender(txtgender.getText());
		health.setDivision(txtdivision.getText());
		health.setBirth(txtbirth.getText());
		health.setMoney(txtmoney.getText());
		health.setCard(txtcard.getText());
		health.setTotal(txttotal.getText());

		HealthDAO dao = new HealthDAO();
		dao.insertHealthEmp(health);
		System.out.println("회원 추가 완료");
	}// end of healthinsert

	@FXML
	public void select(ActionEvent actionEvent) {// 한건 회원조회
		health.setName(txtfindname.getText());
		HealthDO result = dao.selectOne(health);
		txtname.setText(result.getName());
		txtphoneNum.setText(result.getPhoneNum());
		txtgender.setText(result.getGender());
		txtdivision.setText(result.getDivision());
		txtbirth.setText(result.getBirth());
		txtmoney.setText(result.getMoney());
		txtcard.setText(result.getCard());
		txttotal.setText(result.getTotal());

		System.out.println("조회 처리완료!");
	}

	@FXML
	public void submit(ActionEvent actionEvent) {// 결제승인

		health.setTotal(txtmoney.getText());
		String sMoney;

		if (txtmoney.getText() == null || txtmoney.getText().isEmpty()) {
			sMoney = txtcard.getText();
		} else {
			sMoney = txtmoney.getText();
		}
		double tMoney = Integer.parseInt(sMoney);
		tMoney = (tMoney * 0.9);
//		int tCard = Integer.parseInt(sCard);

		txttotal.setText(Double.toString(tMoney));
//		double tTotal = Integer.parseInt(sTotal);

		System.out.println("결제 처리 완료!");
	}

	@FXML
	public void delete(ActionEvent actionEvent) {
		String delName = txtfindname.getText();

		dao.delHelthEmp(health);
		System.out.println("회원 삭제 완료");
	}

	@FXML
	public void selectAllView(ActionEvent actionEvnet) throws IOException {
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("people.fxml"));
		Scene scene = new Scene(root, 600, 600);
		stage.setTitle("헬창 전체회원");
		stage.setScene(scene);
		stage.show();
	}

	@FXML // 전체 조회 버튼 이벤트 헨들러
	protected void selectAll(ActionEvent actionEvent) {
		HealthDAO dao = new HealthDAO();
		ArrayList<HealthDO> list = dao.selectAll();
		
		tvHealth.setItems(FXCollections.observableArrayList(list));
	}
	@FXML
	public void HealthInfo(MouseEvent moseEvent) {
		HealthDO healthDO = tvHealth.getSelectionModel().getSelectedItem();
		txtname2.setText(healthDO.getName());
		txtphonenum2.setText(healthDO.getPhoneNum());
		txtgender2.setText(healthDO.getGender());
		txtdivision2.setText(healthDO.getDivision());
		txtbirth2.setText(healthDO.getBirth());
		txtmoney2.setText(healthDO.getMoney());
		txtcard2.setText(healthDO.getCard());
		txttotal2.setText(healthDO.getTotal());
	}
	
	@FXML
	protected void delHealth(ActionEvent actionEvent) {
		HealthDO healthDO = tvHealth.getSelectionModel().getSelectedItem();
		ObservableList<HealthDO> data = tvHealth.getItems();
		
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("삭제");
		alert.setHeaderText("컬럼을 삭제합니다.");
		alert.setContentText("정말 삭제하시겠습니까");
		
		Optional<ButtonType> result = alert.showAndWait();
		if(result.get() == ButtonType.OK) {
			HealthDAO dao = new HealthDAO();
			dao.delHelthEmp(healthDO);
			data.remove(healthDO);
		}
	}

	@FXML
	public void peopleInitialize() {
		txtname2.setText("");
		txtphonenum2.setText("");
		txtgender2.setText("");
		txtdivision2.setText("");
		txtbirth2.setText("");
		txtmoney2.setText("");
		txtcard2.setText("");
		txttotal2.setText("");
	}
}
