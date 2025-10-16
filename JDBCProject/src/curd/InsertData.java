package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			//write the query
			String query="insert into student values(4,'om','Pune')";
			//create statement
			Statement statement=connection.createStatement();
			//run the query
			statement.execute(query);
			//close the connection
			connection.close();
			System.out.println("Data Enter Sussfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
