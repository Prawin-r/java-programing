package Inheritance;

class Baseclass 
{
	int x=10;
}

class DerivedClass extends Baseclass
{
	
}
public class Example1
{
	public static void main(String[] args)
	{
		Baseclass base =new Baseclass();
		System.out.println(base.x);
	}
}