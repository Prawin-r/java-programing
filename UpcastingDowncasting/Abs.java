package UpcastingDowncasting;

abstract  class Abs1 {
	abstract void display();
	Abs1()
	{
		System.out.println("Hi");
	}
}

abstract class Abs extends Abs1{
   public void display() {
	   System.out.println("VIP");
	}
	
	
}