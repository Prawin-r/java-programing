package Inheritance;

class Doctor
{
	String name="Peterparker";
	int Dlno=0112;
	

    public void Checkpulse() 
    {
    	System.out.println("Doctor is checking pulse");
    }
    public void CheckBp() 
    {
    	System.out.println("Blood pressure is checking");
    }
    
}
class Cardiologist extends Doctor
{
	public void display() 
	{
		System.out.println("Bypass surgery is undergoing");
	}
}
public class Example2
{
	public static void main(String[] args) 
	{
    Cardiologist c1=new Cardiologist();
    c1.CheckBp();
    c1.Checkpulse();
    c1.display();
    System.out.println(c1.name); 
    System.out.println(c1.Dlno);
    }
}
