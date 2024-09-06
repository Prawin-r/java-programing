package Basic_Programs;

import java.util.HashSet;

public class Diagonal {
  public static void main(String[] args) {
	  int size = 5;
	  String a= "PROGRAM";
	  for (int i = 0; i < a.length(); i++) {
	      for (int j = 0; j <a.length(); j++) {
                 if (j == i ||i+j==a.length()-1)
                  {
	                   System.out.print(a.charAt(j));
	              } 
                 else
                 {
	                   System.out.print(" ");
	              }
	            }
	            System.out.println();
	        }
	  System.out.println(rr());
	}
  public static HashSet<Integer> rr() {
	  HashSet<Integer> a = new HashSet<>();
	  a.add(1);
	  a.add(2);
	  a.add(2);
	  return a;
  }
}