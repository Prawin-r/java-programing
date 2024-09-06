package Basic_Programs;

public class Obj {
    double length ;
    Obj(){
    	return;
    }
    Obj(double length){
    	this.length=length;
    }
    public static Obj methodObj(){
               return new Obj();    	
    }
    public static Obj createObj(double length) {
    	       return new Obj(length);
    }
    public static void main(String[] args) {
    	Obj b1=Obj.createObj(9);
    	System.out.println(b1.length);
    	
		
	}
}
