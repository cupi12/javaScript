package com.yedam.network;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sun.misc.Launcher;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20); // 컨트롤 안의 간격

		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
		button.setOnAction(event -> Platform.exit()); // 버튼을 누르면 프로그램을 종료

		root.getChildren().add(label);
		root.getChildren().add(button);
		Scene scene = new Scene(root);

		primaryStage.setTitle("Hllo App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}// end of start

	public static void main(String[] args) {
		launch(args); 
	}
}
