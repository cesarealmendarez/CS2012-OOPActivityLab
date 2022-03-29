// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package project;

public class Shape {
	
	public static void main(String[] args) {
		Circle circleObjectOne = new Circle("blue", 0.5);
		Circle circleObjectTwo = new Circle("red", 5.0);
			
		Square squareObjectOne = new Square(10.0, "yellow");
		Square squareObjectTwo = new Square(20.0, "green");
			
		Rectangle rectangleObjectOne = new Rectangle(100.0, 35.0, "cyan");
		Rectangle rectangleObjectTwo = new Rectangle(175.0, 65.0, "dark red");
		
		System.out.println("CIRCLE ONE VALUES:");
		System.out.println("Radius: " + circleObjectOne.getRadius() + ", Color: " + circleObjectOne.getColor() + ", Area: " + circleObjectOne.getCircleArea(circleObjectOne.getRadius()));
		
		System.out.println("CIRCLE TWO VALUES:");
		System.out.println("Radius: " + circleObjectTwo.getRadius() + ", Color: " + circleObjectTwo.getColor() + ", Area: " + circleObjectTwo.getCircleArea(circleObjectTwo.getRadius()));
		
		System.out.println();
		
		System.out.println("SQUARE ONE VALUES:");
		System.out.println("Side: " + squareObjectOne.getSide() + ", Color: " + squareObjectOne.getColor() + ", Area: " + squareObjectOne.getSquareArea(squareObjectOne.getSide()));
		
		System.out.println("SQUARE TWO VALUES:");
		System.out.println("Side: " + squareObjectTwo.getSide() + ", Color: " + squareObjectTwo.getColor() + ", Area: " + squareObjectTwo.getSquareArea(squareObjectTwo.getSide()));
			
		System.out.println();
		
		System.out.println("RECTANGLE ONE VALUES:");
		System.out.println("Width: " + rectangleObjectOne.getWidth() + ", Height: " + rectangleObjectOne.getHeight() + ", Area: " + rectangleObjectOne.getRectangleArea(rectangleObjectOne.getWidth(), rectangleObjectOne.getHeight()) + ", Permimeter: " + rectangleObjectOne.getRectanglePerimeter(rectangleObjectOne.getWidth(), rectangleObjectOne.getHeight()) + ", Color: " + rectangleObjectOne.getColor());
		
		
		System.out.println("RECTANGLE TWO VALUES:");
		System.out.println("Width: " + rectangleObjectTwo.getWidth() + ", Height: " + rectangleObjectTwo.getHeight() + ", Area: " + rectangleObjectTwo.getRectangleArea(rectangleObjectTwo.getWidth(), rectangleObjectTwo.getHeight()) + ", Permimeter: " + rectangleObjectTwo.getRectanglePerimeter(rectangleObjectTwo.getWidth(), rectangleObjectTwo.getHeight()) + ", Color: " + rectangleObjectTwo.getColor());

	}

}
