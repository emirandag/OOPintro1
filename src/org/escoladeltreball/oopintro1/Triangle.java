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
	 * @param side1
	 * @param side2
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	@Override
	public double perimeter() {
		return side1 + side2 + base;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return base * height / 2;
	}

	

}
