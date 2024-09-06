package UpcastingDowncasting;

public class arraySum {
	public static void main(String[] args) {
		
	
	int a[]= {10,20,12,28,13};
	int N=5;
	int k=3;
	int s=0;
	for(int i=0;i<a.length-3;i++) {
		s=a[i]+a[i+2];
		i++;
		System.out.println(s);
	    
	}

}
}
