package Basic_Programs;

public class WhileProg {
	    public static void main(String[] args) {
	        int n = 3; 
	        int i = 1;

	        while (i <= n) {
	            int j = n - i;
	            
	            while (j > 0) {
	                System.out.print(" ");
	                j--;
	            }
	            int k = 1;
	            
	            while (k <= i) {
	                System.out.print("* ");
	                k++;
	            }
	            
	            System.out.println();
	            i++;
	        }
	    
	    }
	
    }



