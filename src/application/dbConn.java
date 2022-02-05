package application;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class dbConn {
//public Connection conn = null;

public Connection ConnectDb() {
	String dbName = "";
	String userName = "";
	String password ="";
	try
	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName, userName, password);
			JOptionPane.showMessageDialog(null,"connection established");
			return conn;
	}	catch(Exception e )
	{
			return null;
	}

}
}
