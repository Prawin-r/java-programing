package Basic_Programs;
import java.util.Scanner;
public class DoWhile {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter number m:");
		int m=sc.nextInt();
		System.out.println("Enter number n:");
		int n=sc.nextInt();
		do {
			if (m%2==0) {
			System.out.print(m +" ");
			}
			m++;
		}
		while (m<=n);
		System.out.println("Hello guyss");
		do {
			
		    System.out.println("Good things will take time");
		    System.out.println("Choose R ");
		    ch = sc.next().charAt(0);
		    
		 } 
	     while (ch=='R'); 

	}

}
