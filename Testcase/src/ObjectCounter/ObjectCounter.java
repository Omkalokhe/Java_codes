package ObjectCounter;

public class ObjectCounter {
		
		static int objectCount=0;
	  ObjectCounter() {
			objectCount+=1;
	}
	public static int getCount() {
		return objectCount;
	}
	
	public static void main(String[] args) {
				ObjectCounter obj=new ObjectCounter();
				ObjectCounter obj1=new ObjectCounter();
				ObjectCounter obj2=new ObjectCounter();
				ObjectCounter obj3=new ObjectCounter();
				System.out.println("Number of Object Created: "+getCount());
	}
}
