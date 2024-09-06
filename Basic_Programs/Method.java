package Basic_Programs;

public class Method {
	public void demo(int a,int b) {
		System.out.println(a+b);
		if(a+b==0) {
			System.out.println("Enter valid numbers for addition");
		}
		
	}
	public void demo(int a,int b,int c) {
		System.out.println(a+b+c);
		if(a+b+c>=0) {
			System.out.println("Addition="+(a+b+c));
		}
	}
	public static void main(String[]args) {
		Method d=new Method();
		d.demo(0,0);
		
}
}
