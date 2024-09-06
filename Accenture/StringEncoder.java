package Accenture;
import java.util.Scanner;

	public class StringEncoder {
	    public static String[] stringEncoder(String[] input1, int input2) {
	        String[] output = new String[input1.length];
	        for (int i = 0; i < input1.length; i++) {
	            String word = input1[i];
	            int middleIndex = word.length() / 2;
	            String temp = word.charAt(0) + "" + word.charAt(middleIndex) + "" + word.charAt(word.length() - 1);
	            StringBuilder answer = new StringBuilder();
	            for (int j = 0; j < input2; j++) {
	                answer.append(temp);
	            }
	            output[i] = answer.toString();
	        }
	        return output;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of words:");
	        int n = scanner.nextInt();
	        String[] input1 = new String[n];
	        System.out.println("Enter the words:");
	        for (int i = 0; i < n; i++) {
	            input1[i] = scanner.next();
	        }
	        System.out.println("Enter the value of input2:");
	        int input2 = scanner.nextInt();
	        String[] output = stringEncoder(input1, input2);
	        System.out.println("Output:");
	        for (String s : output) {
	            System.out.println(s);
	        }
	    }
	}

