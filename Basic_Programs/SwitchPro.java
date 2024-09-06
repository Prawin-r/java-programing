package Basic_Programs;
import java.util.Scanner;

public class SwitchPro { 
	public static void main(String []args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= a.nextInt();
		switch(num%2) {
		case 0:System.out.println("It is even");
		break;
		case 1:System.out.println("It is odd");
		break;
		}
	
	}
}
