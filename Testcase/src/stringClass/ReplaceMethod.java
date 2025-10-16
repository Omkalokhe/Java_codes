package stringClass;

public class ReplaceMethod {
	public static void main(String[] args) {
		String s = "Hello My name is Omm";

		// All method are case Sensitive.

		System.out.println(s.replace("Omm", "Om")); // use to replace from the String.
		System.out.println(s.replaceAll("m", "@")); // replace all match.
		System.out.println(s.replaceFirst("m", "*")); // replace first match.
	}
}
