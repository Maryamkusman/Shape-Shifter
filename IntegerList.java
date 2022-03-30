///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment6
// File:               IntegerList
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
/**
 * this class creates an instance of an intefer list which extends list.
 * IntegerList and StringList are two subclasses of List.This constructor has
 * one argument: int[] list. This constructor should set the type field to the
 * string "Integer List", set the length field to the length of the input list,
 * and set the integers field to input list Bugs: unknown
 *
 * @author Maryam Usman
 */
public class IntegerList extends List {
	private int[] integers;

	/**
	 * instantiated valirable from a super class and sets integer list to integers
	 *
	 * @return nothign
	 */
	public IntegerList() {
		super("Integer List", 1);
		integers = new int[1];
	}

	/**
	 * instantiated valirables from a super class
	 *
	 * @return nothign
	 */
	public IntegerList(int[] list) {
		super("Integer List", list.length);
		this.integers = list;
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
		for (int i = 0; i < integers.length; i++) {
			if (this.getIntegerAt(i) != anotherObj.getIntegerAt(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * this acceses the integerat and is a getter
	 *
	 * @return integets at index idx
	 */
	public int getIntegerAt(int idx) {
		return this.integers[idx];
	}

	/**
	 * iterates through integers array and adds the valuesof and them compares to
	 * anotherObj sum variable
	 *
	 * @param anotherObj with type MyObject
	 * @return false
	 */
	@Override
	public boolean isLargerThan(MyObject anotherObj) {
		int sum = 0;
		for (int i = 0; i < integers.length; i++) {
			sum += integers[i];

		}
		int sum1 = 0;
		for (int i = 0; i < anotherObj.getListLength(); i++) {
			sum1 += anotherObj.getIntegerAt(i);

		}
		if (sum > sum1) {
			return true;
		}

		return false;
	}

	/**
	 * Perform element-wise concatenation of the current StringList and the input
	 * anotherObj. In case two StringLists have different lengths, keep the exceeded
	 * part of the longer StringList unchanged. Then, return a newly created
	 * StringList that contains your result
	 *
	 * @param anotherObj with type MyObject
	 * @return newIntegerList
	 */
	public MyObject add(MyObject anotherObj) {
		/*
		 * int maxLength = // whichever is longer; int[] result = new int[maxLength];
		 * result[i] = ? int[] result = new int[maxLength]; result -> {0,0,0,0};
		 * this.integers -> {1,2,3}; anotherObj.integers -> {1,2,3,4}; for loop over
		 * this.integers result -> {1,2,3,0}; for loop over anotherObj.integers result
		 * -> {2,4,6,4};
		 * 
		 */
		int shorter = Math.min(integers.length, anotherObj.getListLength());
		int longer = Math.max(integers.length, anotherObj.getListLength());

		int[] intList1 = new int[longer];
		if (integers.length > anotherObj.getListLength()) {
			for (int i = 0; i < longer; i++) {
				intList1[i] = integers[i];
			}
			for (int i = 0; i < shorter; i++) {
				intList1[i] += anotherObj.getIntegerAt(i);
			}
		} else {
			for (int i = 0; i < longer; i++) {
				intList1[i] = anotherObj.getIntegerAt(i);
			}
			for (int i = 0; i < shorter; i++) {
				intList1[i] += integers[i];
			}
		}
		IntegerList newIntegerList = new IntegerList(intList1);
		return newIntegerList;
	}

	/**
	 * checks if denominator is less than or equal to 0 then sets to 1. this
	 * iterates and adds then divides by denominator and returns
	 *
	 * @param denominator with type int
	 * @return newIntegerList
	 */
	public MyObject divideByInteger(int denominator) {
		if (denominator <= 0) {
			denominator = 1;
			// return IntegerList;
		}

		int[] answer = new int[integers.length];

		for (int i = 0; i < integers.length; i++) {
			answer[i] = integers[i] / denominator;
		}

		return new IntegerList(answer);
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
			result += "" + integers[i] + ", ";
		}
		result += "" + integers[this.getListLength() - 1] + "]";
		return result;
	}
}
