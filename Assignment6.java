///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment6.java
// Files:              Assignment6.java
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman
// Email:              musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa 
//

public class Assignment6 {
	private static final String NON_COMPARABLE_MSG = "Contains two or more objects that are not comparable";
	private static final String NON_ADDABLE_MSG = "Contains two or more objects that are not addible";

	/**
	 * this sorts an array using previous methods
	 *
	 * @param objList with type MyObject[] which is an array
	 * @return true
	 */
	public static boolean sort(MyObject[] objList) {
		for (int i = 0; i < objList.length; i++) {
			MyObject min = objList[i];
			int minIndex = i;
			for (int j = i; j < objList.length; j++) {
				if (!objList[i].isComparableWith(objList[j])) {
					System.out.println(NON_COMPARABLE_MSG);
					return false;
				}
				if (min.isLargerThan(objList[j])) {
					min = objList[j];
					minIndex = j;
				}

			}
			objList[minIndex] = objList[i];
			objList[i] = min;
		}
		return true;
	}

	/**
	 * sums up objects in objlist and result divided by object length
	 *
	 * @param objList with type MyObject[] which is an array
	 * @return the sum of the length of objlist
	 */
	public static MyObject mean(MyObject[] objList) {
		MyObject sum = objList[0];
		for (int i = 1; i < objList.length; i++) {
			if (!sum.isAddibleWith(objList[i])) {
				System.out.println(NON_ADDABLE_MSG);
				return null;
			}

			sum = sum.add(objList[i]);
		}
		return sum.divideByInteger(objList.length);
	}

	/**
	 * Find the index of the first object in objList that is considered equal
	 *
	 * @param objList with type MyObject[] which is an array
	 * @param target  with type MyObject which is not an array
	 * @return -1
	 */
	public static int findIndex(MyObject[] objList, MyObject target) {
		for (int i = 0; i < objList.length; i++) {
			if (objList[i].equals(target))
				return i;
		}
		return -1;
	}

	/**
	 * checks if each unit test passes
	 * 
	 * @return true if unit tests pass
	 */
	public static boolean unitTests() {
		// Consider testing:
		// 1. an array of StringList objects
		// 2. an array of IntegerList objects
		// 3. an array of Cuboid objects
		// 4. an array of Sphere objects
		// 5. an array with a combination of objects

		// Magic numbers and strings are okay when testing!

		if (!equalTester()) {
			return false;
		}
		if (!equalTester2()) {
			return false;
		}
		if (!equalTester3()) {
			return false;
		}
		if (!equalTester4()) {
			return false;
		}
		if (!equalTester5()) {
			return false;
		}
		return true;
	}

	public static boolean equalTester() {
		StringList[] stringlist = new StringList[3];
		stringlist[0] = new StringList(new String[] { "Hello", "My", "Name", "Is", "Maryam" });
		stringlist[1] = stringlist[0];

		if (!stringlist[0].equals(stringlist[1]))
			return false;

		return true;
	}

	public static boolean equalTester2() {
		IntegerList[] integerlist = new IntegerList[3];
		integerlist[0] = new IntegerList(new int[] { 1, 2, 3, 4, 5 });
		integerlist[1] = integerlist[0];

		if (!integerlist[0].equals(integerlist[1]))
			return false;
		return true;
	}

	public static boolean equalTester3() {
		Cuboid[] cuboid = new Cuboid[] { new Cuboid(1, 2, 3), new Cuboid(3, 4, 5) };
		cuboid[1] = cuboid[0];

		if (!cuboid[0].equals(cuboid[1]))
			return false;
		System.out.println("Unit Test 3 passed!");
		return true;
	}

	public static boolean equalTester4() {
		Sphere[] sphere = new Sphere[] { new Sphere(1), new Sphere(3) };
		sphere[1] = sphere[0];

		if (!sphere[0].equals(sphere[1]))
			return false;
		System.out.println("Unit Test 4 passed!");
		return true;
	}

	public static boolean equalTester5() {
		IntegerList[] integerlist = new IntegerList[4];
		integerlist[0] = new IntegerList(new int[] { 1, 2, 3, 4, 5 });
		integerlist[1] = integerlist[0];

		if (!integerlist[0].equals(integerlist[1]))
			return false;
		return true;
	}

	/**
	 * this is the main class which executes the enture program and calls all the
	 * methods such that it can run
	 *
	 * @param args with type String[]
	 * @return nothing
	 */
	public static void main(String[] args) {
		// Perform unitTests first
		if (unitTests()) {
			System.out.println("All unit tests passed.\n");
		} else {
			System.out.println("Failed test.\n");
			return;
		}

		IntegerList[] intList = new IntegerList[3];
		intList[0] = new IntegerList(new int[] { 1, 2, 3, 4 });
		intList[1] = new IntegerList(new int[] { 3, 4, 4, 6 });
		intList[2] = new IntegerList(new int[] { -4, 6, 10 });

		IntegerList target1 = new IntegerList(new int[] { -4, 6, 10 });
		int idx = findIndex(intList, target1);
		System.out.println("\nindex:\n" + idx);

		System.out.println("\nmean:");
		MyObject mean = mean(intList);
		if (mean != null) {
			System.out.println(mean.toString());
		}

		System.out.println("\nsorted:");
		if (sort(intList)) {
			for (int i = 0; i < intList.length; i++) {
				System.out.println(intList[i].toString());
			}
		}
	}
}