package stringClass;

public class SubStringSubSequenceMethod {
	public static void main(String[] args) {
		String s="Java";
		System.out.println(s.substring(2)); //print sub-String from index i.
		System.out.println(s.substring(1, 4)); //print sub-String between the range.  end index print <index
		System.out.println(s.subSequence(1, 3)); // print Sequence of char and it return type is charSequence.
	}

}
