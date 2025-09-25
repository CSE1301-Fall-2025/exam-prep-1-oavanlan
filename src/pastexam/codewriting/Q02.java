package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area;
		System.out.print("What is the width of the rectangle: ");
		double width = scan.nextDouble();
		System.out.print("What is the height of the rectangle: ");
		double height = scan.nextDouble();
		area = width*height;
		System.out.println("The area of the rectangle is " + area + ".");
		while (area != 0) {
			System.out.print("What is the width of your next rectangle: ");
			width = scan.nextDouble();
			System.out.print("What is the height of your next rectangle: ");
			height = scan.nextDouble();
			area = width*height;
			System.out.println("The area of the rectangle is " + area + ".");
		}
		System.out.println("All finished.");
		scan.close();
		
	}
}
