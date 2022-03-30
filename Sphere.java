///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               Sphere
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * This class creates a sphere that extends shape. It calulates the volume of a
 * sphere. This constructor has one argument: double radius. This constructor
 * should set the type field to the string "Sphere", set the volume field based
 * on the input
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class Sphere extends Shape {
	static final double PI = 3.1415;
	static final double CONSTANT = 4.0 / 3.0;
	private double radius;

	/**
	 * instantiated valirable from a super class and sets radius to 0.
	 *
	 * @return nothign
	 */
	public Sphere() {
		super("Sphere", 0.0);
		radius = 0.0;
	}

	/**
	 * instantiated valirable from a super class and calculates volume
	 *
	 * @return nothign
	 */
	public Sphere(double radius) {
		super("Sphere", CONSTANT * PI * radius * radius * radius);
		this.radius = radius;
		// call super to calculate volume()
		// calculate volume
		// super("Sphere", volume);
		return;
	}

	/**
	 * this acceses the sphere radius and is a getter
	 *
	 * @return radius
	 */
	public double getSphereRadius() {
		return radius;
	}

	/**
	 * this is a to string method which converts radius to a string
	 *
	 * @return radius to a string
	 */
	@Override
	public String toString() {
		return super.toString() + ", Radius: " + radius;
	}
}
