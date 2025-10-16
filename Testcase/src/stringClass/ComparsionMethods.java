package stringClass;

public class ComparsionMethods {
	public static void main(String[] args) {
		String s="Java";
		String s1="java";
		System.out.println(s.equals(s1)); // it will print boolean if strings is equal or not.
		System.out.println(s.equalsIgnoreCase(s1)); // it will print boolean if strings is equal or not(it will ignore case).
		System.out.println(s.compareTo(s1)); // it will compare the string and give int value.
		System.out.println(s.compareToIgnoreCase(s1));  // it will compare the string and give int value(it will ignore case).
		System.out.println(s.contentEquals("java"));
		
	}

}
