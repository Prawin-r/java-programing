package Accenture;

import java.util.Scanner;

public class Election {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int max=0,val=0;
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=' ') {
			int count=1;
	        for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count +=1;
					arr[j]=' ';
				}
	        }
				if(count>max) {
					max=count;
					val=arr[i];
				}
				else if(count==max) {
					val=-1;
				}
					
			}
	}
	        if(arr.length==1) {
	        System.out.println(arr[0]);
	        }
	        else {
	         System.out.println(val);
	        }
			}
	
	
		
}

