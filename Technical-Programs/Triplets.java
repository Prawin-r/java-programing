package Accenture;

import java.util.Scanner;

public class Triplets {
		 public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++){
		      a[i]=sc.nextInt();
		 }
		 int target =sc.nextInt();
		 int count=0;
		 for(int i=0;i<a.length;i++){
		          for(int j=i+1;j<a.length;j++){
		                for(int k=j+1;k<a.length;k++){
		                   if((a[i]*a[j]*a[k])==target){
		                	   
		                         count+=1;
		                    }
		            }
		         }
		    }
		 System.out.println(count);

}
}
