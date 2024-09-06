package Basic_Programs;

import java.util.Scanner;

public class Monkey {
	public static void main(String[] args) {
		String aSmile="";
		String bSmile="";
		Scanner sc=new Scanner(System.in);
		 aSmile=sc.next();
		 bSmile=sc.next();
		if (aSmile.equals("true")&& bSmile.equals("true")) {
			System.out.println("Smiling we are in trouble");
		} 
		else {
			System.out.println("Safe");
		}
	}

}
