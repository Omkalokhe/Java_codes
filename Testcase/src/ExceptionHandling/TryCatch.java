package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Main Start...!!!!");
		try {
			Integer i=new Integer("ABC");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Main End..!!!");
	}
}
