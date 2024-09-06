package Basic_Programs;

public class IIF {
	public static int sum(int a,int b) {
		System.out.println(a+" "+b);
		return a+b;
	}
	static void read() {
		System.out.println(staticVariable.name);
	}
  public static void main(String []args) {
//	 int a=10;
//	 if(a++>10 && ++a<9)
//		 System.out.println("HI");
//	  System.out.println(a);
////	  System.out.println("Hello");
//    int a=0;
//    if(a==1);{
//    	System.out.println("WOAH");
//    }
	  System.out.println(sum(sum(1,2),3));
	  read();
  }
}
