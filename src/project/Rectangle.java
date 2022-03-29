// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package project;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle(double w, double h, String c) {
		width = w;
		height = h;
		color = c;
	}

	//	GETTERS AND SETTERS FOR RECTANGLE WIDTH	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	//	GETTERS AND SETTERS FOR RECTANGLE HEIGHT
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//	GETTERS AND SETTERS FOR RECTANGLE COLOR
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getRectangleArea(double width, double height) {
		double rectangleArea = width * height;
		
		return rectangleArea;
	}
	
	public double getRectanglePerimeter(double width, double height) {
		double rectanglePerimeter = 2 * (height + width);
		
		return rectanglePerimeter;
	}	
	
}
