package Accenture;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[] =new int[num];
		for(int i=0;i<=num;i++) {
			 arr[i]=sc.nextInt(num);
				//System.out.print(arr[i]);
		}
		int mul=0;
		int fac=0;
		for(int i=0;i<arr.length;i++) {
			while(num!=0) {
				fac=num/2;
				mul=2*fac;
			}
		}
		System.out.println(mul);
		
	}

}
