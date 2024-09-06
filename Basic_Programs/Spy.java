package Basic_Programs;

public class Spy {
public static void main(String[] args) {
	int num=1982;
	int add=0;
	int mul=1;
	while(num>0) {
		int a=num%10;
		add=add+a;
		mul=mul*a;
		num=num/10;
	}
	if(add==mul) {
		System.out.println("SPY ");
	}
	else {
		System.out.println("Not a spy");
	}
}
}
