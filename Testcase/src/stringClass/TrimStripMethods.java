package stringClass;

public class TrimStripMethods {
			public static void main(String[] args) {
				String s=" Java ";
				System.out.println(s.trim()); //remove the start & end spaces
				System.out.println(s.strip()); // remove the start & end spaces also manage unicode.
				System.out.println(s.stripLeading()); //remove space from start.
				System.out.println(s.stripTrailing()); //remove space from end.
			}
}
