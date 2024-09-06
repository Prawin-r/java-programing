package Basic_Programs;

public class Static_Block {
	
	static{
		System.out.println("Im a non static block 1");
		
	}
	{
		System.out.println("I'm a non static block 2");
	}
	public static void main(String[] args) {
	System.out.println("Im a main method");                                                 
	Static_Block b1=new Static_Block();
	System.out.println("Again I'm a main method");
	
	}
	static {
		System.out.println("k");
	}
}