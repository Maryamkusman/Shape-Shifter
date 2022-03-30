///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               Myobject
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * The MyObject class defines the default behavior of methods. This class checks
 * the type to see if they are the same through an if statement.
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class MyObject {
	private String type;
	private String highLevelType;

	// TODO: WRITE METHOD HEADER.
	public MyObject() {
		type = "Undefined MyObject";
		highLevelType = "MyObject";
	}

	/**
	 * This method instantiates the type and high level type
	 *
	 * @param String    type this is a string
	 * @param highLevel type this is a string type
	 * @return nothing
	 */
	public MyObject(String type, String highLevelType) {
		this.type = type;
		this.highLevelType = highLevelType;
		return;
	}

	/**
	 * This method returns the type.
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method gets the highLeveltype.
	 *
	 * @return highLevelType
	 */
	public String getHighLevelType() {
		return highLevelType;
	}

	/**
	 * this compares the type of anotherObj and the object of the class
	 *
	 * @param (anotherObj) this is of the myObject type
	 * @return (description of the return value)
	 */
	public boolean isComparableWith(MyObject anotherObj) {
		if (this.getType().equals(anotherObj.getType())
				|| (this.getHighLevelType().equals(anotherObj.getHighLevelType())
						&& this.getHighLevelType().equals("Shape"))) {
			return true;

		}
		return false;
	}

	/**
	 * this checks the type of the class and another object to see if they are equal
	 * as well as the hgih level type and sets the highleveltype equal to list.
	 *
	 * @param anotherObj this is of the type MyObject
	 * @return this returns true then false
	 */
	public boolean isAddibleWith(MyObject anotherObj) {
		if (this.getType().equals(anotherObj.getType())
				&& (this.getHighLevelType().equals(anotherObj.getHighLevelType())
						&& this.getHighLevelType().equals("List"))) {
			return true;
		}
		return false;
	}

	/**
	 * this returns another anotherObj sets it to this.
	 *
	 * @param anotherObj this is of the type MyObject
	 * @return anotherObj
	 */
	public boolean equals(MyObject anotherObj) {
		return this == anotherObj;
	}

	/**
	 * this returns false
	 *
	 * @param anotherObj this is of the type MyObject
	 * @return false
	 */
	public boolean isLargerThan(MyObject anotherObj) {
		return false;
	}

	/**
	 * this is called add and anotherObj is passed into it. it is of the type MyObj
	 *
	 * @param anotherObj this is of the type MyObject
	 * @return null
	 */
	public MyObject add(MyObject anotherObj) {
		return null;
	}

	/**
	 * this is called divideByInteger and an integer of denominator is passed into
	 * it.
	 *
	 * @param denominator this is of the type int
	 * @return null
	 */
	public MyObject divideByInteger(int denominator) {
		return null;
	}

	/**
	 * this acceses the list length and is a getter
	 *
	 * @return 0
	 */
	public int getListLength() {
		return 0;
	}

	/**
	 * this acceses the integerAs and is a getter
	 * 
	 * @param an int i is passed in
	 * 
	 * @return 0
	 */
	public int getIntegerAt(int i) {
		return 0;
	}

	/**
	 * this acceses the integerAs and is a getter
	 * 
	 * @param an int i is passed in
	 * @return null
	 */
	public String getStringAt(int i) {
		return null;
	}

	/**
	 * this acceses the volume and is a getter
	 * 
	 * @return 0.0
	 */
	public double getVolume() {
		return 0.0;
	}

	/**
	 * this acceses the cuboidlength and is a getter
	 * 
	 * @return 0.0
	 */
	public double getCuboidLength() {
		return 0.0;
	}

	/**
	 * this acceses the width of the cuboid and is a getter
	 * 
	 * @return 0.0
	 */
	public double getCuboidWidth() {
		return 0.0;
	}

	/**
	 * this acceses the cuboidheight and is a getter
	 * 
	 * @return 0.0
	 */
	public double getCuboidHeight() {
		return 0.0;
	}

	/**
	 * this acceses the sphere radius and is a getter
	 * 
	 * @return 0.0
	 */
	public double getSphereRadius() {
		return 0.0;
	}

	/**
	 * this is the String class and is called toString
	 * 
	 * @return type
	 */
	@Override
	public String toString() {
		return type;
	}
}
