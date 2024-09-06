package Basic_Programs;

import java.util.Scanner;

public class ForLoop {
public static void main(String[]args) {
	int a;
	char b;
	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter number");
//	a=sc.nextInt();
//	
//	for (int i=a;i>=0;i--) {
//		System.out.println(i+" ");
//		
//	}
	System.out.println("Enter Character");
	b=sc.next().charAt(0);
	System.out.println("ASCII value for upper case");
	for (char ch='A';ch<='z';ch++) {
		if(ch=='a') {
			System.out.println("ASCII value for lower case");
		}
		System.out.println(ch +"-"+(int)ch);
		
	}
	

}
}
