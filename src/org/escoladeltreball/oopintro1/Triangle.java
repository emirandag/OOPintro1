/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw26540084
 *
 */
public abstract class Triangle extends FigureImpl {

	protected double base;
	protected double height;
	protected double side1;
	protected double side2;
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	
	
	/**
	 * @param base
	 * @param height
	 * @param side1
	 * @param side2
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 3 * base;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * height / 2;
	}

	

}
