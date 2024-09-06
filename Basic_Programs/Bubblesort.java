package Basic_Programs;
import java.util.Arrays;
public class Bubblesort 
{
	public static void main(String[] args) 
	{
	int [] arr= {1,0,1,2,1,3,1,0};
	for (int i=0;i<arr.length;i++) 
	{
		for(int j=0;j<arr.length;j++)
		{
		if(arr[i]<arr[j]) 
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		}
	}
	System.out.println(Arrays.toString(arr));
    }
	
}

