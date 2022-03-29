// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package project;

public class Circle {
	private String color;
	private double radius;
	
	public Circle(String c, double r) {
		color = c;
		radius = r;
	}
	
	// GETTERS AND SETTERS FOR CIRCLE COLOR	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// GETTERS AND SETTERS FOR CIRCLE RADIUS	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getCircleArea(double radius) {
		double circleArea = Math.PI * (Math.pow(radius, 2));
		
		return circleArea;
	}
}
