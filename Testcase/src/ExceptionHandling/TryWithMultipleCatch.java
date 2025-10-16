package ExceptionHandling;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			String s = args[0];
			System.out.println("Value of s " + s);
			int i = Integer.parseInt(s);
			int j = 100 / i;
			System.out.println("Value of j " + j);
			String s1 = null;
			int k = s1.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			e.getMessage();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
