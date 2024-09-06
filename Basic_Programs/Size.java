package Basic_Programs;
import java.util.Scanner;
public class Size {
public static void main(String[] args) {
//	int a[]= {1,2,2,1,2,2};
//	int temp=0;
//	for(int i=a.length-1;i>=0;i--) {
//		temp=a[i];
//		a[i]=temp;
//	for(int i=0;i<a.length-1;i++) {
//		if(a[i]==a[i+1]) {
//	     System.out.println("true");
//		}
//		
//System.out.println(a[i]);
	int n=10;
	for (int i=0;i<n;i++) {
		if(i%3==0) {
			System.out.println("Fizz");
		}
		else if(i%5==0) {
			System.out.println("Buzz");
		}

		System.out.println(i);
	}
	
}
}