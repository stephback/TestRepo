package week3ArraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {

		// create an array with the following values 1, 5, 2, 8, 13, 6
		int [] array = new int[6];
		
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 11;
		array[5] = 6;
		
		// alternative way to assign values in an array
		int[] array2 = {1, 5, 2, 8, 11, 6};
		
		//print out the first element in the array
		System.out.println(array[0] + array2[0]);
		
		//print out the last element in the array (1 - length of array[])
		System.out.println(array[array.length - 1]);
		System.out.println(array2[array2.length - 1]);
		
		
		//print out the element in the array at position 6. What happens?
		//System.out.println(array[6]); // out of bounds exception thrown due to calling an index that does not exist in array
		
		//print out the element in the array at position -1. What happens?
		//System.out.println(array[-1]); // out of bounds exception thrown due to calling an index that does not exist in array
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} // end of for loop
		
		//write an enhanced for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum = 0;
		for(int number : array) {
			sum += number; //adding each number to sum
		}
		
		System.out.println(sum);
		
		//create a new variable called average and assign the average value of the array to it
		int average = sum / array.length;
		System.out.println(average);

		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int number : array) {
			if(number % 2 == 1) { //if number is odd (remainder when divided)
				System.out.println(number);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = { "Sam", "Sally", "Thomas", "Robert"};
		
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		
		System.out.println(sumOfLetters);
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Tim");
		greet("Tam");
		greet("Tom");
		
		//write and test a method that takes a String name and returns a greeting
		System.out.println(greet2("Paul"));
		String greeting = greet2("Peter");
		System.out.println(greeting);
		
		//analyze the difference between greet() and greet2() - how are they different?
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the String is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));
		
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(names, "Hello"));
		System.out.println(doesArrayContainString(names, "Sam"));
		
		//write and test a method that takes an int and returns the smallest number in the array
		System.out.println(findSmallestNumberInArray(array));
		System.out.println(findSmallestNumberInArray(array2));
		
		//write and test a method that takes an array of double and returns the average
		double[] doubles = {45.1, 33.3, 76.5};
		System.out.println(calculateAverage(doubles));
		
		//write and test a method that takes an array of Strings and returns an array of int where
		//each element matches the length of the string at that position
		int[] nameLengths = extractStringLengths(names);
		System.out.println(extractStringLengths(names));
		
String [] array4 = new String[6];
		
		array4[0] = "Bob";
		array4[1] = "Bill";
		array4[2] = "Bo";
		array4[3] = "Bib";
		array4[4] = "Bell";
		array4[5] = "Ann";
		
		System.out.println("Testing Josh's code:\n");
		System.out.println(array4);
		
		
	} // end of main method
	
	public static void greet(String name) {
		System.out.println("Hello," + name + "!");
	}
	
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;	
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public static int findSmallestNumberInArray(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if(number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for(double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for(int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	

} // end of class
