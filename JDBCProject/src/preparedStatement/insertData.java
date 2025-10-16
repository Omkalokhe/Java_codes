package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			String query = "insert into student values(?,?,?)";
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Id");
			int id = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Address");
			String address = sc.next();

			PreparedStatement prestatement = connection.prepareStatement(query);
			prestatement.setInt(1, id);
			prestatement.setString(2, name);
			prestatement.setString(3, address);

			prestatement.execute();
			connection.close();
			System.out.println("Data Entered Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
