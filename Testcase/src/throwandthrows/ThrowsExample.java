package throwandthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {
	public static void readTextFile() throws FileNotFoundException, IOException, ArithmeticException,
			NullPointerException, ArrayIndexOutOfBoundsException {

		File file = new File("output.txt");

		FileInputStream in = new FileInputStream(file);

		System.out.println(in.available());

		System.out.println(in.read());
	}
	// 3000 line

	public static void main(String[] args) {

		System.out.println("start of main method-----");

		try {

			readTextFile();

		} catch (Exception e) {

			e.printStackTrace();

		}
		System.out.println("--end of main method--");

	}
}
