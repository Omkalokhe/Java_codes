package ExceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			int a=100/2;
			System.out.println(a);
			try {
				Integer i=new Integer("ABC");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		catch (Exception e) {
			
		}
	}

}
