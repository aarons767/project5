
public class Hexagon extends Shape{
	
	private double sideLength;
	
	/**
	 * Computes the area of this Hexagon
	 * using its side length
	 * @return the area of this Hexagon
	 */
	@Override
	public double computeArea() {
		double area;
		area = ((3 * (Math.sqrt(3)))/2) * sideLength * sideLength;
		return area;
	}

}
