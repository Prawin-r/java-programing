package Basic_Programs;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		var scan=new Scanner(System.in);
		System.out.println( "Enter the number to check");
		int n=scan.nextInt();
	
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			sum+=sq%10;
			 sq=sq/10;
			
		}
		if(sum==n) {
			System.out.println("Neon");
			
		}else {
			System.out.println("not a neon");
		}
	
	}

}
