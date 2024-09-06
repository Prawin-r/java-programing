package Inheritance;

public class Character {
	public static void main(String[] args) {
		String a ="'(',')','{','}'";
		char[]d=a.toCharArray();
		for(int i=0;i<d.length-1;i++) {
			if(d[i]==d[i+1]) {
				System.out.println(false);
			}
		}
	}
	

}
