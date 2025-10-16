package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithMultipleCatch1 {
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("Z:/not_exist/ABC.txt");
			Class.forName("com.abc.args.");
		} catch (FileNotFoundException e) {
			System.out.println("File Error: " + e.getMessage());
		}
		catch (ClassNotFoundException e) {
			 System.out.println("Class Error: " + e.getMessage());
		}
	}
}
