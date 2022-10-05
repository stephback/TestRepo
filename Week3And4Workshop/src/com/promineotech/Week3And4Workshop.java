package com.promineotech;

/* Order of questions during workshop: Question 1, 2, 12, and then 5
 * ***** When working question 5 make sure to mention we are reusing the 
 */

public class Week3And4Workshop {

	public static void main(String[] args) {

/* Question 1: Create an array of int called ages 
 * that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
 */	
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //creating an array of type int
		
/* Question 1a: Programmatically subtract the value of
 * the first element in the array from the value in the last element of the array 
 * (i.e. do not use ages[7] in your code). 
 * Print the result to the console. 
 */		
		System.out.println("\nQuestion# 1a:");	
		int lastElementMinusFirstElement = (ages[ages.length - 1] - ages[0]);//subtracting the first element from last element
		System.out.println(lastElementMinusFirstElement);//print out int value from above ^^^
		
/* Question 1b: Add a new age to your array 
 * and repeat the step above to ensure it is dynamic 
 * (works for arrays of different lengths). 	
 */
		System.out.println("\nQuestion# 1b:");	
		int[] ages2 = {3,9,23,64,2,8,28,93,100}; // creating a new array with added element to change the length
		int lastElementMinusFirstElement2 = ages2[ages2.length-1]- ages2[0]; //subtracting the first element from last element
		System.out.println(lastElementMinusFirstElement2); //print out int value from above ^^^
		
/* Question 1c: Use a loop to iterate through the array and calculate the average age. 
 * Print the result to the console.
 */
		System.out.println("\nQuestion# 1c:");	
		double sum = 0; // creating double variable to ensure we calculate the average (think 97.5% vs 97%)
		
		for(int x : ages) { // looping over each element in ages array using variable x (note: x is arbitrary so it could be any letter)
			sum += x; // for each iteration add the value of x (element value from ages array) to sum
		}
		System.out.println(sum/ages.length); // calculating the average in the System.out.println();
		
		
/* Question 2: Create an array of String called names that contains the following values: 
 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
 */
		System.out.println("\nQuestion# 2:");	
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // creating an array of type String called names
		
/* Question 2a: Use a loop to iterate through the array and 
 * calculate the average number of letters per name. 
 * Print the result to the console.
 */
		System.out.println("\nQuestion# 2a:");	
		int sum2 = 0; // creating a variable of type int to use in enhanced for-loop
									// This variable sum2 is used to add the number of characters in each element within the names array
		for(String str : names) { // for String str in names 			
			sum2 += str.length(); //add the string length of each element in the names array to sum2
			
		}
		
	System.out.println(sum2 / names.length); //calculate the average inside of the system.out.println();

/* Question 2b: Use a loop to iterate through the array again 
 * and concatenate all the names together, separated by spaces, and 
 * print the result to the console.
 */		
	    System.out.println("\nQuestion# 2b:");	
		String sumOfNames = ""; //creating a String variable called sumOfNames and setting value to empty string
					// This variable sumOfNames is used to add the names in each element within the names array
		for (String str : names) { // for String str in names
			sumOfNames += str + " "; // add the name of each element (with a space added) in the names array to sumOfNames 
	}

	System.out.println(sumOfNames); // prints the sumOfNames concatenated string to console
	
	
/* Question 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50. Hint: write method then come back here
 */
	System.out.println("\nQuestion# 12:");				
	
	boolean isHotOutside = true; // creating variable isHotOutside of type boolean
	double moneyInPocket = 20.00; // creating variable moneyInPocket of type double (because money is counted with decimals)
	
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); // calling method in System.out.println(); to ensure it works as expected
	
/* Question 5: Create a new array of int called nameLengths. 
 * Write a loop to iterate over the previously created names array and 
 * add the length of each name to the nameLengths array.
 */
	System.out.println("\nQuestion# 5:");
	
	int[] nameLengths = new int [names.length]; // creating an array of type int called nameLengths and 
												// setting it equal to a new int array and setting index length to [names.length] index
		for (int i = 0; i < names.length; i++) { // for index i = 0; if i is less than names.length; execute code within for-loop then increase i by 1
			nameLengths[i] = names[i].length(); // setting nameLengths array at index i equal to the length of names array at index i 
	}
		for (int x : nameLengths) { // iterating through the nameLengths array 
			System.out.println(x); // printing the value of x (length of name)each iteration
		}
	

	} // End of main method
	
// Question 12 method starts here. It is written outside of the main method scope but within the class scope
	
	public static boolean willBuyDrink(boolean arg, double num) { // creating method willBuyDrink that returns data type boolean 
		if (arg == true && num > 10.50) { // if arg is true and the value of num is greater than 10.50
			return true; // return true (this will only return true if the condition within our if statement is true
		}
			return false; // otherwise return false if the condition in the if statement evaluates to false
	}


} // End of class
