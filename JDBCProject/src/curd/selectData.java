package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectData {
	public static void main(String[] args) {

		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// estiblesh connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			// write query
			String query = "select * from student";
			// create statment
			Statement statement = connection.createStatement();
			// run query
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2));

			}
			connection.close();
			System.out.println("Delete Successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
