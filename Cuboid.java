///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               Cuboid
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * THis class creates a cuboid and extends shape. It calculates the volume of a
 * cuboid. This constructor has three arguments: double length, double width,
 * and double height. This constructor should set the type field to the string
 * "Cuboid", set the volume field based on the input
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class Cuboid extends Shape {
	private double length;
	private double width;
	private double height;

	/**
	 * instantiated valirable from a super class and sets length width and height to
	 * 0.0
	 *
	 * @return nothing
	 */
	public Cuboid() {
		super("Cuboid", 0.0);
		length = 0.0;
		width = 0.0;
		height = 0.0;
	}

	/**
	 * instantiated valirable from a super class and sets length width and height to
	 * their respective values. this also calculates volume of cuboid
	 *
	 * @return nothing
	 */
	public Cuboid(double length, double width, double height) {
		// int volume=length*width*height;
		super("Cuboid", length * width * height);
		this.length = length;
		this.width = width;
		this.height = height;
		return;
	}

	/**
	 * this acceses the cuboidlength and is a getter
	 * 
	 * @return length
	 */
	public double getCuboidLength() {
		return length;
	}

	/**
	 * this acceses the cuboidwdith and is a getter
	 * 
	 * @return width
	 */
	public double getCuboidWidth() {
		return width;
	}

	/**
	 * this acceses the cuboidheight and is a getter
	 * 
	 * @return height
	 */
	public double getCuboidHeight() {
		return height;
	}

	/**
	 * checks if lengths are the same between anotherobj and class variable
	 *
	 * @param anotherObj with type MyObj
	 * @return false
	 */
	@Override
	public boolean equals(MyObject anotherObj) {
		if (super.equals(anotherObj) && this.length == anotherObj.getCuboidLength()
				&& this.width == anotherObj.getCuboidWidth() && this.height == anotherObj.getCuboidHeight()) {
			return true;
		}
		return false;
	}

	/**
	 * this is a to string method which converts width to a string
	 *
	 * @return width to a string
	 */
	@Override
	public String toString() {
		return super.toString() + ", Length: " + length + ", Width: " + width + ", Height: " + height;
	}
}
