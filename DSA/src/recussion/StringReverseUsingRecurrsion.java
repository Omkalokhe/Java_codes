package recussion;

public class StringReverseUsingRecurrsion {
	
	static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) {
		String str="Hello";
		String result=reverseString(str);
		System.out.println(result);
	}

}
