package application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class RegistrationHandler {
	public void registrationForm() {
	try {
		Parent root = FXMLLoader.load(getClass().getResource("../application/KemuRegister.fxml"));
		Scene scene = new Scene(root,600,400);
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
