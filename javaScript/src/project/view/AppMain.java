package project.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Health.fxml"));
		Scene scene = new Scene(root, 600, 600);
		stage.setTitle("헬창 관리 프로그램");
		stage.setScene(scene);
		stage.show();
	}
}
