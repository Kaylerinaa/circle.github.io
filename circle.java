package Lab194;

public class Circle {
	private double radius;
	private final double PI = 3.14159;
	public Circle(double r) {
		radius = r;
	}

	public Circle() {
		radius = 0.0d;
	}
	
	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {   
		return radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public double getDiameter() {
		return radius * 2;
	}

	public double getCircumference() {
		return 2 * PI * radius;
	}

	public void setDiameter(double diameter) {
	}
}
