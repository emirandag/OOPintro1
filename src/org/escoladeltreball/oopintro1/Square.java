/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw26540084
 *
 */
public class Square extends FigureImpl {

	private double lado;

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	/**
	 * @param lado
	 */
	public Square(double lado) {
		this.lado = lado;
	}

}
