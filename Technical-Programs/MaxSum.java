package Accenture;

import java.util.Scanner;

public class Main {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read input values
	        System.out.print("Enter the number of shots (N): ");
	        int N = scanner.nextInt();
	        
	        System.out.print("Enter the size of the subarray (K): ");
	        int K = scanner.nextInt();
	        
	        int[] A = new int[N];
	        System.out.println("Enter the distances of the shots:");
	        for (int i = 0; i < N; i++) {
	            A[i] = scanner.nextInt();
	        }
	        
	        // Step 1: Transform the array to scores
	        int[] scores = new int[N];
	        for (int i = 1; i < N; i++) {
	            scores[i] = (i + 1) * A[i];
	        }
	        
	        // Step 2: Use sliding window to find the maximum sum of any subarray of size K
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;

	        // Initial sum of first K elements
	        for (int i = 1; i < K; i++) {
	            currentSum += scores[i];
	        }
	        maxSum = currentSum;

	        // Sliding the window across the array
	        for (int i = K; i < N; i++) {
	            currentSum += scores[i] - scores[i - K];
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	            }
	        }

	        // Output the result
	        System.out.println("The maximum possible score is: " + maxSum);
	        
	        scanner.close();
	    }
	}



