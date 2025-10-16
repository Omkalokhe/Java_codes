package stringClass;

import java.util.StringJoiner;

public class SplitJoinMethod {
	public static void main(String[] args) {
		String s = "hello,java,programmer";
		String[] a = s.split(",");
		for (String string : a) {
			System.out.println(string);
		}
		System.out.println(String.join("--", a)); // join with the symbole given in parameter. join method is static.

		StringJoiner sj = new StringJoiner("-", "[", "]"); // Joiner will help to join the String with prefix and
															// suffix.
		sj.add("Red").add("Blue").add(s);
		System.out.println(sj);
	}
}
