package ExceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			Integer i=new Integer("ABC");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("In Finally Bolck");  //use for resourse closing
		}
	}

}
