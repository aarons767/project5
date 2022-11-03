
public class Circle extends Shape{
	
	private double radius;
	
	/**
	 * Computes the area of this Circle
	 */
	@Override
	public double computeArea() {
		return (Math.PI) * Math.pow(radius, 2);
	}

}
