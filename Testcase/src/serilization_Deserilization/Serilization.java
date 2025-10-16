package serilization_Deserilization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilization {
	
	public static void main(String[] args) throws IOException {
		User user=new User();
		user.setUserId(101);
		user.setName("Ram");
		FileOutputStream fileout=new FileOutputStream("User.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fileout);
		objout.writeObject(user);
		System.out.println("Serilization Sccessfully");
		
	}

}
