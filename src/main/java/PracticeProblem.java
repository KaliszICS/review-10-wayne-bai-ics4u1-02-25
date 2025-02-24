public class PracticeProblem {

	public static String whitespace = " ";

	public static String pyramid(int size) {
		String val = "";

		for (int y = 1; y <= size; y++) {

			int spaceQuota = size - 1;
			int asteriskQuota = y;
			int quotax = size + y - 1;
			for (int x = 0; x <= quotax; x++) {
				
				if (x < size - y || (x + y%2) % 2 == 0 && spaceQuota > 0) {
					val += whitespace;
					spaceQuota -= 1;
				} else if (asteriskQuota > 0) {
					val += "*";
					asteriskQuota -= 1;
				} else {
					// System.out.println(asteriskQuota + whitespace + spaceQuota);
					// System.out.println("breaking: " + y);
					break;
				}
			}
			if (y != size) {val += "\n";}
			// System.out.println(y);
		}
		return val;
	}

	public static String square(int size) {
		String val = "";

		for (int y = 1; y <= size; y++) {
			for (int x = 1; x <= size; x++) {
				if (y == 1 || y == size || x == 1 || x == size) {
					val += "*";
				} else {
					val += whitespace;
				}
			}
			if (y != size) {val += "\n";}
		}
		return val;
	}

	public static void main(String args[]) {
		System.out.print(pyramid(3));
		System.out.println(square(5));
	}

	public static boolean hasLowercase(String thisString) {
		 return !thisString.toUpperCase().equals(thisString);
	}
}

/*
# Instructions  

  ## Questions

1. Create a function called _pyramid()_ which takes in an integer as a parameter.
Return string with a pyramid of asterisks(*) back to the user of that many rows.

pryamid(4) returns:

   *
  * *
 * * *
* * * *

2. Create a function called _square()_ which takes in an integer as a parameter.
Return string with a triangle of asterisks(*) back to the user of that many rows and columns.

Example:

square(3) returns:

		***
		* *
		***

3. Create a function called _hasLowercase_() that take in a String.  return true if the String has a lowercase letter in it.  Return false otherwise.
*/