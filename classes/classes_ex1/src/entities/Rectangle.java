package entities;

public class Rectangle {

	public Double width;
	public Double height;

	public double area() {
		return height * width;

	}

	public double perimeter() {
		return 2 * (width * height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
