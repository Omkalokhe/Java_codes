package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
		public static void main(String[] args) {
			
			try {
				//load driver 
				Class.forName("com.mysql.jdbc.Driver");
				//estiblesh connection
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
				//write query
				String query="delete from student where sid=2";
				//create statment
				Statement statement=connection.createStatement();
				// run query
				statement.execute(query);
				connection.close();
				System.out.println("Delete Successfully");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
}
