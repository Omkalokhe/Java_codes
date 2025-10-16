package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id you need to delete");
			int id = sc.nextInt();

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice", "root", "root");
			String query = "delete from student where sid=?";
			PreparedStatement prep = connection.prepareStatement(query);
			prep.setInt(1, id);
			prep.execute();
			prep.close();
			System.out.println("Deleted Data Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
