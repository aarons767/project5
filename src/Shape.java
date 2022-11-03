import java.util.*;

public abstract class Shape {

	private ArrayList<Shape> shapeList;
	
	public abstract double computeArea();

	/**
	 * Fully loaded constructor 
	 * @param shapeList the list of shapes
	 */
	public Shape(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	/**
	 * Default Shape constructor
	 */
	public Shape() {
		this.shapeList = new ArrayList<Shape>();
	}
	/**
	 * @return the shapeList
	 */
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	/**
	 * @param shapeList the shapeList to set
	 */
	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	public void test() {
		
	}
	
	/**
	 * Adds a shape to the list of shapes 
	 * Prevents addition of duplicates
	 * @shape shape the shape to be added to this list
	 */
	public void addShape(Shape shape) {
		if(!this.getShapeList().contains(shape))  //won't add repeats
			this.getShapeList().add(shape);
		
	}
	
	/**
	 *Removes this shape if it is there in this list
	 *@param shape the shape to be added to this list
	 */
	public void removeShape(Shape shape) {
		if(this.getShapeList().contains(shape))  //won't add repeats
			this.getShapeList().remove(shape);
	}
	
	/**
	 * Iterates through shapeList then prints out the 
	 * area of each respective shape to command line
	 */
	public void compute() {
		for(Shape currShape : this.shapeList) {
			System.out.println(currShape.computeArea());
		}
	}
	
}
	
