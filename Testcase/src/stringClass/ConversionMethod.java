package stringClass;

public class ConversionMethod {
		public static void main(String[] args) {
			String s2="hello World";
			String s=String.valueOf(4579);
			System.out.println(s);
			
			int s1=Integer.parseInt(s);
			System.out.println(s1);
			
			char[] a=s2.toCharArray();
			for ( char c : a) {
				System.out.println(c);
			}
		}
}
