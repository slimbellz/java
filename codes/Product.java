// Product program that inputs three numbers then displays their product.
import java.util.Scanner; // program uses class Scanner

public class Product
{
// main method begins execution of Java application
	public static void main(String[] args)
	{
// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		int number1; // first number to multiply
		int number2; // second number to multiply
		int number3; // third number to multiply
		int product; // product of number1, number2 and number3

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user
		
		System.out.print("Enter third integer: "); //prompt
		number3 = input.nextInt(); // read third number from user

		product = number1 * number2 * number3; // product numbers, then store total in product

		System.out.printf("Product is %d%n", product); // display product
	 } // end method main
} // end class Addition