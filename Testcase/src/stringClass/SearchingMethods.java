package stringClass;

public class SearchingMethods {
		public static void main(String[] args) {
			String s="Java hello java";
			System.out.println(s.contains("av"));  //check if string has av.
			System.out.println(s.startsWith("Ja")); //check if string start with ja.
			System.out.println(s.startsWith("va", 2));  //check if string start with va from index i.
			System.out.println(s.endsWith("va"));  //check if string start with av.
			System.out.println(s.indexOf("v"));   //print index of char at that string.
			System.out.println(s.lastIndexOf("ava")); // print last index of char/string at that string.
			System.out.println(s.lastIndexOf("Java",0)); // print last index of char/string at that string from index i. it travels backward.
   		}
}
