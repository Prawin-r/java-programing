package Accenture;
import java.util.Scanner;

public class FactSum {
    
    public static int calculateSum(int[] arr, int num) {
        int totalSum = 0;
        boolean validFactorFound = false;
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                while (num % i == 0) {
                    num /= i;
                }
                if (i <= arr.length) {
                    totalSum += arr[i - 1];
                    validFactorFound = true;
                }
            }
        }
        
        if (!validFactorFound) {
            return 0;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(-1);
            return;
        }

       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        int result = calculateSum(arr, num);
        System.out.println(result);
    }
}
