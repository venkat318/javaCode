package oldEclipse;

public class Rectangle extends Shape {

	public Rectangle(double d1, double d2) {
		super(d1,d2);
	}
	public double area() {
		return dim1*dim2+10;
	}
	
	
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10.0,20.0);
		System.out.println("Area: " +r.area());
	}

}
