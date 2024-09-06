package Basic_Programs;

public class Armstrong {
public static void main(String[] args) {
	int a=121;
	int rev=0;
	int temp= a;
	while (a>0) {
		rev= rev+a*a*a;
	    a=a/10;
	}
	if(temp==rev) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not a armstrong");
	}
}
}
