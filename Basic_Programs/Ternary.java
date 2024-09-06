package Basic_Programs;

public class Ternary {
          static int a=12;
          static int b= 7;
          static int result;
        
        public static void main (String []args) {
        	   
        	  
        	   int res=(1+20+20-10)==(1+20+30-10)? 31:41;
        	   int tes=(1+9==10)||(11>12)&&(15<14)? 41:61;
        	   int fes= 10+10+12 != 10+10+12  ? 12+1==13+1 ? 10:12 : 12+1<13+1 ? 1:0;
        	   System.out.println(res);
        	   System.out.println(fes);
        	  
        	   int Pavin = 500;
        	   int Padmesh= 350;
       
        	   String result = Pavin < Padmesh ?"System.out.print(500)": "Padmesh";
        	   System.out.println(result);
        	
        			   
          }

}
