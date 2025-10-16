package serilization_Deserilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream filein = new FileInputStream("User.txt");
		ObjectInputStream objin = new ObjectInputStream(filein);
		User user = (User) objin.readObject();
		System.out.println(user);
	}

}
