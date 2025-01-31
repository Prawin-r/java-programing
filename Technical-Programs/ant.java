package Accenture;

import java.util.Scanner;

public class ant {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();

        int[] arr= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

		int count=0;
		int sum=0;
		for(int sum1:arr) {
			sum+=sum1;
			if(sum==0) {
				count+=1;
			}
			
		}
		System.out.println("original position "+ count);
				
    
 }
}
