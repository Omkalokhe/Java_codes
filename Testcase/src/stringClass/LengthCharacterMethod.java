package stringClass;

public class LengthCharacterMethod {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.length()); // it will used to print length of String.
		System.out.println(s.charAt(2)); // used to print char at index i
		System.out.println(s.codePointAt(1)); // used to print Unicode value of char at index
		System.out.println(s.codePointBefore(1)); // used to print Unicode value of char at index i before means(i-1).
		System.out.println(s.codePointCount(0, 2)); // used to print Unicode count in the range.
	}
}
