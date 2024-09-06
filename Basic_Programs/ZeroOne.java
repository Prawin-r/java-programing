package Basic_Programs;
import java.util.Arrays;
public class ZeroOne {
	
	public static void main(String[] args) {
		int [] arr= {1,0,0,1,0,1};
		int [] arr2=new int[arr.length];
		int l=0;
		int i = 0;
		int r=arr.length-1;
		while(i<arr.length) {
			if(arr[i]==0) {
				arr2[0]=0;
				l++;
		//	System.out.print(arr[i]);
			
		    }
			else {
				arr2[r]=1;
				r--;
			}
		  i++;
//			}
//		int j = 0;
//		while(j<arr.length) {
//			if(arr[j]==1) {
//			System.out.print(arr[j]);
//			
//		    }
//		  j++;
			}
		System.out.println(Arrays.toString(arr2));


}
}
