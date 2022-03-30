///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               List
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * This class creates a list object and extends myObject. it also check if the
 * type of two objects are the same. This constructor has two arguments: String
 * listType and int length. This constructor should first set the type field
 * with the listType input and set the highLevelType field with the string
 * "List"
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class List extends MyObject {
	private int length;

	/**
	 * instantiated valirable from a super class and sets length to 0.
	 *
	 * @return nothign
	 */
	public List() {
		super("Undefined List", "List");
		length = 0;
	}

	/**
	 * instantiated variable and checls the lench if its less than 0 then sets
	 * lenfth to length is length is greater than 0
	 *
	 * @param listType this is a string
	 * @param length   this is an int type
	 * 
	 * @return nothing
	 */
	public List(String listType, int length) {
		super(listType, "List");
		this.length = length;
		if (length < 0) {
			length = 0;
		} else {
			this.length = length;
		}

		return;
	}

	/**
	 * this retrives the list length and is a getter
	 * 
	 * @return length
	 */
	public int getListLength() {
		return length;
	}

	/**
	 * checks if types and lengths are the same between anotherobj and class
	 * variable
	 * 
	 * @param anotherObj with type MyObj
	 * 
	 * @return false
	 */
	@Override
	public boolean equals(MyObject anotherObj) {
		if (this.getType().equals(anotherObj.getType()) && this.getListLength() == anotherObj.getListLength()) {
			return true;
		}
		return false;
	}

	/**
	 * checks if types and lengths are the same between anotherobj and class
	 * variable
	 *
	 * @param anotherObj with type MyObj
	 * @return false
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
		if (this.getType().equals(anotherObj.getType()) && this.getListLength() > anotherObj.getListLength()) {
			return true;
		}
		return false;
	}

	/**
	 * this is a to string method which converts length to a string
	 *
	 * @return length to a string
	 */
	@Override
	public String toString() {
		return super.toString() + " - Length: " + length;
	}
}