package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			String query = "update student set sname=? where sid=?";
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Id which you need to update");
			int id = sc.nextInt();
			System.out.println("Enter Name you need to update");
			String name = sc.next();
			PreparedStatement prestatement = connection.prepareStatement(query);
			prestatement.setString(1, name);
			prestatement.setInt(2, id);
		

			prestatement.execute();
			connection.close();
			System.out.println("Data updated Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
