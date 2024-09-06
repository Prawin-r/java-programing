package Inheritance;
import java.util.Arrays;


public class Fix34 {
	public static void main(String[] args) {
//		int a[]= {1,3,1,4,4,2,3,4,1,3};
//		int temp=0;
//	    for (int i=0;i<a.length;i++)
//	    {
//	    	if(a[i]==3) {
//	    		for(int j=i;j<a.length;j++) {
//	    			if(a[j]==4) {
//	    				temp=a[j];
//	    				a[j]=a[i+1];
//	    				a[i+1]=temp;
//	    			
//	    			}
//	    		}
//	    	}
//	    	
//	    }
//	    System.out.println(Arrays.toString(a));
		 int [] arr={10,10,2,3,4,2,4};
	        int count=0;
	        int a=0;
	        for(int i=0;i<arr.length;i++){
	        	  count=0;
	            for(int j=0;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                   count++;
	                }
	            }
	            System.out.println(arr[i]+"Count is"+count)   ;
	        } 
	     //   System.out.println(arr[i]+"Count is"+a)   ;  
	    }
}
