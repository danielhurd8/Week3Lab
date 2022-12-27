
public class Week3LabExample {

	public static void main(String[] args) {
	/*Question 1
	 *Create an array with the following values 1,5,2,8,13,6
	 */
	
	int[] array = {1,5,2,8,13,6};
	
	/*Question 2
	 *Print out the first element in the array 
	 */
	System.out.println(array[0]);
	
	/*Question 3
	 *Print out the last element in the array without using the number 5 
	 */
	System.out.println(array[array.length - 1]);
	
	/*Question 4
	 *Print out the element in the array at position 6. what happens?
	 *Answer-- It gave an error indicating that I have tried to pull an element outside of the limits of the array.
	 */
	//System.out.println(array[6]);
	
	/*Question 5
	 *Print out the element in the array at position -1. what happens?
	 *Answer-- It gave an error indicating that I have tried to pull an element outside of the limits of the array.
	 */
	//System.out.println(array[-1]);
	
	/*Question 6
	 * Write a traditional for loop that prints out each element in the array
	 */
	
	for(int a = 0; a < array.length; a++) {
		System.out.println(array[a]);
	}
	
	/*Question 7
	 *Write an enhanced for loop that prints out each element in an array
	 */
	
	for (int number : array) {
		System.out.println(number);
	}
	
	/*Question 8
	 *Create a new variable called sum, write a loop that adds each element in the array to the sum 
	 */
	int sum = 0;
	for (int number : array) {
		sum += number;
		System.out.println(sum);
		}
	
	/*Question 9
	 *Create a new variable called average and assign the average value of the array to it 
	 */
	
	int average = sum / array.length;
	System.out.println(average);
	
	/*Question 10
	 * Write and enhanced for loop that prints out each number in the array only if the number is odd.
	 */
	for (int number : array) {
		if (number % 2 == 1);
		System.out.println(number);	
	}
	
	/*Question 11
	 *Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
	 */
	
	String[] Names = {"Sam", "Sally", "Thomas", "Robert"};
	
	/*Question 12
	 *Calculate the sum of all the letters in the new array 
	 */
	int sumOfLetters = 0;
	for (String name : Names) {
		sumOfLetters += name.length();
	}
	/*Question 13
	 *Write and test a method that takes a String name and prints out a greeting, this method returns nothing 
	 */
		greet ("Daniel");
	
	/*Question 14
	 *Write and test a method that takes a String name and returns a greeting, do not print in the method 
	 */
		greet2("Daniel");
		System.out.println(greet2("Daniel"));
		
				//or
		
		//String greeting = greet2("Daniel");
		//System.out.println(greeting);
	
	/*Question 15
	 *Analyze the difference between these two methods - what do you find? How are the different 
	 */
		//ANSWER: The method used in question 13 requested that it prints out a greeting. The method in question 14 will actually returns a greeting.
	
	/*Question 16
	 *Write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int 
	 */
	
	isStringLongerThanNumber("Hello",3);
	System.out.println(isStringLongerThanNumber("Hello", 6));
	
	/*Question 17
	 *Write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array. 
	 */
	System.out.println(doesArrayContainString(Names, "Robert"));
	
	/*Question 18
	 *Write and test a method that takes an array of int and returns the smallest number in the array
	 */
	System.out.println(getSmallestNumber(array));
	
	/*Question 19
	 *Write and test a method that takes an array of double and returns the average
	 */
		double[] doubles = {42.50, 56.90, 60.90, 72.50};
		System.out.println(getAverageOfArray(doubles));
	/*Question 20
	 *Write and test  a method that takes an array of Strings  and returns an array of int where each element matches the length 
	 *of the string at that position
	 */
		int[] nameLengths = extractStringLengths(Names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
	
	/*Question 21
	 *Write and test a method that takes an array of strings and returns true if the sum of the letters for all strings with an even
	 *amount of letters is greater than the sum of t hose with an odd amount of letters
	 */
	
		System.out.println(hasMoreEvenWordCharacters(Names));
	
	/*Question 22
	 *Write and test a method that takes a string and returns true if the string is a palindrome
	 */
	
		System.out.println(isPalindrome("racecar"));
		
	
		
	
		
	
		
	
	
	
	}
	//Question 13 method
	public static void greet(String name) {
		System.out.println("Hello" + " " + name + "!");
	}
	
	//Question 14 method
	public static String greet2(String name) {
		return ("Hola" + " " + name + "!");
	}
	
	//Question 16 method
	public static boolean isStringLongerThanNumber(String string, int number) {
		if (string.length() > number) {
			return true;
		} else {
			return false; 
		}
	}
		//Or you could delete the else statement and just have the last line in the method be "return false;" 
		//This is because when writing a method the method ends after the last "return" 
		//FURTHER LEARNING TIP: Since the return is a boolean expression, you could just type:
			// return: string.length() > number;
			//Since this is a boolean expression already, it will automatically print out a true or false result.
		
	//Question 17 method
		public static boolean doesArrayContainString(String[]array, String string) {
			for (String str : array) {
				if (str.equals(string)) {
					return true;
				}
			}
			return false;
		}
	//Question 18 method
			public static int getSmallestNumber(int[] numbers) {
				int smallest = numbers[0];
				for (int number : numbers) {
					if (number < smallest) {
						smallest = number;
					}
				}
				return smallest;	
			}
	
	//Question 19 method
			public static double getAverageOfArray(double[] array) {
				double sum = 0;
				for (double number : array)
					sum += number;
			
			return sum / array.length;
}
	//Question 20 method
			public static int[] extractStringLengths(String[] strings) {
				int[] results = new int[strings.length];
				for (int i = 0; i < strings.length; i++) {
					results[i] = strings[i].length();
				}
				return results;
			}
	
	//Question 21 method
			public static boolean hasMoreEvenWordCharacters(String[] array) {
				int evenLetters = 0;
				int oddLetters = 0;
			for (String string : array) {	
			 if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
			return evenLetters > oddLetters;	
			}
		
	//Question 22 method
			public static  boolean isPalindrome(String string) {
				for (int i = 0; i < string.length(); i++) {
					if (string.charAt(i) != string.charAt(string.length() - i - 1))
						return false;
					}
					return true;	
}	
	}
	
