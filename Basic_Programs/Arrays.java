package Basic_Programs;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int row=2;
	int col=2;
	int [][]e={{1,2,3},{1,2,3},{1,2,3}};
	int [][]d={{1,2,3},{1,2,3},{1,2,3}};
	for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
			System.out.print(e[i][j]+" ");
		}
		System.out.println();
	}
	int [][]a= new int [row][col];
	System.out.println("Enter the numbers to be stored");
	for (int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			a[i][j]=s.nextInt();
			
		}
		
	}
	for (int i=0;i<row;i++) {
		for (int j=0;j<col;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Transpose of Matrix:");
	for (int i=0;i<row;i++) {
		for (int j=0;j<col;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	int [][]c= new int [row][col];
	System.out.println("Addition of Matrix");
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++) {
			for (int k=0;k<2;k++)
			 c[i][j]+=a[i][k]*a[k][j];
			System.out.print(c[i][j]+" ");
		
		}
		System.out.println();
	}
	
  }
}
                                             