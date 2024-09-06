package Basic_Programs;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the number:");
		int a= scan.nextInt();
		
		if (isXylem(a)) {
			System.out.println(a+" is a Xylem number");
		}
		else {
			System.out.println(a+" is a phloem number");
		}	
		
		
	}
	
	public static boolean isXylem(int a) {
		int num=a ;
		int lastDigit=a%10;
		a=a/10;
		int sum=0;
		while (a>=10) {
			sum=sum+a%10;
			a=a/10;
		}
		int firstDigit=a;
		int extremeSum=firstDigit+lastDigit;
//		System.out.println(sum+" is the sum of middle parts");
//		System.out.println(extremeSum+" is the sum of both extremes");
		return extremeSum==sum;
	}
	

}
