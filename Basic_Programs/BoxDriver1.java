package Basic_Programs;


	class Box {
	    double length;
	    double width;
	    double area;

	    Box() {
	        System.out.println("BOX IS GETTING READY");
	    }

	    Box(double length) {
	        this();
	        this.length = length;
	        System.out.println("LENGTH IS READY");
	    }

	    Box(double length, double width) {
	        this(length);
	        this.width = width;
	        System.out.println("WIDTH IS READY");
	    }

	    Box(double length, double width, double area) {
	        this(length, width);
	        this.area = area;  
	        System.out.println("Area: " + this.area);
	    }
	}

	class BoxDriver1 {
	    public static void main(String[] args) {
	        double length = 2.5;
	        double width = 3;
	        double area = length * width;
	        Box var = new Box(length, width, area);  // Pass the pre-calculated area
	    }
	}


