// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package project;

public class Square {
	private double side;
	private String color;
	
	public Square(double s, String c) {
		side = s;
		color = c;
	}
	
	// GETTERS AND SETTERS FOR SQUARE SIDES
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
		
	// GETTERS AND SETTERS FOR SQUARE COLOR 	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getSquareArea(double side) {
		double squareArea = Math.pow(side, 2);
		return squareArea;
	}
}
