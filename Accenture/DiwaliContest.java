package Accenture;

import java.util.Scanner;
public class DiwaliContest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();	        
	        int P = scanner.nextInt();
            int totalTime = 4 * 60; 
	        int timeLeft = totalTime - P; 
	        int problemsSolved = 0;
	        for (int i = 1; i <= N; i++) {
	            int timeRequired = 5 * i; 
	            if (timeLeft >= timeRequired) {
	                timeLeft -= timeRequired;
	                problemsSolved++;
	            } else {
	                break;
	            }
	        }

	        System.out.println(problemsSolved);
	    }
	}

