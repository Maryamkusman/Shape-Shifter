///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               Shape
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * Shape and List are two subclasses of MyObject.This class checks if the type
 * is equal for two objects.
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class Shape extends MyObject {
	private double volume;

	/**
	 * this returns a volume of 0.0 and calls the super class and passes in 2 things
	 *
	 * @return 0.0
	 */
	public Shape() {
		super("Undefined Shape", "Shape");
		volume = 0.0;
	}

	/**
	 * this method checks the volume is less than 0then it sets the volume to 0.
	 *
	 * @return nothing
	 */
	public Shape(String shape, double volume) {
		super(shape, "Shape");
		this.volume = volume;
		if (this.volume < 0) {
			this.volume = 0;
		}
		return;
	}

	/**
	 * this is a getter and retrives the volume
	 *
	 * @return volume
	 */
	public double getVolume() {
		return this.volume;
	}

	/**
	 * this is a boolean called equals and checks if the type of anotherObj is the
	 * same as the type of the class. and if the volumes are the same.
	 *
	 * @param anotherObj of the type MyObject
	 * @return false
	 */
	@Override
	public boolean equals(MyObject anotherObj) {
		if (this.getType().equals(anotherObj.getType()) && this.getVolume() == anotherObj.getVolume()) {
			return true;
		}
		return false;
	}

	/**
	 * this is a boolean called isLargerthan and checks if the highleveltype of
	 * anotherObj is the same as the highleveltype of the class. and if the volumes
	 * are different
	 *
	 * @param anotherObj of the type MyObject
	 * @return false
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
		if (this.getHighLevelType().equals(anotherObj.getHighLevelType())
				&& this.getVolume() > anotherObj.getVolume()) {
			return true;
		}
		return false;
	}

	/**
	 * this is a to string method which converts volume to a string
	 *
	 * @param anotherObj of the type MyObject
	 * @return volume to a string
	 */
	@Override
	public String toString() {
		return super.toString() + " - Volume: " + volume;
	}
}
