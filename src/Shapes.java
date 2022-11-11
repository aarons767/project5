import java.util.*;

public class Shapes {
	

	private ArrayList<Shapes> shapeList;
	
	public double computeArea() {
		return 0;
		
	}

	/**
	 * Fully loaded constructor 
	 * @param shapeList the list of shapes
	 */
	public Shapes(ArrayList<Shapes> shapeList) {
		this.shapeList = shapeList;
	}
	
	/**
	 * Default Shape constructor
	 */
	public Shapes() {
		this.shapeList = new ArrayList<Shapes>();
	}
	/**
	 * @return the shapeList
	 */
	public ArrayList<Shapes> getShapeList() {
		return shapeList;
	}

	/**
	 * @param shapeList the shapeList to set
	 */
	public void setShapeList(ArrayList<Shapes> shapeList) {
		this.shapeList = shapeList;
	}

	
	/**
	 * Adds a shape to the list of shapes 
	 * Prevents addition of duplicates
	 * @shape shape the shape to be added to this list
	 */
	public void addShape(Shapes shape) {
		if(!this.getShapeList().contains(shape))  //won't add repeats
			this.getShapeList().add(shape);
		
	}
	
	/**
	 *Removes this shape if it is there in this list
	 *@param shape the shape to be added to this list
	 */
	public void removeShape(Shapes shape) {
		if(this.getShapeList().contains(shape))  //won't add repeats
			this.getShapeList().remove(shape);
	}
	
	/**
	 * Iterates through shapeList then prints out the 
	 * area of each respective shape to command line
	 */
	synchronized public void compute() {
		for(Shapes currShape : this.shapeList) {
			Thread thr = new Thread() {
				
			public void run() {
				System.out.println(currShape.computeArea());
			}
		
			
		};
		thr.start();
	}

	
	
}
	
