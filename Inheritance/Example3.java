package Inheritance;
class Parent{
	static  {
		System.out.println("Parent is loaded");
		
	}
	static void nurture(){
		System.out.println("Nurture is loaded");
	}
}
class Child extends Parent{
	static  {
		System.out.println("Child is loaded");
	}
	static void respect() {
		System.out.println("Respect parent");
	}
}
public class Example3 {
public static void main(String[] args) {
        // Parent. nurture();
         Child.respect();
}
}
