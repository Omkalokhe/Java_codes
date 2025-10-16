package recussion;


public class StringReverse {
	
	static String reverseTheString(String str) {
		char[] charArr=str.toCharArray();
		String reverse="";
		for(int i=charArr.length-1;i>=0;i--) {
			reverse+=charArr[i];
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		String orignal="madam";
		String result=reverseTheString(orignal);
		System.out.println("Reverse of String "+orignal+" is "+result);
		if(orignal.equals(result)) {
			System.out.println("String is Palanderom");
		}else {
			System.out.println("String is not Palanderom");
		}
		
	}

}
