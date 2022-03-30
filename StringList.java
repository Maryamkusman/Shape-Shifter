///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               StringList
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * This class creates a stringlist that extends list it concatenates a string as
 * well as adds them. This constructor has one argument: String[] list. This
 * constructor should set the type field to the string "String List", set the
 * length field to the length of the input list, and set the strings field to
 * input list. Bugs: unknown
 *
 * @author Maryam Usman
 */
public class StringList extends List {
	private String[] strings;

	/**
	 * instantiated valirable from a super class and sets string list to strings
	 *
	 * @return nothign
	 */
	public StringList() {
		super("String List", 1);
		strings = new String[1];
	}

	/**
	 * instantiated valirables from a super class
	 *
	 * @return nothign
	 */
	public StringList(String[] list) {
		super("String List", list.length);
		this.strings = list;
		return;
	}

	/**
	 * checks if types and lengths are the same between anotherobj and class
	 * variable
	 *
	 * @param anotherObj with type MyObject
	 * @return true
	 */
	@Override
	public boolean equals(MyObject anotherObj) {
		if (!this.getType().equals(anotherObj.getType())) {
			return false;
		} else if (super.getListLength() != anotherObj.getListLength()) {
			return false;
		}
		for (int i = 0; i < strings.length; i++) {
			if (!this.getStringAt(i).equals(anotherObj.getStringAt(i))) {
				return false;
			}
		}
		return true;

	}

	/**
	 * this acceses the stringAt and is a getter
	 *
	 * @return strings at index idx
	 */
	public String getStringAt(int idx) {
		return strings[idx];
	}

	/**
	 * iterates through strings array and adds the valuesof and them compares to
	 * anotherObj sum variable
	 *
	 * @param anotherObj with type MyObject
	 * @return false
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {

		int sum2 = 0;
		for (int i = 0; i < strings.length; i++) {
			sum2 += strings[i].length();

		}
		int sum3 = 0;
		for (int i = 0; i < anotherObj.getListLength(); i++) {
			sum3 += anotherObj.getStringAt(i).length();
		}

		if (sum2 > sum3) {
			return true;
		}

		return false;
	}

	// TODO: IMPLEMENT THIS METHOD.
	// NOTE: IT WILL NOT MATTER WHICH STRING IS PREPENDED/APPENDED BECAUSE
	// THE TESTERS WILL DEPEND ON THE LENGTHS OF STRING, NOT ITS CONTENTS.
	// JUST MAKE SURE YOU ARE NOT PERFORMING ARRAY OUT-OF-BOUND ACCESS.
	/**
	 * Perform element-wise concatenation of the current StringList and the input
	 * anotherObj. In case two StringLists have different lengths, keep the exceeded
	 * part of the longer StringList unchanged. Then, return a newly created
	 * StringList that contains your result
	 *
	 * @param anotherObj with type MyObject
	 * @return newStringList
	 */
	public MyObject add(MyObject anotherObj) {
		int shorter1 = Math.min(strings.length, anotherObj.getListLength());
		int longer1 = Math.max(strings.length, anotherObj.getListLength());

		String[] intList2 = new String[longer1];
		if (strings.length > anotherObj.getListLength()) {
			for (int i = 0; i < longer1; i++) {
				intList2[i] = strings[i];
			}
			for (int i = 0; i < shorter1; i++) {
				intList2[i] += anotherObj.getStringAt(i);
			}
		} else {
			for (int i = 0; i < longer1; i++) {
				intList2[i] = anotherObj.getStringAt(i);
			}
			for (int i = 0; i < shorter1; i++) {
				intList2[i] += strings[i];
			}
		}
		StringList newStringList = new StringList(intList2);
		return newStringList;
	}

	/**
	 * checks if denominator is less than or equal to 0 then sets to 1. this
	 * iterates and adds then divides by denominator and returns
	 *
	 * @param denominator with type int
	 * @return newStringList(array1)
	 */
	public MyObject divideByInteger(int denominator) {
		String[] array1 = new String[strings.length];
		if (denominator <= 0) {
			denominator = 1;
		}
		for (int i = 0; i < strings.length; i++) {
			array1[i] = strings[i].substring(0, strings[i].length() / denominator);

		}

		return new StringList(array1);
	}

	/**
	 * this is a to string method which converts to a string
	 *
	 * @return result to a string
	 */
	@Override
	public String toString() {
		String result = super.toString() + ", Elements: [";
		for (int i = 0; i < this.getListLength() - 1; i++) {
			result += "" + strings[i] + ", ";
		}
		result += "" + strings[this.getListLength() - 1] + "]";
		return result;
	}
}
