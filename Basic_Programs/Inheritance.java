package Basic_Programs;

 class Inheritance1{
	 String name;
	 static String Planet_name="Earth";
	 int age;
	 

public void walk() {
	System.out.println(name +" is walking");
}
 }
 
public class Inheritance extends Inheritance1{
	 public static void main(String[]args) {
          Inheritance1 a=new Inheritance1();
          a.walk();
	
	 }
}
