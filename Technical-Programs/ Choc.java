package Accenture;

import java.util.Scanner;

public class Choc {
	   
	    public static int totalChocolates(int n, int[] jars) {
	        int total = 0; 
	        for (int jar : jars) { 
	            int chocolatesForA = (jar + 2) / 3;
	            total += chocolatesForA; 
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	        int n = s.nextInt();
	        int[] jars = new int[n];
	        for(int i=0;i<n;i++) {
	        	jars[i]=s.nextInt();
	        }
	        int result = totalChocolates(n, jars);
	        System.out.println(result); // Output: 21
	    }
	}
