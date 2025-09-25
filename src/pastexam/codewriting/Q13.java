package pastexam.codewriting;

import java.util.Scanner;

public class Q13 {

	/*
		We wish to write a program to help students learn multiplication. Code has been provided 
		that prompts the user to enter an integer value that they wish to practice multiplying.
		Your code should then prompt the user to enter the first 5 multiples of that value, in order. Example
		output might look like this:
		
		Which value would you like to practice multiplying?
		3
		Please enter the value of 3 * 1
		4
		Incorrect!
		Please enter the value of 3 * 1
		5
		Incorrect!
		Please enter the value of 3 * 1
		3
		Please enter the value of 3 * 2
		6
		Please enter the value of 3 * 3
		9
		Please enter the value of 3 * 4
		12
		Please enter the value of 3 * 5
		15
		Well done !
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Which value would you like to practice multiplying?");
		int m = in.nextInt();
		for (int multiple = 1; multiple < 6; multiple ++) {
			System.out.println("Please enter the value of " + m + " * " + multiple);
			int answer = in.nextInt();
			while (answer != m*multiple) {
				System.out.println("Incorrect!");
				System.out.println("Please enter the value of " + m + " * " + multiple);
				answer = in.nextInt();
			}
				
		//your code here

	}
	System.out.println("Well done!");
	in.close();	
}
}
