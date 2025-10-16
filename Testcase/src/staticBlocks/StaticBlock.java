package staticBlocks;

public class StaticBlock {
			public StaticBlock() {
				System.out.println("Constructer");
			}
			
			static{
			  System.out.println("Static block 1");	
			}
			{
				System.out.println("Non static block");
			}
			public static void main(String[] args) {
				StaticBlock obj=new StaticBlock();
			}
			
			static {
				StaticBlock obj=new StaticBlock();
				System.out.println("Static block 2");
			}
}
