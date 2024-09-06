package Basic_Programs;
public class Day8programs {
	public static void main(String[] args) {
		int array[]= {123,456,789};
		for (int i=0;i<array.length;i++) {
			int temp=array[i];
			int l=0;
			int v=0;
		    while(temp!=0) {
		    	l=temp%10;
		    	v=v*10+l;
		    	temp=temp/10;
		     }
		  System.out.println(v);
		}
	}
}