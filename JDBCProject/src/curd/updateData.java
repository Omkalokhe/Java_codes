package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateData {

	public static void main(String[] args) {

		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// estiblesh connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			// write query
			String query = "update student set sname='Sham' where sid=1";
			// create statment
			Statement statement = connection.createStatement();
			// run query
			statement.execute(query);
			connection.close();
			System.out.println("update  Successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
