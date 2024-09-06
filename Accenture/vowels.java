package Accenture;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				counta+=1;
			}
			else if(s.charAt(i)=='e'){
			     counte+=1;
			}
			else if(s.charAt(i)=='i'){
			     counti+=1;
			}
			else if(s.charAt(i)=='o'){
			     counto+=1;
			}
			else if(s.charAt(i)=='u'){
			     countu+=1;
			}
		}
        int a[]= {counta,counte,counti,counto,countu};
		
		char vow[]= {'a','e','i','o','u'};
		int maxa=a[0];
		char maxvowel=vow[0];
		//System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxa) {
				maxa=a[i];
				maxvowel=vow[i];
			}
		}
		System.out.println("Maximum vowel: "+maxvowel);
		
	}

}
