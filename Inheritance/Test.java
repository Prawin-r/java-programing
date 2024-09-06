package Inheritance;

public class Test {
	public static void main(String[] args) {
		int num=762;
		String [] v= {"","b","a","e","c","i","d","o","f","g"};
	    String an="";
		while(num>0) 
		{
			int a=num%10;
			an=v[a]+an;
			num/=10;	
		}
//		StringBuilder rev=new StringBuilder(an);
          System.out.println(an);
		
		
			
		}
	}


