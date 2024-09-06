package Basic_Programs;

public class Volume {
	public static void main(String[]args) {
		double AOT=areaOfCircle(5);  
		double COC=circumferenceOfCircle(5); 
		double VOC=volumeOfCylinder(5,10);
		System.out.println(AOT);
		System.out.println(COC);
		System.out.println(VOC);
		return;
	}
	public static double areaOfTriangle(int base,int height) {
		double res=0.5d*base*height;
		return res;
	}
	public static double areaOfCircle(int radius) {
		double result=(22/7)*Math.pow(radius,2);
		return result;
	}
	public static double circumferenceOfCircle(int radius) {
		double result=Math.PI*2*radius;
		return result;
	}
	public static double volumeOfCylinder(int radius,int height) {
		double result1=Math.PI*Math.pow(radius,2)*height;
		return result1;
	}
	
	
}
