package Basic_Programs;

public class Circle {
	private double radius;
	public double area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		System.out.println(radius);
	}
    Circle(){
    	
    }
    Circle(double radius){
    	setRadius(radius);
    	area=Math.PI*radius*radius;
    	System.out.println(area);
    
	}

}
