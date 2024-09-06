package Basic_Programs;

public class CheckNum {
	public static void main(String[] args) {
		int arr[]= {1,2,3,9};
		int arr2[]= {1,2,1};
		if(arr[0]==arr[arr.length]||arr[arr.length-1]==arr[0]) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
