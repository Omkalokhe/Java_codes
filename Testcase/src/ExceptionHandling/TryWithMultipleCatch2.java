package ExceptionHandling;

public class TryWithMultipleCatch2 {
	public static void main(String[] args) {
		try {

			int num = Integer.parseInt("abc");
			String str = "Java";
			System.out.println(str.charAt(10));

		} catch (NumberFormatException e) {
			System.out.println("Number Format Error: " + e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Other Runtime Error: " + e.getMessage());
		}

		System.out.println("Program continues...");
	}
}
