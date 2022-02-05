package application;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class LoginHandler {
	@FXML
	private Hyperlink signupBtn;
	@FXML
	private Button loginBtn; 
	@FXML
	private TextField usernameTextField;
	@FXML
	private PasswordField pwdTextField;
	@FXML
	private TextField testField;
	@FXML
	private Label lb;
	 
	dbConn db = new dbConn();
	ResultSet res = null;
	PreparedStatement pst = null;
	Connection  conn = null;
	
	String name = testField.getText().toString();
	String password = pwdTextField.getText();
	
	@FXML
	public void loginBtnEvent(ActionEvent event) throws Exception
	{	
		conn = db.ConnectDb();
		
		name = usernameTextField.getText().toString();
		password = pwdTextField.getText().toString();
		
		System.out.println("name is: "+name);
		System.out.println("password is: "+password);
		
//		String sql = "SELECT * FROM students Where name = ? and passwrd = ?";
//		try
//		{
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, name);
//			pst.setString(2, password);
//		 	res = pst.executeQuery();
//			if(res.next()) 
//			{
//				System.out.println("correct login");
//				
//			} else
//			{
//				System.out.println("invalid login");
//			}
//		}	catch ( SQLException ex)
//		{
//			System.out.println(ex);
//		}
	}
	//This Method has an event listener that is linked to the signupBtn in kemuLogin.fxml file
	public void signupBtnEvent(ActionEvent event) throws Exception 
	{
		Node node = (Node) event.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		stage.close();
		
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../application/KemuRegister.fxml")));
		stage.setScene(scene);
		stage.show();
	}
}
