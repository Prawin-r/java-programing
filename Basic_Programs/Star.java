package Basic_Programs;

public class Star {
	
	    public static void main(String[] args) {
          int n = 5;
//	        int[] a= new int[5];
//	        a[0]=10;
//	        a[1]=20;
//	        a[2]=30;
//	        a[3]=40;
//	        a[4]=50;
//	         for(int i=0;i<n;i++) {
//	        System.out.println(a[i]);
//	         }
	        

	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= n; j++) {
	                if (j == 1 || j == i || i == n) {
	                    System.out.print("*");
	                }
	            else {
	                    System.out.print(" ");
	                }
	            
	           System.out.println(" ");
	        }
//            int num = 1243;
//            int rev = 0;  
//            int num1=1243;
//            int res=0;
//            while(num != 0)   
//            {  
//            int a = num % 10;  
//            rev = rev * 10 + a;  
//            num = num/10;
//            }  
//            System.out.println("The reverse of the given number is: " + rev);  
//            if (res==num1) {
//            	System.out.println("Palindrome");
//            	
//            }
//            else {
//            	System.out.println("Not panlindrome");
//            }
}}}