package Accenture;

import java.util.Scanner;

public class Magic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char arr[]=s.toCharArray();
    int count=1;
    int max=0;
    char c=' ';
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=' ') {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				arr[j]=' ';
			}
		}
		if(count>max) {
			max=count;
			c=arr[i];
		}
	}
	}
     int tot=0;
     for(int i=0;i<arr.length;i++) {
    	 if(s.charAt(i)!=c) {
    		 tot++;
    	 }
     }
     System.out.println(tot);
}}
