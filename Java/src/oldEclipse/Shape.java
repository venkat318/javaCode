package oldEclipse;
//override: parent method in child class
public class Shape {
	
	double dim1, dim2;
	public Shape(double d1,double d2) {
		dim1 = d1;
		dim2 = d2;
	}
	double area() {
		return (dim1*dim2);
	}

}
