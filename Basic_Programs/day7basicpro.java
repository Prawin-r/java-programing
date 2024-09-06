package Basic_Programs;

public class day7basicpro {
	static int cube(int x){
		x*=x*x;
		return x;
	}
	static int ascii(char ch) {
		System.out.println(ch);
		return 0;
	}
	static double addition(char a, char b) {
		return a+b;
	}
public static void main(String [] args) {
	
 	char res=(char)addition('X','p');
 	System.out.println(res);
    System.out.println(cube(3));
	int power= (int)Math.pow(3,3);
	System.out.println(power);
     
       
	}
}
 