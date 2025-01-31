package Accenture;

public class Pattern {
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<2*n;i++) {
		int stars=i<n?i:2*n-i;
		for(int j=1;j<=stars;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
//	for(int i=0;i<n;i--) {
//		for(int j=0;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	
}
}
