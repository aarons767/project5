
public class Triangle extends Shapes{

	private double baseLength;
	private double height;
	
	/**
	 * Computes the area of this Triangle
	 * @return the area of this Triangle
	 */
	@Override
	public double computeArea() {

		return (1/2.0)  * baseLength * height;
	}

}
